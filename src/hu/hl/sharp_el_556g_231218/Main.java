package hu.hl.sharp_el_556g_231218;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.stream.IntStream;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main extends Calculator2 {
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		
	}
	public void keyPressed(KeyEvent keyevent) {
		switch (getKeyComm(keyevent)) {
		case Back:
			removeInput();
			break;
		case Bin:
			break;
		case C:
			clear();
			break;
		case Dec:
			break;
		case Dot:
			tofract();
			break;
		case Equals:
			break;
		case Exp:
			toInputExp();
			break;
		case Hex:
			break;
		case K0:
			add('0'); 
			break;
		case K1:
			add('1'); 
			break;
		case K2:
			add('2'); 
			break;
		case K3:
			add('3'); 
			break;
		case K4:
			add('4'); 
			break;
		case K5:
			add('5'); 
			break;
		case K6:
			add('6'); 
			break;
		case K7:
			add('7'); 
			break;
		case K8:
			add('8'); 
			break;
		case K9:
			add('9'); 
			break;
		case KA:
			break;
		case KB:
			break;
		case KC:
			break;
		case KD:
			break;
		case KE:
			break;
		case KF:
			break;
		case Sign:
			toggleInputSign();
			break;
		case Oct:
			break;
		case Unkn:
			break;
		default:
			break;
		}
		out(getInputString());
	}
}

class Calculator2 extends Calculator1 {
	private StringBuilder signint= new StringBuilder();
	private StringBuilder signexp= new StringBuilder();
	private StringBuilder integer= new StringBuilder();
	private StringBuilder fract= new StringBuilder();
	private StringBuilder exp= new StringBuilder();
	private StringBuilder curr_sign;
	private StringBuilder curr_input; 
	public Calculator2() {
		clear();
		out(getInputString());
	}
	protected void clear() {
		curr_input= integer.delete(0, integer.length()).append("0");
		fract.setLength(0);
		exp.setLength(0);
		curr_sign= signint.delete(0, signint.length());
		signexp.setLength(0);
	}
	protected void add(char ch) {
		if (curr_input==integer || curr_input==fract) {
			if (curr_input==integer && integer.toString().equals("0")) {
				integer.setLength(0);
			}
			if (integer.length()+fract.length()<10 && !(curr_input==integer && integer.toString().equals("0") && ch=='0')) {
				curr_input.append(ch);
			}
		} else {
			curr_input.append(ch).deleteCharAt(0);
		}
	}
	protected void tofract() {
		if (curr_input==integer) {
			curr_input= fract;
		}
	}
	protected void toInputExp() {
		if (curr_input==integer || curr_input==fract) {
			curr_input= exp;
			curr_sign= signexp;
			if (integer.toString().equals("0") && fract.isEmpty() && signint.isEmpty()) {
				integer.delete(0, integer.length()).append("1");
			}
			curr_input.append("00");
		}
	}
	protected void toggleInputSign() {
		if (curr_sign.isEmpty()) {
			curr_sign.append('-');
		} else {
			curr_sign.setLength(0);
		}
	}
	protected void removeInput() {
		if (curr_input==integer && !curr_input.toString().equals("0") || curr_input==fract) {
			if (curr_input==fract && curr_input.length()==0) {
				curr_input= integer;
			}
			curr_input.deleteCharAt(curr_input.length()-1);
			if (integer.isEmpty()) {
				integer.append("0");
				curr_sign.setLength(0);
			}
		} else if (curr_input==exp) {
			curr_input.insert(0, '0').deleteCharAt(2);
		}
	}
	protected BigDecimal getInputValue() {
		if (curr_input==integer) {
			return new BigDecimal(signint.toString()+integer.toString());
		} else if (curr_input==fract) {
			return new BigDecimal(signint.toString()+integer.toString()+"."+fract.toString());
		} else {
			return new BigDecimal(signint.toString()+integer.toString()+"."+fract.toString()+"e"+signexp.toString()+exp.toString());
		}
	}
	protected String[] getInputString() {
		return new String[] {"", signint.toString()+integer.toString()+"."+fract.toString(), signexp.toString()+exp.toString()};
	}
}

class Calculator1 extends Calculator0 implements KeyListener {
	private JFrame frame;
	private JLabel[] label= new JLabel[3];
	public Calculator1() {
		frame= new JFrame();
		frame.setBounds(100, 200, 300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.addKeyListener(this);
		IntStream.range(0, 3).forEach(i -> {
			frame.add(label[i]= new JLabel());
			label[i].setOpaque(true);
			label[i].setVisible(true);
			label[i].setHorizontalAlignment(SwingConstants.RIGHT);
			label[i].setFont(new Font("Monospaced", label[i].getFont().getStyle(), label[i].getFont().getSize()));
			switch (i) {
			case 0:
				label[i].setBounds(16, 16, 32, 16);
				label[i].setBackground(Color.CYAN);
				break;
			case 1:
				label[i].setBounds(56, 16, 96, 16);
				label[i].setBackground(Color.YELLOW);
				break;
			case 2:
				label[i].setBounds(160, 16, 24, 16);
				label[i].setBackground(Color.GREEN);
				break;
			}
		});
	}
	public void out(String[] outstring) {
		Iterator<String> i= Arrays.asList(outstring).iterator(); 
		Arrays.stream(label).forEach(l -> l.setText(i.next()));
	}
	public void keyPressed(KeyEvent keyevent) {}
	public void keyTyped(KeyEvent keyevent) {}
	public void keyReleased(KeyEvent keyevent) {}	
}

class Calculator0  {
	private static final TreeMap<Character, KeyComm> keychar= new TreeMap<Character, KeyComm>();  
	private static final TreeMap<Integer, KeyComm> keycode= new TreeMap<Integer, KeyComm>();
	protected static enum Mode {NormHex, NormDec, NormOct, NormBin, Vle3, CplxXY, CplxPol, Stat0, Stat1, Stat2, Stat3, Stat4, Stat5, Stat6};
	protected static enum Fse {Nrm, Fix, Sci, Eng};
	protected static enum Tab {Tab0, Tab1, Tab2, Tab3, Tab4, Tab5, Tab6, Tab7, Tab8, Tab9};
	protected static enum KeyComm {C, K0, K1, K2, K3, K4, K5, K6, K7, K8, K9, KA, KB, KC, KD, KE, KF, Dot, Exp, Equals, Back, Sign, Bin, Oct, Dec, Hex, Unkn};
	static {
		keychar.put('0', KeyComm.K0);
		keychar.put('1', KeyComm.K1);
		keychar.put('2', KeyComm.K2);
		keychar.put('3', KeyComm.K3);
		keychar.put('4', KeyComm.K4);
		keychar.put('5', KeyComm.K5);
		keychar.put('6', KeyComm.K6);
		keychar.put('7', KeyComm.K7);
		keychar.put('8', KeyComm.K8);
		keychar.put('9', KeyComm.K9);
		keychar.put(',', KeyComm.Dot);
		keychar.put('.', KeyComm.Dot);
		keychar.put('x', KeyComm.Exp);
		keychar.put('=', KeyComm.Equals);
/*		keychar.put('+', 22);
		keychar.put('-', 23);
		keychar.put('*', 24);
		keychar.put('/', 25);
		keychar.put('(', 26);
		keychar.put(')', 27);
		keychar.put('%', 28);
		keychar.put('!', 29);
		keychar.put('°', 30);
*/		
		keycode.put(KeyEvent.VK_A, KeyComm.KA);
		keycode.put(KeyEvent.VK_B, KeyComm.KB);
		keycode.put(KeyEvent.VK_C, KeyComm.KC);
		keycode.put(KeyEvent.VK_D, KeyComm.KD);
		keycode.put(KeyEvent.VK_E, KeyComm.KE);
		keycode.put(KeyEvent.VK_F, KeyComm.KF);
		keycode.put(KeyEvent.VK_ESCAPE, KeyComm.C);
		keycode.put(KeyEvent.VK_BACK_SPACE, KeyComm.Back);
		keycode.put(KeyEvent.VK_F9, KeyComm.Sign);
		keycode.put(KeyEvent.VK_ENTER, KeyComm.Equals);
		keycode.put(KeyEvent.VK_F5, KeyComm.Bin); //bin
		keycode.put(KeyEvent.VK_F6, KeyComm.Oct); //oct
		keycode.put(KeyEvent.VK_F7, KeyComm.Dec); //dec
		keycode.put(KeyEvent.VK_F8, KeyComm.Hex); //hex
	}
	protected KeyComm getKeyComm(KeyEvent keyevent) {
		return keychar.getOrDefault(keyevent.getKeyChar(), keycode.getOrDefault(keyevent.getKeyCode(), KeyComm.Unkn));
	}
}
