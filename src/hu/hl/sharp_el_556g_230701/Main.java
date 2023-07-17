package hu.hl.sharp_el_556g_230701;

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
	private Calculator calculator;
	public static void main(String[] args) {
/*		ByteBuffer b= ByteBuffer.allocate(8);
//		b.putDouble(9999999999d);
		b.putDouble(0, 1d);
		b.putDouble(0, 2d);
		b.putDouble(0, 4d);
		b.putDouble(0, 1073741824d);
		
		System.out.println(0.04d-0.03d);
		BigDecimal d1= new BigDecimal("0.04");
		BigDecimal d2= d1.subtract(new BigDecimal("0.03"));
		System.out.println(d2);*/
		
//		DecimalFormat 
//		df= new DecimalFormat("00.000E00"); System.out.println(df.format(12345));


/*		BigDecimal d0= new BigDecimal("10");
//		BigDecimal d= new BigDecimal("1e-10").add(new BigDecimal("1e-15")) ;
		BigDecimal d= new BigDecimal("12345e-10");
		while (d.doubleValue()<1e+11) {
			String[] res= print(d, Base.Dec, Fse.Eng, 8);
			System.out.println(res[0]+" e:"+res[1]);
			d= d.multiply(d0);
		}*/
/*		BigDecimal
		d= new BigDecimal("123456789.01234567890");
		d= d.round(new MathContext(10, RoundingMode.HALF_UP)).stripTrailingZeros();
		System.out.println(d.toPlainString());
		
		System.exit(4);
		System.out.println("prec\tscale\telotte\tutana\tvalue");
		
//		BigDecimal
/*		d= new BigDecimal("0.010000"); f(d);
		d= new BigDecimal("0.100"); f(d);
		d= new BigDecimal("1"); f(d);
		d= new BigDecimal("010"); f(d);
		d= new BigDecimal("100"); f(d);
		d= new BigDecimal("1000"); f(d);

		d= new BigDecimal("0.01100"); f(d);
		d= new BigDecimal("0.110"); f(d);
		d= new BigDecimal("1.10"); f(d);
		d= new BigDecimal("11"); f(d);
		d= new BigDecimal("110"); f(d);
		d= new BigDecimal("1100"); f(d);

		d= new BigDecimal("0.0111"); f(d);
		d= new BigDecimal("0.111"); f(d);
		d= new BigDecimal("1.11"); f(d);
		d= new BigDecimal("11.1"); f(d);
		d= new BigDecimal("111"); f(d);
		d= new BigDecimal("1110"); f(d);

		d= new BigDecimal("0.01111"); f(d);
		d= new BigDecimal("0.1111"); f(d);
		d= new BigDecimal("1.111"); f(d);
		d= new BigDecimal("11.11"); f(d);
		d= new BigDecimal("111.1"); f(d);
		d= new BigDecimal("1111"); f(d);

		d= new BigDecimal("0.006666666666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("0.06666666666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("0.6666666666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("6.666666666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("66.66666666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("666.6666666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("6666.666666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("66666.66666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("666666.6666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("6666666.666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("66666666.66"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("666666666.6"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("6666666666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("66666666660"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("666666666600"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);		
		System.out.println();
		d= new BigDecimal("0.0066666666666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("0.066666666666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("0.66666666666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("6.6666666666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("66.666666666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("666.66666666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("6666.6666666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("66666.666666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("666666.66666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("6666666.6666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("66666666.666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("666666666.66"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("6666666666.6"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("66666666666"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("666666666660"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
		d= new BigDecimal("6666666666600"); System.out.println(f(d, Base.Dec, Fse.Nrm, -1)[0]+"\t"+f(d, Base.Dec, Fse.Nrm, -1)[1]);
*/		
		new Main();
	}
/*	private static String[] f(BigDecimal bd, Base base, Fse fse, int tab) {
		fse= Fse.Sci;
		String[] result= {null, null};
		int exp= bd.precision()-bd.scale()-1;
		switch (fse) {
		case Nrm:
			bd= bd.stripTrailingZeros().round(new MathContext(Integer.min(10, 10+exp), RoundingMode.HALF_UP));
			if (-10<exp && exp<10) {
				result[0]= bd.toPlainString();
				result[1]= "";
			} else {
				result= bd.toString().split("E");
			}
			if (!result[0].contains(".")) {
				result[0]+= ".";
			}
			break;
		case Sci:
			DecimalFormat df= new DecimalFormat();
			df.applyPattern("#.#E00");
			bd= bd.stripTrailingZeros().round(new MathContext(Integer.min(10, 10+exp), RoundingMode.HALF_UP));
			result=df.format(bd).split("E");
			if (!result[0].contains(".")) {
				result[0]+= ".";
			}
			break;
		}
		return result;
	}*/
	enum Base {Bin, Oct, Dec, Hex}
	enum Fse {Nrm, Fix, Sci, Eng}

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
		
		calculator= new Calculator();
		keyPressed(new KeyEvent(frame, -1, -1, -1, KeyEvent.VK_ESCAPE)); //ez kell!!!
		
/*		keyPressed(new KeyEvent(frame, -1, -1, -1, '1'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '+'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '*'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '2'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '='));
*/
/*		keyPressed(new KeyEvent(frame, -1, -1, -1, '1'));
//		keyPressed(new KeyEvent(frame, -1, -1, -1, '*'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '+'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '2'));
//		keyPressed(new KeyEvent(frame, -1, -1, -1, '*'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '('));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '3'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '+'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '4'));
//		keyPressed(new KeyEvent(frame, -1, -1, -1, '*'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '('));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '5'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '-'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '6'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, ')'));
//		keyPressed(new KeyEvent(frame, -1, -1, -1, '*'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '('));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '7'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '-'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '8'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, ')'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, ')'));
		keyPressed(new KeyEvent(frame, -1, -1, -1, '='));
*/
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
		String[] s= calculator.key(c);
		label0.setText("");
		label1.setText(s[0]);
		label2.setText(s[1]);
	}
	public void keyTyped(KeyEvent keyevent) {}
	public void keyReleased(KeyEvent keyevent) {}
}