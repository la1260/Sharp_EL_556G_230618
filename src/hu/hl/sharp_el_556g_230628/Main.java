package hu.hl.sharp_el_556g_230628;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.ByteBuffer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main implements KeyListener, IInputListener, IStackListener {
	private JFrame frame;
	private JLabel label;
	private Input input;
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		frame= new JFrame();
		frame.setBounds(100, 200, 300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.addKeyListener(this);
		
		frame.add(label= new JLabel());
		label.setBounds(16, 16, 200, 16);
		label.setOpaque(true);
		label.setBackground(Color.YELLOW);
		label.setVisible(true);
		
		input= new Input(this, Type.Dec);
	}
	public void keyPressed(KeyEvent keyevent) {
		switch (keyevent.getKeyChar()) {
		case ',':
			keyevent.setKeyChar('.');
			break;
		case '/':
			keyevent.setKeyChar('\u0100');
			break;
		case '°':
			keyevent.setKeyChar('\u0101');
			break;
		default:
			switch (keyevent.getKeyCode()) {
			case KeyEvent.VK_ENTER:
				keyevent.setKeyChar('=');
				break;
			case KeyEvent.VK_F9:
				keyevent.setKeyChar('\u0102');
				break;
			case KeyEvent.VK_BACK_SPACE:
				keyevent.setKeyChar('\u0103');
				break;
			case KeyEvent.VK_ESCAPE:
				keyevent.setKeyChar('\u0104');
				break;
			case KeyEvent.VK_F5:
				keyevent.setKeyChar('\u0105');
				break;
			case KeyEvent.VK_F6:
				keyevent.setKeyChar('\u0106');
				break;
			case KeyEvent.VK_F7:
				keyevent.setKeyChar('\u0107');
				break;
			case KeyEvent.VK_F8:
				keyevent.setKeyChar('\u0108');
				break;
			}
		}
		frame.setTitle("send: "+keyevent.getKeyChar());
		input.key(keyevent.getKeyChar());
	}
	public void keyTyped(KeyEvent keyevent) {}
	public void keyReleased(KeyEvent keyevent) {}
	public void onChange(String s) {
		label.setText(s);
	}
}

enum Type {Dec, Cmf, Hms, Bin, Oct, Hex}

interface IInputListener {
	public void onChange(String s);
}

class Input {
	private final IInputListener iinputlistener;
	private String[] reg= {"0", "", ""};
	private int index= 0;
	private Type type;
	public Input(IInputListener iinputlistener, Type type) {
		this.iinputlistener= iinputlistener;
		this.type= type;
		update();
	}
	public void key(char key) {
		switch (key) {
/*		case 'f', 'e', 'd', 'c', 'b', 'a':
			if (!type.equals(Type.Hex)) break;
		case '9', '8':
			if (type.equals(Type.Oct)) break;
		case '7', '6', '5', '4', '3', '2':
			if (type.equals(Type.Bin)) break;
		case '1', '0':
			switch (type) {
			case Bin, Oct, Hex:
				if (index==0 && reg[0].equals("0")) reg[0]="";
				if (reg[0].length()<10) reg[0]+= key;
				break;
			case Dec:
				if (index==0 && reg[0].equals("0")) reg[0]="";
				if (index==0 && reg[0].equals("-0")) reg[0]="-";
				if (index==0 && reg[0].replace("-", "").length()<10 || index==1 && reg[0].replace("-", "").length()+reg[1].length()<10 || index==2) reg[index]+= key;
				if (index==2) reg[2]= reg[2].substring(1);
				break;
			case Cmf:
				if (reg[index].length()<3 && reg[0].replace("-", "").length()+reg[1].length()+reg[2].length()+index<10) reg[index]+= key;
				break;
			default:
				break;
			}
			break;*/
		case '.':
			if (type.equals(Type.Dec) && index<1) index= 1;
			break;
		case 'x':
			if (type.equals(Type.Dec) && index<2) {
				if (reg[0].equals("0") && reg[1].equals("")) reg[0]="1";
				index= 2;
				reg[2]= "00";
			}
			break;
		case '\u0100': // /
			switch (type) {
			case Dec:
				if (reg[0].replace("-", "") .length()<7 && index==0) {
					type= Type.Cmf;
					index= 1;
				}
				break;
			case Cmf:
				if (reg[0].replace("-", "").length()<4) index= 2;
				break;
			default:
				break;
			}
			break;
		case '\u0101': // °
			break;
		case '\u0102': // +-
			if (type.equals(Type.Dec) && index<2 || type.equals(Type.Cmf) || type.equals(Type.Hms)) {
				if (reg[0].contains("-")) reg[0]= reg[0].replace("-", "");
				else reg[0]= "-"+reg[0];
			} else if (type.equals(Type.Dec)) {
				if (reg[2].contains("-")) reg[2]= reg[2].replace("-", "");
				else reg[2]= "-"+reg[2]; 
			}
			break;
		case '\u0103': // backspace
			if (reg[index].isEmpty()) {
				index--;
				reg[index]= reg[index].substring(0, reg[index].length()-1);
				if (index==0) type= Type.Dec;
			} else {
				reg[index]= reg[index].substring(0, reg[index].length()-1);
			}
			if (reg[0].isEmpty()) reg[0]= "0";
			if (reg[0].equals("-")) reg[0]= "-0";
			break;
		case '\u0104': // reset
			reg= new String[]{"0", "", ""};
			index= 0;
			if (type.equals(Type.Cmf) || type.equals(Type.Hms)) type= Type.Dec;
			break;
		case '\u0105': // f5 - bin
			if (type.equals(Type.Dec) || type.equals(Type.Oct) || type.equals(Type.Hex)) type= Type.Bin;
			break;
		case '\u0106': // f6 - oct
			if (type.equals(Type.Dec) || type.equals(Type.Bin) || type.equals(Type.Hex)) type= Type.Oct;
			break;
		case '\u0107': // f7 - dec
			if (type.equals(Type.Oct) || type.equals(Type.Bin) || type.equals(Type.Hex)) type= Type.Dec;
			break;
		case '\u0108': // f8 - hex
			if (type.equals(Type.Dec) || type.equals(Type.Bin) || type.equals(Type.Oct)) type= Type.Hex;
			break;
		default:
			break;
		}
		update();
	}
	private void update() {
		iinputlistener.onChange(getType().name()+";"+reg[0]+";"+reg[1]+";"+reg[2]);
	}
	public Type getType() {
		return type;
	}
	public ByteBuffer getValue() {
		ByteBuffer result= ByteBuffer.allocate(16);
		return result;
	}
}