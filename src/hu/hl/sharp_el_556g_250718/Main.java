package hu.hl.sharp_el_556g_250718;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;
import java.util.stream.IntStream;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import hu.hl.sharp_el_556g_250708.Input;

public class Main {
	private Calculator calculator;
	private JLabel[] label= {new JLabel(), new JLabel(), new JLabel(), new JLabel(), new JLabel(), new JLabel()};
	private JTextArea textarea= new JTextArea();
	private JScrollPane scrollpane= new JScrollPane();
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		calculator= new Calculator();
		update();
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
		label[2].setBounds(224, 16, 40, 24);
		label[2].setVisible(true);
		label[2].setLayout(null);
		label[2].setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(label[2]);
		label[3].setBounds(16, 48, 200, 24);
		label[3].setVisible(true);
		label[3].setLayout(null);
		label[3].setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(label[3]);
		label[4].setBounds(16, 80, 200, 24);
		label[4].setVisible(true);
		label[4].setLayout(null);
		label[4].setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(label[4]);
		label[5].setBounds(16, 112, 200, 24);
		label[5].setVisible(true);
		label[5].setLayout(null);
		label[5].setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(label[5]);
		
/*		JPanel panel= new JPanel();
		panel.setBounds(16, 144, 200, 96);
		panel.setVisible(true);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(panel);

/*		scrollpane.setBounds(0, 0, 200, 96);
		scrollpane.setVisible(true);
		scrollpane.setLayout(null);
		panel.add(scrollpane);
*/		
		textarea.setBounds(16, 144, 200, 96);
		textarea.setVisible(true);
		textarea.setLayout(null);
		textarea.setEditable(false);
		textarea.setBorder(BorderFactory.createLineBorder(Color.black));
//		panel.add(textarea);
//		scrollpane.setViewportView(textarea);
		frame.add(textarea);

		frame.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyevent) {
				char k= keyevent.getKeyChar();
				switch (k) {
				case ',': k= '.'; break;
				case '\n': k= '='; break;
				}
				if (' '<=k && k<='z') {
					calculator.key(k);
					update();
				}
			}
			public void keyReleased(KeyEvent keyevent) {
			}
			public void keyTyped(KeyEvent keyevent) {
			}
		});
		textarea.addKeyListener(frame.getKeyListeners()[0]);
		"f1+e=======r2=".chars().forEach(i -> calculator.key((char) i));
		
/*		Test.run0(calculator);
		Test.run1(calculator);
		Test.run2(calculator);
		Test.run3(calculator);
//		"f1+e=2(3(5+7))==".chars().forEach(i -> calculator.key((char) i));
/*		"f3=asagi=×".chars().forEach(i -> calculator.key((char) i));
		"f9=n(9)=×".chars().forEach(i -> calculator.key((char) i));
		"f1+e=6(7)=×".chars().forEach(i -> calculator.key((char) i));
		"f1+e=(6(7))=×".chars().forEach(i -> calculator.key((char) i));
/*		"fhnan729000000=".chars().forEach(i -> calculator.key((char) i));
		"fh90n1=×".chars().forEach(i -> calculator.key((char) i));
//		"fn144n9=×".chars().forEach(i -> calculator.key((char) i)); //36
//		"f.25mh270=×".chars().forEach(i -> calculator.key((char) i)); //4
*/
//		"fhnan729000000=".chars().forEach(i -> calculator.key((char) i));

/*		"f2-3/5amagigi2=×".chars().forEach(i -> calculator.key((char) i)); //4
		"1+2*(3+4(5-6)(7-8))=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //15
		"8/2*15y/((5-8)-7)+9+6*3=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //33

		"f3=agi(2)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agias=×".chars().forEach(i -> calculator.key((char) i));
*/
		update();
	}
	private void update() {
		label[0].setText(calculator.getDisplay(0));
		label[1].setText(calculator.getDisplay(1));
		label[3].setText(calculator.getDisplay(2));
		label[4].setText(calculator.getDisplay(3));
		label[5].setText(calculator.getDisplay(4));
		textarea.setText(calculator.getDisplay(5));
	}	
}

class Calculator  {
	protected Input[] inputs= {new Input(), new Input()};
	private Stack<Double> values= new Stack<Double>();
	private Stack<Instruction> instructions= new Stack<Instruction>();
	protected int drg;
	protected int base;
	protected String error;
	protected boolean n2df;
	protected boolean hyp;
	private int zl;
	protected String functDisplay;
	protected String numDisplay;
	protected StringBuilder out= new StringBuilder();
	public Calculator() {
		key('f');
	}
	public void key(char key) {
		switch (key) {
		case 'f':
			inputLezaras();
			if (error==null && tobbAdatMintUtasitas() && vanUtasitas() && !egyenloUtanVagyunk() && !kModbanVagyunk()) {
				valueEldobas();
			} else {
				inputs[0].clear();
				inputs[1].clear();
				instructions.clear();
				values.clear();
				values.push(0d);
				error= null;
				zl= 0;
				functDisplay= null;
				numDisplay= null;
			}
			n2df= false;
			break;
		case 'a':
			n2df= !n2df;
			break;
		case 'g':
			if (error==null) {
				hyp= !hyp;
			}
			break;
		//----- input
		case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
			if (error==null && !n2df) {
				if (inputs[0].toString().equals("0") || inputs[0].toString().equals("-0")) {
					inputs[0].removeLast();
				}
				if (inputs[0].stream().filter(c -> '0'<=c && c<='9').count()<10 || inputs[0].contains('e')) {
					inputs[0].add(key);
				}
				if (inputs[0].contains('e')) {
					inputs[0].remove(inputs[0].size()-3);
				}
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case '.':
			if (error==null) {
				if (n2df) {
					//FSE
				} else {
					if (!vanInput(inputs[0])) {
						key('0');
					}
					if (!inputs[0].contains('.')) {
						inputs[0].add(key);
					}
				}
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case 's':
			if (error==null) {
				if (n2df) {
					execute1d(zl);
					values.push(Math.PI);
					functDisplay= "  pi";
					numDisplay= "_";
				} else {
					if (!vanInput(inputs[0])) {
						key('1');
					}
					if (!inputs[0].contains('e')) {
						inputs[0].add('e');
						inputs[0].add('0');
						inputs[0].add('0');
					}
					functDisplay= null;
					numDisplay= null;
				}
			}
			n2df= false;
			hyp= false;
			break;
		case 'y':
			if (error==null) {
				if (n2df) {
//					if (ertekkelVegzodik() && !vanInput(inputs[0]) /* && fse */) {
//						System.out.println("TAB");
//					}
				} else {
					if (!vanInput(inputs[0])) {
						if (tobbAdatMintUtasitas() && !torlesUtanVagyunk()) {
							values.push(-values.pop());
						} else {
							execute1c(zl, "neg");
						}
					} else {
						if (inputs[0].toString().contains("e-")) {
							inputs[0].remove(inputs[0].size()-3);
						} else if (inputs[0].contains('e')) {
							inputs[0].add(inputs[0].size()-2, '-');
						} else if (inputs[0].getFirst()=='-') {
							inputs[0].removeFirst();
						} else {
							inputs[0].addFirst('-');
						}
					}
				}
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case 'e':
			if (error==null) {
				if (n2df) {
					//CA
				} else {
					if (!vanInput(inputs[0])) {
						if (instructions.size()==1 && (instructions.peek().isAdditive() || instructions.peek().isMultiplicative()) || kModbanVagyunk()) {
							if (kModbanVagyunk()) {
								valueEldobas();
							}
							instructions.peek().toggleKMode();
							values.push(0d);
						}
					} else {
						if (inputs[0].removeLast()=='.') {
							inputs[0].removeLast();
						}
						if (inputs[0].contains('e')) {
							inputs[0].add(inputs[0].size()-1, '0');
						} else {
							if (inputs[0].toString().equals("-")) {
								inputs[0].removeLast();
							}
							if (!vanInput(inputs[0])) {
								inputs[0].add('0');
							}
						}
					}
				}
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case 'c':
			if (error==null) {
				drg+= (drg==2) ? -drg : 1;
				if (n2df) {
					inputLezaras();
					if (tobbAdatMintUtasitas()) {
						execute0(new Instruction(zl= 0, 0, "="));
						switch (drg) {
						case 0:
							values.push(0.9);
							functDisplay= " >D ";
							break;
						case 1:
							values.push(Math.PI/180);
							functDisplay= " >R ";
							break;
						case 2:
							values.push(180/Math.PI/0.9);
							functDisplay= " >G ";
							break;
						}
						numDisplay= null;
						execute1a(zl, "*");
						execute0(new Instruction(zl= 0, 0, "="));
					}
				}
			}
			n2df= false;
			hyp= false;
			break;
		case 'o':
			if (error==null) {
				inputLezaras();
				if (tobbAdatMintUtasitas()) {
					if (n2df) {
						values.push(1/values.pop());
					} else {
						values.push(values.peek()*values.pop());
					}
				}
				if (1e+100<=Math.abs(values.peek())) {
					error= "Er2";
				}
				if (egyenloUtanVagyunk()) {
					instructionEldobas();
				}
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case 'l':
			if (error==null) {
				inputLezaras();
				if (tobbAdatMintUtasitas()) {
					if (n2df) {
						int i= (int) Math.round(values.peek());
						if (values.pop()==i && 0<=i && i<70) {
							values.push(1d);
							IntStream.range(1, i+1).forEach(x -> values.push(values.pop()*x));
						} else {
							error= "Er2";
						}
					} else {
						double d= values.pop()/100;
						if (vanUtasitas() && instructions.peek().isAdditive()) {
							d*= values.peek();
						}
						values.push(d);
					}
					if (egyenloUtanVagyunk()) {
						instructionEldobas();
					}
					if (1e+100<=Math.abs(values.peek())) {
						error= "Er2";
					}		
				}
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;			
		case '+':
			if (error==null) {
				if (n2df) {
					
				} else {
					execute1a(zl, "+");
				}
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case '-':
			if (error==null) {
				if (n2df) {
					
				} else {
					execute1a(zl, "-");
				}
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case '*':
			if (error==null) {
				if (n2df) {
					
				} else {
					execute1a(zl, "*");
				}
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case '/':
			if (error==null) {
				if (n2df) {
					
				} else {
					execute1a(zl, "/");
				}
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case 'm':
			if (error==null) {
				if (n2df) {
					execute1a(zl, "nrt");
				} else {
					execute1a(zl, "pwr");
				}
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case '=':
			if (error==null) {
				inputLezaras();
				if (n2df) {
					//ANS
				} else {
					if (kModbanVagyunk()) {
						execute0(instructions.firstElement());
					} else if (tobbAdatMintUtasitas()) {
						execute0(new Instruction(zl= 0, 0, "="));
					}
				}
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case '(':
			if (error==null) {
				execute1b(zl);
				if (zl<15) {
					zl++;
				} else {
					error = "Er3";
				}
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case ')':
			if (error==null) {
				inputLezaras();
				if (kModbanVagyunk() && zl==0) {
					execute0(instructions.firstElement());
				} else if (kModbanVagyunk() | !kModbanVagyunk() && tobbAdatMintUtasitas()) {
					execute0(new Instruction(zl, 0, ")"));
					instructionEldobas();
					zl-= Integer.signum(zl);
				}
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case 'h':
			if (error==null) {
				execute1c(zl, (n2df) ? (hyp) ? "asnh" : "asin" : (hyp) ? "sinh" : "sin");
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case 'i':
			if (error==null) {
				execute1c(zl, (n2df) ? (hyp) ? "acsh" : "acos" : (hyp) ? "cosh" : "cos");
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case 'j':
			if (error==null) {
				execute1c(zl, (n2df) ? (hyp) ? "atnh" : "atan" : (hyp) ? "tanh" : "tan");
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case 'n':
			if (error==null) {
				execute1c(zl, (n2df) ? "cbrt" : "sqrt");
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case 'p':
			if (error==null) {
				execute1c(zl, (n2df) ? "10x" : "log");
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case 'q':
			if (error==null) {
				execute1c(zl, (n2df) ? "ex" : "ln");
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case 'r':
			if (error==null) {
				inputLezaras();
				if (kModbanVagyunk()) {
					double d= values.firstElement();
					Instruction i= instructions.firstElement();
					execute1a(zl, (n2df) ? "npr" : "ncr");
					values.add(0, d);
					instructions.add(0, i);
				} else {
					execute1a(zl, (n2df) ? "npr" : "ncr");
				}
			}
			n2df= false;
			hyp= false;
			functDisplay= null;
			numDisplay= null;
			break;
		case '×':
			out.append(String.format("--%n"));
			return;
		}
		out.append(String.format("'%s;%s;%s;%s;%s;%s;%s%n", key, getDisplay(0), getDisplay(1), zl, inputs[0], getDisplay(3), getDisplay(4)));
	}
	public String getDisplay(int index) {
		switch (index) {
		case 0:
			if (error!=null) {
				return "    ";
			} else if (functDisplay!=null) {
				return functDisplay;
			} else if (vanNyitottZarojel()) {
				return "  ( ";
			} else if (!vanUtasitas() || vanInput(inputs[0]) && instructions.peek().isKMode()) {
				return "    ";
			} else {
				return instructions.peek().getFunctionDisplay();
			}
		case 1:
			if (error!=null) {
				return error.toString();
			} else if (numDisplay!=null) {
				return numDisplay;
/*			} else if (!inputs[1].isEmpty()) {
				return inputs[1].toString();
*/			} else if (vanInput(inputs[0])) {
				return inputs[0].toString();
			} else if (tobbAdatMintUtasitas()) {
				return String.format("%s", values.peek());
			} else {
				return "_";
			}
		case 2: return ((n2df) ? "2ndf;" : "")+((hyp) ? "hyp;" : "")+((drg==0) ? "deg;" : (drg==1) ? "rad;" : "grad;");
		case 4: return String.format("%s", instructions.toString());
		case 3: return String.format("%s", values.toString());
		case 5: return out.toString();
		default: return "";
		}
	}
	private void execute0(Instruction instruction) {
		while (vanUtasitas() && instruction.compareTo(instructions.peek())<1) {
			instructions.pop().execute(drg, values);
		}
		instructions.push(instruction);
		if (!values.isEmpty() && (Double.isNaN(values.peek()) || 1e+100<=Math.abs(values.peek()))) {
			error= "Er2";
		}
	}
	private void execute1a(int zl, String id) {
//		System.out.printf("%s, %s, %s, %s, %s%n", vanInput(inputs[0]), egyenloUtanVagyunk(), torlesUtanVagyunk(), tobbAdatMintUtasitas(), kModbanVagyunk());
		if (vanInput(inputs[0])) {
			if (egyenloUtanVagyunk()) {
				instructionEldobas();
				valueEldobas();
			} else if (torlesUtanVagyunk()) {
				valueEldobas();
			} else if (kModbanVagyunk()) {
				instructions.firstElement().closeKMode();
			} else {
				System.out.println();
			}
			inputLezaras();
		} else {
			if (egyenloUtanVagyunk()) {
				instructionEldobas();
			} else if (torlesUtanVagyunk()) {
			} else if (kModbanVagyunk()) {
				instructions.firstElement().closeKMode();
			} else if (tobbAdatMintUtasitas()) {
			} else if (utolsoUtasitasValuesHosszatCsokkenti()) {
				instructionEldobas();
			} else 
				return;
		}
		execute0(new Instruction(zl, 0, id));
	}
	private void execute1b(int zl) {
//		System.out.printf("%s, %s, %s, %s, %s%n", vanInput(inputs[0]), egyenloUtanVagyunk(), torlesUtanVagyunk(), tobbAdatMintUtasitas(), kModbanVagyunk());
		if (vanInput(inputs[0])) {
			if (egyenloUtanVagyunk()) {
				instructionEldobas();
				valueEldobas();
			} else if (torlesUtanVagyunk()) {
				valueEldobas();
			}
			inputLezaras();
			execute0(new Instruction(zl, 0, "(*)"));
		} else {
			if (egyenloUtanVagyunk()) {
				instructionEldobas();
				valueEldobas();
			} else if (torlesUtanVagyunk() || kModbanVagyunk()) {
				valueEldobas();
			} else if (tobbAdatMintUtasitas()) {
				execute0(new Instruction(zl, 0, "(*)"));
			}
		}
	}
	private void execute1c(int zl, String id) {
//		System.out.printf("%s, %s, %s, %s%n", vanInput(inputs[0]), egyenloUtanVagyunk(), torlesUtanVagyunk(), tobbAdatMintUtasitas());
		if (vanInput(inputs[0])) {
			if (egyenloUtanVagyunk()) {
				instructionEldobas();
				valueEldobas();
			} else if (torlesUtanVagyunk()) {
				valueEldobas();
			}
			inputLezaras();
			execute0(new Instruction(zl, 0, "(*)"));
		} else {
			if (egyenloUtanVagyunk()) {
				instructionEldobas();
			} else if (torlesUtanVagyunk() || kModbanVagyunk()) {
				valueEldobas();
			} else if (tobbAdatMintUtasitas()) {
				execute0(new Instruction(zl, 0, "(*)"));
			}
		}
		if (tobbAdatMintUtasitas() && utolsoUtasitasValuesHosszatCsokkenti()) {
			execute0(new Instruction(zl, 0, id));
		} else {
			execute0(new Instruction(zl, utolsoUtasitasLvl1()+1, id));
		}
	}
	private void execute1d(int zl) {
//		System.out.printf("%s, %s, %s, %s%n", vanInput(inputs[0]), egyenloUtanVagyunk(), torlesUtanVagyunk(), tobbAdatMintUtasitas());
		if (vanInput(inputs[0])) {
			if (egyenloUtanVagyunk()) {
				instructionEldobas(); //f=2as
				valueEldobas();
				inputLezaras();
				execute0(new Instruction(zl, utolsoUtasitasLvl1()+1, "(*)"));
			} else if (torlesUtanVagyunk()) {
				valueEldobas(); //f)2as
				inputLezaras();
				execute0(new Instruction(zl, utolsoUtasitasLvl1()+1, "(*)"));
			} else if (tobbAdatMintUtasitas() || !utolsoUtasitasValuesHosszatCsokkenti()) {
				inputLezaras(); //f-2as3as
				execute0(new Instruction(zl, utolsoUtasitasLvl1()+1, "(*)")); 
			} else {
				inputLezaras(); //f-2as
				execute0(new Instruction(zl, 0, "(*)")); 
			}
		} else {
			if (egyenloUtanVagyunk()) {
				instructionEldobas(); //f3=as
				valueEldobas();
			} else if (torlesUtanVagyunk() || kModbanVagyunk()) {
				valueEldobas(); //fas
			} else if (tobbAdatMintUtasitas()) {
				execute0(new Instruction(zl, utolsoUtasitasLvl1()+1, "(*)")); //f3=agias
			} else if (utolsoUtasitasValuesHosszatCsokkenti()) {
				//f3=-as
			} else {
				//f3=(as
			}
		}
	}	
	protected boolean vanInput(Input input) {
		return !input.isEmpty();
	}
	protected void inputUritese() {
		inputs[0].clear();
	}
	protected void inputLezaras() {
		if (vanInput(inputs[0])) {
			if (tobbAdatMintUtasitas()) {
				valueEldobas();
			}
			inputVerembe();
			inputUritese();
		}
	}
	protected void inputVerembe() {
		values.push(Double.valueOf(inputs[0].toString()));
	}
	protected double valueEldobas() {
		return values.pop();
	}
	protected boolean tobbAdatMintUtasitas() {
		return instructions.stream().filter(instruction -> instruction.csokkentiValuesHosszat() || instruction.isKMode()).count()<values.size();
	}
	protected boolean utolsoUtasitasValuesHosszatCsokkenti() {
		return vanUtasitas() && instructions.peek().csokkentiValuesHosszat(); 
	}
	protected int utolsoUtasitasLvl1() {
		return (!vanUtasitas()) ? 0 : instructions.peek().getLvl()[1];
	}
	protected boolean egyenloUtanVagyunk() {
		return instructions.size()==1 && instructions.lastElement().isEgyenlo(); 
	}
	protected boolean torlesUtanVagyunk() {
		return values.size()==1 && values.lastElement()==0d && !vanUtasitas();
	}
	protected Instruction instructionEldobas() {
		return instructions.pop();
	}
	protected boolean vanNyitottZarojel() {
		return ((!vanUtasitas()) ? 0 : instructions.peek().getLvl()[2]) < zl;
	}
	private boolean vanUtasitas() {
		return !instructions.isEmpty();
	}
	private boolean kModbanVagyunk() {
		return vanUtasitas() && instructions.firstElement().isKMode();
	}
}

class Instruction implements Comparable<Instruction> {
	private String id;
	private final int[] lvl= {0, 0, 0};
	public Instruction(int lvl2, int lvl1, String id) {
		this.id= id;
		switch (id) {
		case "=": case ")": lvl[0]= 0; break;
		case "+": case "-": lvl[0]= 10; break;
		case "*": case "/": lvl[0]= 20; break;
		case "npr": case "ncr": lvl[0]= 25; break;
		case "(*)": lvl[0]= 30; break;
		case "pwr": case "nrt": lvl[0]= 40; break;
		case "asnh": case "asin": case "sinh": case "sin":
		case "acsh": case "acos": case "cosh": case "cos":
		case "atnh": case "atan": case "tanh": case "tan":
		case "cbrt": case "sqrt": 
		case "10x": case "log":	case "ex": case "ln": case "neg": lvl[0]= 50; break;
		}
		this.lvl[1]= lvl1;
		this.lvl[2]= lvl2;
	}
	public int[] getLvl() {
		return lvl;
	}
	public void execute(int drg, Stack<Double> values) {
		if (isKMode()) {
			double d= values.pop();
			switch (id) {
			case "x+?": values.push(values.peek()+d); break;
			case "?+x": values.push(d+values.peek()); break;
			case "x-?": values.push(values.peek()-d); break;
			case "?-x": values.push(d-values.peek()); break;
			case "x*?": values.push(values.peek()*d); break;
			case "?*x": values.push(d*values.peek()); break;
			case "x/?": values.push(values.peek()/d); break;
			case "?/x": values.push(d/values.peek()); break;
			}
		} else if (csokkentiValuesHosszat()) {
			if (1<values.size()) {
				double d= values.pop();
				switch (id) {
				case "+": values.push(values.pop()+d); break;
				case "-": values.push(values.pop()-d); break;
				case "*": case "(*)": values.push(values.pop()*d); break;
				case "/": values.push(values.pop()/d); break;
				case "pwr": values.push(Math.pow(values.pop(), d)); break;
				case "nrt": values.push(Math.pow(d, 1/values.pop())); break;
				case "npr": if (isInteger(values.peek(), d)) values.push(fact(values.peek())/fact(values.pop()-d)); else values.push(Double.NaN); /* n!/(n-d)! */ break;
				case "ncr": if (isInteger(values.peek(), d)) values.push(fact(values.peek())/fact(values.pop()-d)/fact(d)); else values.push(Double.NaN); /* n!/(n-d)!/d! */ break;
				}
			}
		} else {
			if (!values.isEmpty()) {
				switch (id) {
				case "asnh": values.push(Math.log(values.peek()+Math.sqrt(values.peek()*values.pop()+1))); break;
				case "asin": values.push(radToDrg(drg, Math.asin(values.pop()))); break;
				case "sinh": values.push(Math.sinh(values.pop())); break;
				case "sin": values.push(Math.sin(drgToRad(drg, values.pop()))); break;
				case "acsh": values.push(Math.log(values.peek()+Math.sqrt(values.peek()*values.pop()-1))); break; // "acosh";
				case "acos": values.push(radToDrg(drg, Math.acos(values.pop()))); break;
				case "cosh": values.push(Math.cosh(values.pop())); break;
				case "cos": values.push(Math.cos(drgToRad(drg, values.pop()))); break;
				case "atnh": values.push(0.5*Math.log((1+values.peek())/(1-values.pop()))); break;
				case "atan": values.push(radToDrg(drg, Math.atan(values.pop()))); break;
				case "tanh": values.push(Math.tanh(values.pop())); break;
				case "tan": values.push(Math.tan(drgToRad(drg, values.pop()))); break;
				case "sqrt": values.push(Math.sqrt(values.pop())); break;
				case "cbrt": values.push(Math.cbrt(values.pop())); break;
				case "10x": values.push(Math.pow(10, values.pop())); break;
				case "log": values.push(Math.log10(values.pop())); break;
				case "ex": values.push(Math.exp(values.pop())); break;
				case "ln": values.push(Math.log(values.pop())); break;
				case "neg": values.push(-values.pop()); break;
				}
			}
		}
	}
	private boolean isInteger(double a, double b) {
		return Math.floor(a)==a && Math.floor(b)==b; 
	}
	private double fact(double n) {
		double result= 1;
		while (0<n) {
			result*= n--;
		}
		return result;
	}
	private double drgToRad(int drg, double value) {
		switch (drg) {
		case 0: return value*Math.PI/180;
		case 2: return value*Math.PI/200;
		default: return value;
		}
	}
	private double radToDrg(int drg, double value) {
		switch (drg) {
		case 0: return value*180/Math.PI;
		case 2: return value*200/Math.PI;
		default: return value;
		}
	}
	public boolean csokkentiValuesHosszat() {
		return isAdditive() || isMultiplicative() || id.equals("(*)") || id.equals("pwr") || id.equals("nrt") || id.equals("npr") || id.equals("ncr");
	}
	public boolean isAdditive() {
		return id.equals("+") || id.equals("-");
	}
	public boolean isMultiplicative() {
		return id.equals("*") || id.equals("/");
	}
	public boolean isKMode() {
		return id.equals("x+?") || id.equals("?+x") || id.equals("x-?") || id.equals("?-x") || id.equals("x*?") || id.equals("?*x") || id.equals("x/?") || id.equals("?/x");
	}
	public void toggleKMode() {
		if (isAdditive() || isMultiplicative() || isKMode()) {
			switch (id) {
			case "+": case "?+x": id= "x+?"; break;
			case "x+?": id= "?+x"; break;
			case "-": case "?-x": id= "x-?"; break;
			case "x-?": id= "?-x"; break;
			case "*": case "?*x": id= "x*?"; break;
			case "x*?": id= "?*x"; break;
			case "/": case "?/x": id= "x/?"; break;
			case "x/?": id= "?/x"; break;
			}
			lvl[1]= 0;
			lvl[2]= 0;
		}
	}
	public void closeKMode() {
		switch (id) {
		case "?+x": case "x+?": id= "+"; break;
		case "?-x": case "x-?": id= "-"; break;
		case "?*x": case "x*?": id= "*"; break;
		case "?/x": case "x/?": id= "/"; break;
		}
	}
	public boolean isEgyenlo() {
		return id.equals("=");
	}
	public boolean isZaroZaro() {
		return id.equals(")");
	}	
	public int compareTo(Instruction instruction) {
		if (Integer.compare(lvl[2], instruction.lvl[2])==0) {
			if (Integer.compare(lvl[1], instruction.lvl[1])==0) {
				return Integer.compare(lvl[0], instruction.lvl[0]);
			} else {
				return Integer.compare(lvl[1], instruction.lvl[1]);
			}
		} else {
			return Integer.compare(lvl[2], instruction.lvl[2]);
		}
	}
	public String getFunctionDisplay() {
		switch (id) {
		case "+": return "  + ";
		case "-": return "  - ";
		case "*": return "  * ";
		case "/": return "  / ";
		case "(*)": return " (*)";
		case "pwr": return " pwr";
		case "nrt": return " nrt";
		case "asnh": return "asnh";
		case "asin": return "asin";
		case "sinh": return "sinh";
		case "sin": return " sin";
		case "cos": return " cos"; 
		case "acos": return "acos";
		case "cosh": return "cosh";
		case "acsh": return "acsh";
		case "atnh": return "atnh";
		case "atan": return "atan";
		case "tanh": return "tanh";
		case "tan": return " tan"; 
		case "sqrt": return "sqrt";
		case "cbrt": return "cbrt";
		case "10x": return " 10x";
		case "log": return " log";
		case "ex": return " ex ";
		case "ln": return " ln ";
		case "npr": return " nPr";
		case "ncr": return " nCr";
		case "neg": return "   ~";
		case "x+?": return " x+?";
		case "?+x": return " ?+x";
		case "x-?": return " x-?";
		case "?-x": return " ?-x";
		case "x*?": return " x*?";
		case "?*x": return " ?*x";
		case "x/?": return " x/?";
		case "?/x": return " ?/x";
		default: return "    "; 
		}
	}
	public String toString() {
		return String.format("[%s, %s, %s, %s]", lvl[2], lvl[1], lvl[0], id);
	}
}