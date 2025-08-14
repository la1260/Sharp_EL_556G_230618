package hu.hl.sharp_el_556g_250708;

import java.util.Stack;
import java.util.stream.IntStream;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main {
	private Calculator calculator;
	private JLabel[] label= {new JLabel(), new JLabel(), new JLabel(), new JLabel(), new JLabel(), new JLabel()};
	private JTextArea textarea= new JTextArea();
	private JScrollPane scrollpane= new JScrollPane();
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		calculator= new Calculator1();
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
		Test.run1(calculator);
		Test.run2(calculator);
/*		"f3=asagi=×".chars().forEach(i -> calculator.key((char) i));
		"f9=n(9)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi(2)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agias=×".chars().forEach(i -> calculator.key((char) i));
		"fhnan729000000=".chars().forEach(i -> calculator.key((char) i));
		"fh90n1=×".chars().forEach(i -> calculator.key((char) i));
//		"fn144n9=×".chars().forEach(i -> calculator.key((char) i)); //36
//		"f.25mh270=×".chars().forEach(i -> calculator.key((char) i)); //4
*/		update();
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

class Calculator1 extends Calculator {
	public void key(char key) {
		functionDisplay= null;
		numDisplay= null;
		switch (key) {
		case 'f':
			inputLezaras();
			if (error==null && utasitasVagyZarojelnyitasUtanVagyunk() && ertekkelVegzodik()) {
				valueEldobas();
			} else {
				inputs[0].clear();
				inputs[1].clear();
				instructions.clear();
				values.clear();
				values.push(0d);
				error= null;
				zlevel= -1;
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
				if (inputs[0].size()<10) {
					inputs[0].add(key);
				}
				if (inputs[0].contains('e')) {
					inputs[0].remove(inputs[0].size()-2);
				}
			}
			n2df= false;
			hyp= false;
			break;
		case '.':
			if (error==null) {
				if (n2df) {
					//FSE
				} else {
					if (!vanInput()) {
						key('0');
					}
					if (!inputs[0].contains('.')) {
						inputs[0].add(key);
					}
				}
			}
			n2df= false;
			hyp= false;
			break;
		case 's':
			if (error==null) {
				if (n2df) {
					if (ertekkelVegzodik() && (vanInput() || egyenloVagyTorlesUtanVagyunk())) {
						valueEldobas();
					}
					if (vanInput()) {
						inputVerembe();
						inputUritese();
					}
					if (ertekkelVegzodik()) {
						zLevel1re();
						execute0(new Instruction(50, 1024, zlevel));
					}
					zLevel1re();
					values.push(Math.PI);
					functionDisplay= "  pi";
					numDisplay= "_";
				} else {
					if (!vanInput()) {
						key('1');
					}
					if (!inputs[0].contains('e')) {
						inputs[0].add('e');
						inputs[0].add('0');
						inputs[0].add('0');
					}
				}
			}
			n2df= false;
			hyp= false;
			break;
		case 'y':
			if (error==null) {
				if (n2df) {
					if (ertekkelVegzodik() && !vanInput() /* && fse */) {
						System.out.println("TAB");
					}
				} else {
					if (!vanInput()) {
						if (utasitasVagyZarojelnyitasUtanVagyunk() && !ertekkelVegzodik() || zlevel==-1) {
							execute1b(90);
						} else {
							values.push(-values.pop());
						}
					} else {
						if (inputs[0].toString().contains("e-")) {
							inputs[0].remove(inputs[0].size()-2);
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
			break;
		case 'e':
			if (error==null) {
				if (n2df) {
					//CA
				} else {
					if (!vanInput()) {
						//K mode
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
							if (!vanInput()) {
								inputs[0].add('0');
							}
						}
					}
				}
			}
			n2df= false;
			hyp= false;
			break;
		//----- execute
		case '+':
			if (error==null) {
				inputLezaras();
				zLevel1re();
				if (n2df) {
					//DEC
				} else {
					if (!nyitottZarojellelVegzodik()) {
						execute0(new Instruction(10, 10, zlevel));
					}
				}
			}
			n2df= false;
			hyp= false;
			break;
		case '-':
			if (error==null) {
				inputLezaras();
				zLevel1re();
				if (n2df) {
					//OCT
				} else {
					if (!nyitottZarojellelVegzodik()) {
						execute0(new Instruction(20, 10, zlevel));
					}
				}
			}
			n2df= false;
			hyp= false;
			break;
		case '*':
			if (error==null) {
				inputLezaras();
				zLevel1re();
				if (n2df) {
					//HEX
				} else {
					if (!nyitottZarojellelVegzodik()) {
						execute0(new Instruction(30, 20, zlevel));
					}
				}
			}
			n2df= false;
			hyp= false;
			break;
		case '/':
			if (error==null) {
				inputLezaras();
				zLevel1re();
				if (n2df) {
					//BIN
				} else {
					if (!nyitottZarojellelVegzodik()) {
						execute0(new Instruction(40, 20, zlevel));
					}
				}
			}
			n2df= false;
			hyp= false;
			break;
		case 'm':
			if (error==null) {
				inputLezaras();
				zLevel1re();
				if (n2df) {
					if (!nyitottZarojellelVegzodik()) {
						execute0(new Instruction(80, 30, zlevel));
					}
				} else {
					if (!nyitottZarojellelVegzodik()) {
						execute0(new Instruction(70, 30, zlevel));
					}
				}
			}
			n2df= false;
			hyp= false;
			break;
		case '=':
			if (error==null) {
				inputLezaras();
				if (n2df) {
					//ANS
				} else {
					if (ertekkelVegzodik()) {
						execute0(new Instruction(0, 0, zlevel= 0));
						instructionEldobas();
					}
				}
			}
			n2df= false;
			hyp= false;
			break;
		case '(':
			if (error==null) {
				if (n2df) {
					inputLezaras(); //x'
				} else {
					if (zlevel<17) {
						execute1a();
						zlevel++;
					} else {
						error= "Er3";
					}
				}
			}
			n2df= false;
			hyp= false;
			break;
		case ')':
			if (error==null) {
				inputLezaras();
				if (n2df) {
					//y'
				} else {
					if (ertekkelVegzodik()) {
						execute0(new Instruction(0, 0, zlevel));
						instructionEldobas();
						zLevel1re();
						if (1<zlevel) {
							zlevel--;
						}
					}
				}
			}
			n2df= false;
			hyp= false;
			break;
		//-----
		case 'o':
			if (error==null) {
				inputLezaras();
				if (ertekkelVegzodik()) {
					zLevel1re();
					if (n2df) {
						values.push(1/values.pop());
					} else {
						values.push(values.peek()*values.pop());
					}
				}
				if (1e+100<=Math.abs(values.peek())) {
					error= "Er2";
				}		
			}
			n2df= false;
			hyp= false;
			break;
		case 'l':
			if (error==null) {
				inputLezaras();
				if (ertekkelVegzodik()) {
					zLevel1re();
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
						if (instructions.isEmpty()) {
							if (zlevel==0) {
								zlevel= 1;
							}
						} else {
							if (instructions.peek().getLv()==1) {
								d*= values.peek();
							}
						}
						values.push(d);
					}
					if (1e+100<=Math.abs(values.peek())) {
						error= "Er2";
					}		
				}
			}
			n2df= false;
			hyp= false;
			break;
		case 'c':
			if (error==null) {
				drg+= (drg==2) ? -drg : 1;
				if (n2df) {
					inputLezaras();
					if (ertekkelVegzodik()) {
						execute0(new Instruction(0, 0, zlevel= 0));
						instructionEldobas();
						switch (drg) {
						case 0:
							values.push(0.9);
							functionDisplay= " >D ";
							break;
						case 1:
							values.push(Math.PI/180);
							functionDisplay= " >R ";
							break;
						case 2:
							values.push(180/Math.PI/0.9);
							functionDisplay= " >G ";
							break;
						}
						execute0(new Instruction(30, 20, zlevel));
						execute0(new Instruction(0, 0, zlevel= 0));
						instructionEldobas();
					}
				}
			}
			n2df= false;
			hyp= false;
			break;
		case 'n':
			if (error==null) {
				execute1b((n2df) ? 110 : 100);
			}
			n2df= false;
			hyp= false;
			break;
		case 'h':
			if (error==null) {
				execute1b((n2df) ? (hyp) ? 230 : 130 : (hyp) ? 220 : 120);
			}
			n2df= false;
			hyp= false;
			break;
		case 'i':
			if (error==null) {
				execute1b((n2df) ? (hyp) ? 250 : 150 : (hyp) ? 240 : 140);
			}
			n2df= false;
			hyp= false;
			break;
		case 'j':
			if (error==null) {
				execute1b((n2df) ? (hyp) ? 270 : 170 : (hyp) ? 260 : 160);
			}
			n2df= false;
			hyp= false;
			break;
		case 'p':
			if (error==null) {
				execute1b((n2df) ? 190 : 180);
			}
			n2df= false;
			hyp= false;
			break;
		case 'q':
			if (error==null) {
				execute1b((n2df) ? 210 : 200);
			}
			n2df= false;
			hyp= false;
			break;
		case '×':
			out.append(String.format("--%n"));
			return;
		}
		out.append(String.format("'%s;%s;%s;%s;%s;%s;%s%n", key, getDisplay(0), getDisplay(1), zlevel, inputs[0], getDisplay(3), getDisplay(4)));
	}
	public void execute1b(int id) {
		double d;
		if (inputLezaras()) { //f2n16; f3+2n16
			zLevel1re();
		} else if (zlevel==-1) { //fn16
			zLevel1re();
			d= values.pop();
			values.push(1d);
		} else if (zlevel==0) { //f16=n=; f3=n16
			zLevel1re();
			d= values.pop();
			values.push(1d);
			values.push(d);
		} else if (!ertekkelVegzodik()) {
			values.push(1d); //f3+n16
		}
		execute0(new Instruction(id, 21 | ((instructions.isEmpty() || ertekkelVegzodik()) ? 0 : instructions.peek().getLv()>>5)+1<<5, zlevel)); //; f(1+2)n16; //2asn9
	}
}