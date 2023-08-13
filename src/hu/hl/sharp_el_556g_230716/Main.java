package hu.hl.sharp_el_556g_230716;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;


public class Main implements KeyListener {
	private JFrame frame;
	private JLabel label0;
	private JLabel label1;
	private JLabel label2;
	private Calculator calculator;
	private static String fmt(BigDecimal bd, Fse fse, int tab) {
		DecimalFormat df= new DecimalFormat("0.000000000E00");
		int e= Integer.valueOf(df.format(bd).split("E")[1]);
		if (fse.equals(Fse.Eng)) {
			return "eng";
		} else if (fse.equals(Fse.Nrm) && -10<e && e<10) {
			return "nrm"; 
		} else if (fse.equals(Fse.Fix) && e<=-10) {
			return "0";
		} else if (fse.equals(Fse.Fix) && e<10) {
			return "fix";
		} else {
			return "sci";
		}
	}
	public static void main(String[] args) {
/*		BigDecimal bd0= new BigDecimal(9999999999.5);// 1e+10
		BigDecimal bd1= new BigDecimal(9999999999.4);// 9999999999
		
		BigDecimal bd2= new BigDecimal(0.000000001);// 0.000000001
		BigDecimal bd3= new BigDecimal(0.0000000009);// 9e-10

		BigDecimal bd4= new BigDecimal(-0.0000000009);// -9e-10
		BigDecimal bd5= new BigDecimal(-0.000000001);// -0.000000001
		
		BigDecimal bd6= new BigDecimal(-9999999999.4);// -9999999999
		BigDecimal bd7= new BigDecimal(-9999999999.5);// -1e+10
		
		
		System.out.println(fmt(bd0, Fse.Eng, 4));
		System.out.println(fmt(bd1, Fse.Eng, 4));
		System.out.println(fmt(bd2, Fse.Eng, 4));
		System.out.println(fmt(bd3, Fse.Eng, 4));
		System.out.println(fmt(bd4, Fse.Eng, 4));
		System.out.println(fmt(bd5, Fse.Eng, 4));
		System.out.println(fmt(bd6, Fse.Eng, 4));
		System.out.println(fmt(bd7, Fse.Eng, 4));*/
/*		
		DecimalFormat df= new DecimalFormat();
		df.setGroupingUsed(false);
		df.setMaximumIntegerDigits(10);
		df.setMinimumIntegerDigits(1);
		df.setMaximumFractionDigits(9);
		df.setMinimumFractionDigits(0);
		System.out.println(df.format(9999999999d));
		System.out.println(df.format(9999999999.5d));*/
		
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
		
		calculator = new Calculator();
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
		default:
			c= -1;
			break;
		}
		if (-1<c) {
			String[] s= calculator.key(c);
			label0.setText("");
			label1.setText(s[0]);
			label2.setText(s[1]);
		}
	}
	public void keyTyped(KeyEvent keyevent) {}
	public void keyReleased(KeyEvent keyevent) {}
}