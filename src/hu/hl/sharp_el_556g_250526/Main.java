package hu.hl.sharp_el_556g_250526;

import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.IntStream;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	private Calculator calculator;
	private JLabel[] label= {new JLabel(), new JLabel(), new JLabel(), new JLabel(), new JLabel()};
	public static void main(String[] args) {
		new Main();
//		String s= ll.stream().collect(() -> new StringBuilder(), (a, b) -> a.append(b), (c, d) -> {}).toString();
//		System.out.printf("%s,%b,%n", s, ll.contains('e'));
}
	public Main() {
		JFrame frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 200, 300, 400);
		frame.setVisible(true);
		frame.setLayout(null);
		
		label[0].setBounds(16, 16, 40, 24);
		label[0].setVisible(true);
		label[0].setLayout(null);
		label[0].setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(label[0]);
		label[1].setBounds(64, 16, 152, 24);
		label[1].setVisible(true);
		label[1].setLayout(null);
		label[1].setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(label[1]);
		label[2].setBounds(16, 48, 200, 24);
		label[2].setVisible(true);
		label[2].setLayout(null);
		label[2].setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(label[2]);
		label[3].setBounds(16, 80, 200, 24);
		label[3].setVisible(true);
		label[3].setLayout(null);
		label[3].setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(label[3]);		
		label[4].setBounds(16, 112, 200, 24);
		label[4].setVisible(true);
		label[4].setLayout(null);
		label[4].setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(label[4]);
		
		frame.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyevent) {
				char k= keyevent.getKeyChar();
				switch (keyevent.getKeyCode()) {
				case 44: case 110: k= '.'; break;
				case 10: k= '='; break;
				case 16:
				case 27: return;
				}
				calculator.key(k);
				label[0].setText(calculator.displays[0]);
				label[1].setText(calculator.displays[1]);
				label[2].setText(String.format("%s;%s;%s", 
					calculator.getDrg(),
					((calculator.isN2df()) ? "2ndF" : ""),
					((calculator.isHyp()) ? "HYP" : "")
				));
				label[3].setText(calculator.displays[4]);
				label[4].setText(calculator.displays[5]);
			}
			public void keyReleased(KeyEvent keyevent) {
			}
			public void keyTyped(KeyEvent keyevent) {
			}
		});		
		calculator= new Calculator();
		"2+3o+7=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //18
		"2+9+7=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //18
		"2+3o".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //9
		"+7=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //18
		"5(2+3)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //25
		"5*(2+3)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //25
		"5/(2+3)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //1
		"5o(2+3)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //125
		"5o*(2+3)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //125
		"5o/(2+3)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //5
		"2(3(4(5(6(7(8))))))=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //40320
		"3+9)(5+7)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //144
		"1+2*(3+4(5-6)(7-8))=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //15
		"8/2*15y/((5-8)-7)+9+6*3=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //33
		"((2+3)*8)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //40
		"1/(1/12+1/6)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //4
		"(2+3)(5+7)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //60
		"(2+3)o(5+7)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //300
		"(2+3)o".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //25
		"(2)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //50
		"(2+3)(5+7))(9)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //540
		"(12ao+6ao)ao".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //4
		"6oas=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //113.09733552923255
		"3f3+9f12*4f5=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //63
		"3=(9)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //9
		"3=o(9)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //81
		"12+(5*7))(11)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //517
		"asas=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //9.869604401089358
		"2*15as=/as=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //30
		"4+3al=4+(5-(8-(5al)))=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //121
		"3+as8=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //11
		"6.48=-o12of12as=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //-31.219111843077517
		"4+5(9)y=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //-41
		"9=/(1+2)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //3
		"3+(5-()7))=".chars().forEach(i -> calculator.key((char) i)); System.out.println("=="); //1
		"3+(8+(llee0lf".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //( _
		"f2+7+5l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //9.45
		"2+(7*5)l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //2.7
		"2+(7*5*11)l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("=="); //9.7
		"2+7*5l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //2.35
		"2*7*5l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0.7
		"5+5l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //5.25
		"6+l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //+_
		"f6+8l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //6.48
		"1+8*al9=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //73
		"lllf2+3l=f2*9l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0.18
		"n(7+9)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //6.788225099390856
		"9n9=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //27
		"(2+3)n(2*67+5*7)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //65
		"9=n=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //3
		"fn8=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //2.8284271247461903
		"*n8=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //8.000000000000002
		"f.0625=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0.0625
		"nao=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //4
		"an8000=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //20
		"fm8=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0
		"fam8=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //Er2
		"f(7+2)mn64=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //43046721
		"4aoam(3-8)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //625
		"3+m2(2m3)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //72
		"f33-y7=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //40
		"2asn(10sy6*100sy9)=ao".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //159154.94309189534
		"3asf".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0.0
		"8=aq=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //2980.9579870417283
		"agj8ao=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0.125657214
		"agj8=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //Er2
		"f9ac".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0.15707963267948966
		"ac".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //10
		"ac".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //9
		"fh(9*10)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //1
		"fai2ao=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //60
		"5-6mn144*.25=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //-5.44195579E8
		"casacac".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //180
		"d03*d30=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //81.5374894915
		"10*d01=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //2.99792458E9

/*		"f1+e==e==(6(7))==".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //44
		"f3+e5+9=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //17
		"f3+e===6*8=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //51
		"1-e===e6*8==".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //-47 -47
*/				
	}	
}

class LinkedList extends java.util.LinkedList<Character> {
	private static final long serialVersionUID = 1L;
	public String toString() {
		return stream().collect(() -> new StringBuilder(), (stringbuilder, chr) -> stringbuilder.append(chr), (c, d) -> {}).toString();		
	}
}

class Calculator {
	private LinkedList[] input= {new LinkedList(), new LinkedList()};
	private Stack<Integer> instructions= new Stack<Integer>(); //Values eleminek száma + input[0] (1 ha van, 0 ha üres) == instructions elemeinek száma + 1  
	private Stack<Double> values= new Stack<Double>();
	private Error error;
	private boolean n2df;
	private boolean hyp;
	private int drg= 0;
	private boolean isinputinprogress;
	private int zlevel;
	
	private boolean cnst;
	private int mode;
	private int kmode; //0=norm; 1=x.?; 2=?.x;
	private int kinstruction;
	private double kvalue;
	private int resultindex;
	
	public String[] displays= {"", "", "", "", "", ""};
	public Calculator() {
		mode= 0;
		key('f');
	}
	public void key(char key) {
		try {
			switch (key) {
			case 'f':
//				if (n2df) {
//					//OFF
//				} else {
					goInputToValues();
					if (!instructions.isEmpty() && (instructions.peek() & 63)!=6 && isMoreValuesThanInstructions()) { //CE: leglább egy utasítás van eltárolva, és az nem konstans inplicit szorzása (pl. 3pi) és értékre végződik a kifejezés.
						values.pop();
						displays[1]= "_";
					} else {
						input[0].clear();
						input[0].add('0');
						instructions.clear();
						values.clear();
						values.push(0d);
						error= null;
						hyp= false;
						cnst= false;
						isinputinprogress= false;
						zlevel= -1;
						kmode= 0;
						resultindex= 0;
						displays[0]= "    ";
						displays[1]= String.format("%s", String.valueOf(values.peek()));
					}
//				}
				break;
			case 'a':
				n2df= !n2df;
				break;
			case 'g':
				if (error==null) {
					hyp= !hyp;
				}
				break;
			case 'c':
				if (error==null) {
					if (drg==2) {
						drg= 0;
					} else {
						drg++;
					}					
					if (n2df) {
						if (goInputToValues()) {
							execute0(0, 0);
							zlevel= 0;
							switch (drg) {
							case 0:
								values.push(0.9);
								displays[0]= " >D ";
								break;
							case 1:
								values.push(Math.PI/180);
								displays[0]= " >R ";
								break;
							case 2:
								values.push(180/Math.PI/0.9);
								displays[0]= " >G ";
								break;
							}
							instructions.push(4);
							execute0(0, 0);
							displays[1]= String.format("%s", String.valueOf(values.peek()));
						}
						
					}
					n2df= false;
					hyp= false;
				}
				break;
			default:
				if (error==null) {
					if (!n2df && input(key)) {}
					else if (oneop(key)) {}
					else if (simplearithmetics(key)) {}
					n2df= false;
					hyp= false;
				}
			}
			
		} catch (Error error) {
			n2df= false;
			hyp= false;
			displays[0]= "    ";
			displays[1]= error.toString();
			this.error= error;
		} catch (Exception exception) {
			exception.printStackTrace(System.out);
		}
		System.out.printf("'%s;%s;%s;%s;%s;%s;%s;%s;%s%n", key, input[0].toString(), values, instructions, isinputinprogress, 0<zlevel, zlevel, displays[0], displays[1]);
		displays[3]= String.format("%s", input[0].toString());
		displays[4]= values.toString();
		displays[5]= instructions.toString();
	}
	private boolean input(char c) {
		Stack<Character> cp= new Stack<Character>();
		switch (c) {
		case '.':
			if (!cnst) {
				if (!isinputinprogress) {
					input('0');
				}
				if (!input[0].contains('.') && !input[0].contains('e')) {
					input[0].add('.');
				}
			}
			break;
		case 's':
			if (!cnst) {
				if (!isinputinprogress) {
					input('1');
				}
				if (!input[0].contains('e')) {
					input[0].add('e');
					input[0].add('0');
					input[0].add('0');
				}
			}
			break;
		case 'y':
			if (!cnst) {
				if (isinputinprogress) {
					if (input[0].contains('e')) {
						cp.push(input[0].removeLast());
						cp.push(input[0].removeLast());
						if (input[0].getLast().equals('e')) {
							input[0].add('-');
						} else {
							input[0].removeLast();
						}
						input[0].add(cp.pop());
						input[0].add(cp.pop());
					} else {
						if (cp.push(input[0].removeFirst())!='-') {
							input[0].addFirst(cp.pop());
							input[0].addFirst('-');
						} else {
							cp.pop();
						}
					}
				} else {
					return false;
				}
			}
			break;
		case 'e':
			if (!cnst) {
				if (isinputinprogress) {
					if (input[0].contains('e')) {
						input[0].removeLast();
						cp.push(input[0].removeLast());
						input[0].add('0');
						input[0].add(cp.pop());
					} else {
						if (input[0].removeLast().equals('.')) {
							input[0].removeLast();
						}
						if (input[0].toString().equals("-")) {
							input[0].removeLast();
						}
						if (input[0].isEmpty()) {
							input[0].add('0');
						}
					}
				} else {
					return false;
				}
			}
			break;
		case '0':
			if (!cnst) {
				if (!inputa() && input[0].stream().filter(j -> j!='-' && j!='.').count()<10) {
					input[0].add('0');
				}
			} else {
				inputb(c);
				return true;
			}
			break;
		case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
			if (!cnst) {
				if (inputa()) {
					input[0].removeLast();
				}
				if (input[0].stream().filter(j -> j!='-' && j!='.').count()<10) {
					input[0].add(c);
				}
			} else {
				inputb(c);
				return true;
			}
			break;
		default:
			return false;
		}
		if (!cnst) {
			displays[0]= (((instructions.isEmpty()) ? 1 : instructions.peek()>>6) < zlevel) ? "  ( " : (instructions.isEmpty()) ? "    " : instructionToFunctionDisplay(instructions.peek());  
			displays[1]= String.format("%s", input[0].toString());
		}
		return true;
	}
	private boolean inputa() {
		isinputinprogress= true;
		if (isMoreValuesThanInstructions()) {
			values.pop();
		}
		if (input[0].contains('e')) {
			char c= input[0].removeLast();
			input[0].removeLast();
			input[0].add(c);
		}
		return input[0].toString().equals("0") || input[0].toString().equals("-0"); 
	}
	private void inputb(char c) {
		if (input[1].isEmpty() && c<'4' || !input[1].isEmpty() && 0<Integer.valueOf(input[1].toString()+c) && Integer.valueOf(input[1].toString()+c)<33) {
			input[1].add(c);
		}
		switch (input[1].size()) {
		case 1:
			displays[1]= String.format("01-32 [%s_]", input[1].toString());
			break;
		case 2:
			displays[1]= String.format("01-32 [%s]", input[1].toString());
			//sleep
			cnst= false;
			if (isMoreValuesThanInstructions()) {
				values.pop();
			}
			switch (Integer.valueOf(input[1].toString())) {
			case  1: values.push(2.99792458e+08); break;
			case  2: values.push(6.67259e-11); break;
			case  3: values.push(9.80665); break;
			case  4: values.push(9.1093897e-31); break;
			case  5: values.push(1.6726231e-27); break;
			case  6: values.push(1.6749286e-27); break;
			case  7: values.push(1.8835327e-28); break;
			case  8: values.push(1.6605402e-27); break;
			case  9: values.push(1.60217733e-19); break;
			case 10: values.push(6.6260755e-34); break;
			case 11: values.push(1.380658e-23); break;
			case 12: values.push(1.256637061e-06); break;
			case 13: values.push(8.854187817e-12); break;
			case 14: values.push(2.81794092e-15); break;
			case 15: values.push(7.29735308e-03); break;
			case 16: values.push(5.29177249e-11); break;
			case 17: values.push(1.097373153e+07); break;
			case 18: values.push(2.06783461e-15); break;
			case 19: values.push(9.2740154e-24); break;
			case 20: values.push(9.2847701e-24); break;
			case 21: values.push(5.0507866e-27); break;
			case 22: values.push(1.41060761e-26); break;
			case 23: values.push(9.6623707e-27); break;
			case 24: values.push(4.4904514e-26); break;
			case 25: values.push(2.42631058e-12); break;
			case 26: values.push(1.32141002e-15); break;
			case 27: values.push(5.67051e-08); break;
			case 28: values.push(6.0221367e+23); break;
			case 29: values.push(2.24141e-02); break;
			case 30: values.push(8.31451); break;
			case 31: values.push(9.6485309e-04); break;
			case 32: values.push(2.58128056e+04); break;				
			}
			displays[0]= (((instructions.isEmpty()) ? 1 : instructions.peek()>>6) < zlevel) ? "  ( " : (instructions.isEmpty()) ? "    " : instructionToFunctionDisplay(instructions.peek());  
			displays[1]= String.format("%s", String.valueOf(values.peek()));
			input[0].clear();
			input[1].clear();			
			break;
		}
	}
	private boolean simplearithmetics(char key) throws Error {
		switch (key) {
		case 'y':
			if (!cnst) {
				if (isMoreValuesThanInstructions() && values.peek()!=0) {
					values.push(-values.pop());
					displays[1]= String.format("%s", String.valueOf(values.peek()));
				} else {
					if (!cnst) {
						if (n2df) {
							System.out.println("tab");
						} else {
							execute1c(12);
						}
					}
				}
			}
			return true;
/*		case 'e':
			if (zlevel==1) {
				System.out.println("KMODE");
			}
			return true;
*/		case '+':
			if (!cnst) {
				execute1a(2);
			}
			return true;
		case '-':
			if (!cnst) {
				execute1a(3);
			}
			return true;
		case '*':
			if (!cnst) {
				execute1a(4);
			}
			return true;
		case '/':
			if (!cnst) {
				execute1a(7);
			}
			return true;
		case '=':
			if (!cnst) {
				if (goInputToValues()) {
					execute0(0, 0);
					zlevel= 0;
					displays[0]= "    ";
					displays[1]= String.format("%s", String.valueOf(values.peek()));
				}
			}
			return true;
		case '(':
			if (!cnst) {
				if (zlevel<17) {
					execute1b(5);
					displays[0]= "  ( ";
					zlevel++;
				} else {
					throw new Error("Er3");
				}
			}
			return true;
		case ')':
			if (!cnst) {
				if (goInputToValues()) { //Ha értékből eggyel több van, mint utasításból, akkor az aktuális zlevel-nél magasabb műveleteket elvégezzük, zlevel-t csökkentjük. 
					execute0(0, zlevel);
					if (1<zlevel) {
						zlevel--;
					}
					displays[0]= (((instructions.isEmpty()) ? 1 : instructions.peek()>>6) < zlevel) ? "  ( " : (instructions.isEmpty()) ? "    " : instructionToFunctionDisplay(instructions.peek());  
					displays[1]= String.format("%s", String.valueOf(values.peek()));
				}
			}
			return true;
		case 'h':
			if (!cnst) {
				if (n2df) {
					if (hyp) {
						execute1c(24); //asinh
					} else { 
						execute1c(14); //sin-1
					}
				} else {
					if (hyp) {
						execute1c(23); //sinh
					} else { 
						execute1c(13); //sin
					}
				}
			}
			return true;
		case 'i':
			if (!cnst) {
				if (n2df) {
					if (hyp) {
						execute1c(26); //acosh
					} else { 
						execute1c(16); //cos-1
					}
				} else {
					if (hyp) {
						execute1c(25); //cosh
					} else {
						execute1c(15); //cos
					}
				}
			}
			return true;
		case 'j':
			if (!cnst) {
				if (n2df) {
					if (hyp) {
						execute1c(28); //atanh
					} else {
						execute1c(18); //tan-1
					}
				} else {
					if (hyp) {
						execute1c(27); //tanh
					} else {
						execute1c(17); //tan
					}
				}
			}
			return true;
		case 'n':
			if (!cnst) {
				if (n2df) {
					execute1c(11);
				} else {
					execute1c(10);
				}
			}
			return true;
		case 'p':
			if (!cnst) {
				if (n2df) {
					execute1c(20); //10x
				} else {
					execute1c(19); //log
				}
			}
			return true;
		case 'q':
			if (!cnst) {
				if (n2df) {
					execute1c(22); //ex
				} else {
					execute1c(21); //ln
				}
			}
			return true;
		default:
			return false;
		}
	}
	private boolean oneop(char key) throws Error {
		switch (key) {
		case 'o':
			if (!cnst && goInputToValues()) {
				if (zlevel==0) {
					zlevel= 1;
				}
				if (n2df) {
					double d= values.pop();
					values.push(1d);
					values.push(d);
					instructions.push(7 | (zlevel+1)<<6);
				} else {
					values.push(values.peek());
					instructions.push(4 | (zlevel+1)<<6);
				}
				execute0(0, zlevel+1);
				displays[1]= String.format("%s", String.valueOf(values.peek()));
			}
			return true;
		case 'l':
			if (!cnst && goInputToValues()) {
				if (n2df) {
					int i= (int) Math.round(values.peek());
					if (values.pop()==i && 0<=i && i<70) {
						values.push(1d);
						IntStream.range(1, i+1).forEach(x -> values.push(values.pop()*x));
						displays[1]= String.format("%s", String.valueOf(values.peek()));
					} else {
						throw new Error("Er2");
					}
				} else {
					double d= values.pop()/100;
					if (instructions.isEmpty()) {
						if (zlevel==0) {
							zlevel= 1;
						}
					} else {
						if ((instructions.peek() & 63)<4) {
							d*= values.peek();
						}
					}
					values.push(d);
					displays[1]= String.format("%s", String.valueOf(values.peek()));
				}
			}
			return true;
		case 'm':
			if (!cnst) {
				if (n2df) {
					execute1a(9);
				} else {
					execute1a(8);
				}				
			}
			return true;
		case 's':
			if (!cnst) {
				if (n2df) {
					execute1b(6);
					displays[0]= "  pi";
					values.push(Math.PI);
				} else {
					return false;
				}
			}
			return true;
		case 'd':
			cnst= !cnst;
			if (cnst) {
				if (n2df) {
					displays[0]= " x>?";
				} else {
					displays[0]= "   ?";
				}
				displays[1]= "01-32 [_ ]";
			} else {
				displays[0]= (((instructions.isEmpty()) ? 1 : instructions.peek()>>6) < zlevel) ? "  ( " : (instructions.isEmpty()) ? "    " : instructionToFunctionDisplay(instructions.peek());  
				displays[1]= String.format("%s", input[0].toString());
			}
			return true;			
		default:
			return false;
		}
	}	
	private String instructionToFunctionDisplay(int instruction) {
		if (kmode==0) {
			switch (instruction & 63) {
			case 2: return "  + ";
			case 3: return "  - ";
			case 4: return "  * ";
			case 5: return " (*)";
			case 7: return "  / ";
			case 8: return " y^x";
			case 9: return " xV ";
			case 10: return " sqr";
			case 11: return " 3sq";
			case 12: return " neg";
			case 13: return " sin";
			case 14: return " si1";
			case 15: return " cos";
			case 16: return " co1";
			case 17: return " tan";
			case 18: return " ta1";
			case 19: return " log";
			case 20: return " 10x";
			case 21: return " ln ";
			case 22: return " ex ";
			case 23: return " sih";
			case 24: return " s1h";
			case 25: return " coh";
			case 26: return " c1h";
			case 27: return " tah";
			case 28: return " t1h";
			}
		} else {
			switch (instruction) {
			case 2: return (kmode==1) ? "x+?" : "?+x";
			case 3: return (kmode==1) ? "x-?" : "?-x";
			case 4: return (kmode==1) ? "x*?" : "?*x";
			case 6: return (kmode==1) ? "x/?" : "?/x";
			}
		}
		return "";
	}
	private void execute0(int instruction, int zlevel) throws Error {
		/*
		if (0<kmode && (instruction & 63)==0) {
			if (kmode==1) {
				double d= values.pop();
				values.push(kvalue);
				values.push(d);
			} else { 
				values.push(kvalue);
			}
			instructions.push(kinstruction);
			printfunctiondisplay();
		}*/
		while (!instructions.isEmpty() && (instruction | zlevel<<6)>>1 <= instructions.peek()>>1) { //Amíg van eltárolt utasítás és az az aktuálisnál magasabb prioritású, végrehajtjuk.
			double value= values.pop();
			switch (instructions.pop() & 63) {
			// <a> + <b>
			case 2: values.push(values.pop()+value); break;
			case 3: values.push(values.pop()-value); break;
			case 4: case 5: case 6: values.push(values.pop()*value); break; //4: szorzás művelet, 5: (*) szorzás, 6: konstans szorzása (a művelet nem jelenik meg, és nincs CE lehetőség)
			case 7: values.push(values.pop()/value); break;
			case 8:	values.push(Math.pow(values.pop(), value));	break;
			case 9: values.push(Math.pow(value, 1/values.pop())); break;
			// [a | 1]*f(<b>)
			case 10: values.push(values.pop()*Math.sqrt(value)); break;
			case 11: values.push(values.pop()*Math.cbrt(value)); break;
			case 12: values.pop(); values.push(-value); break;
			case 13: values.push(values.pop()*Math.sin(drgToRad(value))); break; // sin
			case 14: values.push(values.pop()*radToDrg(Math.asin(value))); break; // sin-1
			case 15: values.push(values.pop()*Math.cos(drgToRad(value))); break; // cos
			case 16: values.push(values.pop()*radToDrg(Math.acos(value))); break; // cos-1
			case 17: values.push(values.pop()*Math.tan(drgToRad(value))); break; // tan
			case 18: values.push(values.pop()*radToDrg(Math.atan(value))); break; // tan-1
			case 19: values.push(values.pop()*Math.log10(value)); break; // log
			case 20: values.push(values.pop()*Math.pow(10, value)); break; // 10x
			case 21: values.push(values.pop()*Math.log(value)); break; // ln 
			case 22: values.push(values.pop()*Math.exp(value)); break; // ex
			case 23: values.push(values.pop()*Math.sinh(value)); break;// "sinh";
			case 24: values.push(values.pop()*Math.log(value+Math.sqrt(value*value+1))); break; // "asinh";
			case 25: values.push(values.pop()*Math.cosh(value)); break; // "cosh";
			case 26: values.push(values.pop()*Math.log(value+Math.sqrt(value*value-1))); break; // "acosh";
			case 27: values.push(values.pop()*Math.tanh(value)); break; // "tanh";
			case 28: values.push(values.pop()*0.5*Math.log((1+value)/(1-value))); break; // "atanh";
			}
		}
		if (1e+100<=Math.abs(values.peek()) | Double.isNaN(values.peek())) {
			throw new Error("Er2");
		}
	}
	private double drgToRad(double value) {
		switch (drg) {
		case 0:	return value*Math.PI/180;
		case 2:	return value*Math.PI/200;
		default: return value;
		}
	}
	private double radToDrg(double value) {
		switch (drg) {
		case 0: return value*180/Math.PI;
		case 2:	return value*200/Math.PI;
		default: return value;
		}		
	}
	/**
	 * Azoknak a függvényeknek a végrehajtása, amelyeknek két operandusa van (pl. +).<br>A közvetlenül előttük álló input[0] az egyik operandus, utána jövő a második.
	 * @param instruction Az utasítás azonosítója.
	 * @throws Error Hiba volt a művelet végrehajtásában.
	 */
	private void execute1a(int instruction) throws Error {
		kmode= 0;
		if (goInputToValues()) {
			if (zlevel<1) {
				zlevel= 1;
			}
			execute0(instruction, zlevel);
		} else {
			instructions.pop();  
		}
		instructions.push(instruction | zlevel<<6);
		displays[0]= instructionToFunctionDisplay(instruction);
		displays[1]= "_";
	}
	/**
	 * Azoknak a függvényeknek a végrehajtása, amelyeknek nincs argumentuma (pl. pi).<br>A közvetlenül előttük álló input[0] - ha van - szorzóként viselkedik.
	 * @param instruction Az utasítás azonosítója.
	 * @throws Error Hiba volt a művelet végrehajtásában.
	 */
	private void execute1b(int instruction) throws Error {
		goInputToValues();
		if (zlevel<1) {
			values.pop();
			zlevel= 1;
		} else {
			if (isMoreValuesThanInstructions()) {
				execute0(instruction, zlevel);
				instructions.push(instruction | zlevel<<6);
			}
		}
		displays[1]= "_";
	}
	/**
	 * Azoknak a függvényeknek a végrehajtása, amelyeket követ az argumentumuk (pl. négyzetgyök).<br>A közvetlenül előttük álló input[0] - ha van - szorzóként viselkedik.<br>Egyenlőségjel után a mutatott érték argumentummá válik (24+1=gyök=).
	 * @param instruction Az utasítás azonosítója.
	 * @throws Error Hiba volt a művelet végrehajtásában.
	 */
	private void execute1c(int instruction) throws Error {
		double d= Double.NaN;
		if (zlevel<1 && !values.isEmpty()) {
			if (zlevel==-1) {
				values.pop();
			} else {
				d= values.pop();
			}
		}
		if (!goInputToValues()) {
			values.push(1d);
		}
		if (zlevel<1) {
			zlevel= 1;
		}
		execute0(instruction, zlevel);
		instructions.push(instruction | zlevel<<6);
		displays[0]= instructionToFunctionDisplay(instruction);
		if (Double.isNaN(d)) {
			displays[1]= "_";						
		} else {
			values.push(d);
			displays[1]= String.format("%s", String.valueOf(values.peek()));
		}
	}
	/**
	 * input[0] bevitele a verembe - ha van.
	 * @return True= Értékre végződik a kifejezés.
	 */
	private boolean goInputToValues() {
		if (isinputinprogress) {
			isinputinprogress= false;
			values.push(Double.valueOf(input[0].toString()));
			input[0].clear();
			if (zlevel<1) {	
				zlevel= 1;
			}
		}
		return isMoreValuesThanInstructions();
	}
	/**
	 * Az adat-veremben mindig ugyanannyi (ekkor a kifejezés utsításra végződik) vagy eggyel több adat (ekkor a kifejezés adatra végződik) van, mint az utasítás-veremben. 
	 * @return
	 */
	private boolean isMoreValuesThanInstructions() { 
		return instructions.size()<values.size(); 
	}
	public String getDrg() {
		switch (drg) {
		case 0: return "Deg";
		case 1: return "Rad";
		case 2: return "Grad";
		default: return null;
		}
	}
	public boolean isN2df() {
		return n2df;
	}
	public boolean isHyp() {
		return hyp;
	}	
}
	
class Error extends Exception {
	private static final long serialVersionUID = 1L;
	private String message;
	public Error(String message) {
		this.message= message;
	}
	public String toString() {
		return message;
	}
}