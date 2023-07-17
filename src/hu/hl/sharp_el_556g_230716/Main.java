package hu.hl.sharp_el_556g_230716;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main implements KeyListener {
	private JFrame frame;
	private JLabel label0;
	private JLabel label1;
	private JLabel label2;
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
		
		frame.add(label0= new JLabel());
		label0.setBounds(16, 16, 32, 16);
		label0.setOpaque(true);
		label0.setBackground(Color.CYAN);
		label0.setVisible(true);

		frame.add(label1= new JLabel());
		label1.setBounds(56, 16, 96, 16);
		label1.setOpaque(true);
		label1.setBackground(Color.YELLOW);
		label1.setVisible(true);

		frame.add(label2= new JLabel());
		label2.setBounds(160, 16, 24, 16);
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		label2.setVisible(true);
		
//		calculator= new Calculator();
		keyPressed(new KeyEvent(frame, -1, -1, -1, KeyEvent.VK_ESCAPE)); //ez kell!!!

	}
	public void keyPressed(KeyEvent keyevent) {
		int i= (keyevent.getKeyChar()==KeyEvent.CHAR_UNDEFINED) ? keyevent.getKeyCode()+256 : keyevent.getKeyChar();
		int c= -1;
		switch (i) {
		case '0':
			c= 0;
			break;
		case '1':
			c= 1;
			break;
		case '2':
			c= 2;
			break;
		case '3':
			c= 3;
			break;
		case '4':
			c= 4;
			break;
		case '5':
			c= 5;
			break;
		case '6':
			c= 6;
			break;
		case '7':
			c= 7;
			break;
		case '8':
			c= 8;
			break;
		case '9':
			c= 9;
			break;
		case 'a':
		case 'A':
			c= 10;
			break;
		case 'b':
		case 'B':
			c= 11;
			break;
		case 'c':
		case 'C':
			c= 12;
			break;
		case 'd':
		case 'D':
			c= 13;
			break;
		case 'e':
		case 'E':
			c= 14;
			break;
		case 'f':
		case 'F':
			c= 15;
			break;
		case KeyEvent.VK_ESCAPE:
			c= 16;
			break;
		case ',':
		case '.':
			c= 17;
			break;
		case 'x':
			c= 18;
			break;
		case KeyEvent.VK_BACK_SPACE:
			c= 19;
			break;
		case KeyEvent.VK_F9+256: //±
			c= 20;
			break;
			
			
		case '=':
		case KeyEvent.VK_ENTER:
			c= 21;
			break;
		case '+':
			c= 22;
			break;
		case '-':
			c= 23;
			break;
		case '*':
			c= 24;
			break;
		case '/':
			c= 25;
			break;
		case '(':
			c= 26;
			break;
		case ')':
			c= 27;
			break;
		case '%':
			c= 28;
			break;
		case '!':
			c= 29;
			break;
		case '°':
			c= 30;
			break;
		case KeyEvent.VK_F5+256: //bin
			c= 31;
			break;
		case KeyEvent.VK_F6+256: //oct
			c= 32;
			break;
		case KeyEvent.VK_F7+256: //dec
			c= 33;
			break;
		case KeyEvent.VK_F8+256: //hex
			c= 34;
			break;
		}
	}
	public void keyTyped(KeyEvent keyevent) {}
	public void keyReleased(KeyEvent keyevent) {}
}