package hu.hl.sharp_el_556g_250708;

import java.util.Stack;
import java.util.stream.IntStream;

class Calculator implements ICalculator {
	protected Input[] inputs= {new Input(), new Input()};
	protected Stack<Instruction> instructions= new Stack<Instruction>(); //Values eleminek száma + input[0] (1 ha van, 0 ha üres) == instructions elemeinek száma + 1
	protected Stack<Double> values= new Stack<Double>();
	protected String error;
	protected int zlevel;
	protected boolean n2df;
	protected boolean hyp;
	protected int drg= 0;
	protected String functionDisplay;
	protected String numDisplay;
	protected StringBuilder out= new StringBuilder();
	public Calculator() {
	}
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
						execute0(new Instruction(50, 22, zlevel));
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
	protected void execute0(Instruction instruction) {
		if (ertekkelVegzodik()) {
			while (!instructions.isEmpty() && instruction.compareTo(instructions.peek())<1) {
				values.push(instructions.pop().execute(drg, values.pop(), values.pop()));
			}
		} else {
			instructionEldobas();
		}
		instructions.push(instruction);
		if (Double.isNaN(values.peek()) || 1e+100<=Math.abs(values.peek())) {
			error= "Er2";
		}		
	}
	public void execute1a() {
		if (inputLezaras()) {
			zLevel1re();
		}
		if (ertekkelVegzodik()) {
			if (egyenloVagyTorlesUtanVagyunk()) {
				valueEldobas();
				zLevel1re();
			} else {
				execute0(new Instruction(50, 20, zlevel));
			}
		}		
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
		execute0(new Instruction(id, 21, zlevel)); //; f(1+2)n16; //2asn9
	}	
	public String getDisplay(int index) {
		switch (index) {
		case 0:
			if (error!=null) {
				return "    ";
			} else if (functionDisplay!=null) {
				return functionDisplay;
			} else if (vanNyitottZarojel()) {
				return "  ( ";
			} else if (instructions.isEmpty()) {
				return "    ";
			} else {
				return instructions.peek().getFuntionDisplay();
			}
		case 1:
			if (error!=null) {
				return error.toString();
			} else if (numDisplay!=null) {
				return numDisplay;
			} else if (!inputs[1].isEmpty()) {
				return inputs[1].toString();
			} else if (vanInput()) {
				return inputs[0].toString();
			} else if (!ertekkelVegzodik()) {
				return "_";
			} else {
				return String.format("%s", values.peek());
			}
		case 2: return ((n2df) ? "2ndf;" : "")+((hyp) ? "hyp;" : "")+((drg==0) ? "deg;" : (drg==1) ? "rad;" : "grad;");
		case 4: return String.format("%s", instructions.toString());
		case 3: return String.format("%s", values.toString());
		case 5: return out.toString();
		default: return "";
		}
	}
	protected void inputUritese() {
		inputs[0].clear();
	}
	protected void inputVerembe() {
		values.push(Double.valueOf(inputs[0].toString()));
	}
	protected void valueEldobas() {
		values.pop();
	}
	protected boolean egyenloVagyTorlesUtanVagyunk() {
		return zlevel<1;
	}
	protected boolean vanInput() {
		return !inputs[0].isEmpty();
	}
	protected boolean inputLezaras() {
		boolean result= vanInput();
		if (result) {
			if (ertekkelVegzodik()) {
				valueEldobas();
			}
			inputVerembe();
			inputUritese();
		}
		return result;
	}
	protected void instructionEldobas() {
		instructions.pop();
	}
	protected void zLevel1re() {
		if (egyenloVagyTorlesUtanVagyunk()) {
			zlevel= 1;
		}
	}	
	protected boolean nyitottZarojellelVegzodik() {
		return !ertekkelVegzodik() && vanNyitottZarojel();
	}
	protected boolean ertekkelVegzodik() {
		return instructions.size()<values.size();
	}
	protected boolean vanNyitottZarojel() {
		return ((instructions.isEmpty()) ? 1 : instructions.peek().getZl()) < zlevel;
	}
	protected boolean utasitasVagyZarojelnyitasUtanVagyunk() {
		return !instructions.isEmpty() | 1<zlevel;
	}
	protected boolean zarojelNyitoFuggvenyUtanVagyunk() {
		return !instructions.isEmpty() && instructions.peek().getLv()==21;		
	}
}

class Instruction implements Comparable<Instruction> {
	protected int id;
	protected int lv;
	protected int zl;
	public Instruction(int id, int lv, int zl) {
		this.id= id;
		this.lv= lv;
		this.zl= zl;
	}
	public int getId() {
		return id;
	}
	public int getLv() {
		return lv;
	}
	public int getZl() {
		return zl;
	}
	public int compareTo(Instruction instruction) {
		if (Integer.compare(zl, instruction.zl)==0) {
			return Integer.compare(lv, instruction.lv);
		} else {
			return Integer.compare(zl, instruction.zl);
		}
	}
	public double execute(int drg, double a, double b) {
		switch (id) {
		// <a> + <b>
		case 10: return b+a;
		case 20: return b-a;
		case 30: case 50: return b*a; //30: * szorzás, 50: (*) szorzás;
		case 40: return b/a;
		case 70: return Math.pow(b, a);
		case 80: return Math.pow(a, 1/b);
		// [a | 1]*f(<b>)
		case 90: return -a;
		case 100: return b*Math.sqrt(a);
		case 110: return b*Math.cbrt(a);
		case 120: return b*Math.sin(drgToRad(drg, a)); // sin
		case 130: return b*radToDrg(drg, Math.asin(a)); // sin-1
		case 140: return b*Math.cos(drgToRad(drg, a)); // cos
		case 150: return b*radToDrg(drg, Math.acos(a)); // cos-1
		case 160: return b*Math.tan(drgToRad(drg, a)); // tan
		case 170: return b*radToDrg(drg, Math.atan(a)); // tan-1
		case 180: return b*Math.log10(a); // log
		case 190: return b*Math.pow(10, a); // 10x
		case 200: return b*Math.log(a); // ln
		case 210: return b*Math.exp(a); // ex
		case 220: return b*Math.sinh(a); // "sinh";
		case 230: return b*Math.log(a+Math.sqrt(a*a+1)); // "asinh";
		case 240: return b*Math.cosh(a); // "cosh";
		case 250: return b*Math.log(a+Math.sqrt(a*a-1)); // "acosh";
		case 260: return b*Math.tanh(a); // "tanh";
		case 270: return b*0.5*Math.log((1+a)/(1-a)); // "atanh";
		default: return Double.NaN;
		}
	}
	public String getFuntionDisplay() {
		switch (id) {
		case 10: return "  + ";
		case 20: return "  - ";
		case 30: return "  * ";
		case 40: return "  / ";
		case 50: return " (*)";
		case 70: return " y^x";
		case 80: return " xVy";
		case 90: return " neg";
		case 100: return "sqrt";
		case 110: return "cbrt";
		case 120: return " sin";
		case 130: return "sn-1";
		case 140: return " cos";
		case 150: return "cs-1";
		case 160: return " tan";
		case 170: return "tn-1";
		case 180: return " log";
		case 190: return "10^x";
		case 200: return "  ln";
		case 210: return " e^x";
		case 220: return "sinh";
		case 230: return "asnh";
		case 240: return "cosh";
		case 250: return "acsh";
		case 260: return "tanh";
		case 270: return "atnh";
		default: return "    ";
		}
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
	public String toString() {
		return String.format("[%s,%s,%s]", getFuntionDisplay().trim(), lv, zl);
	}
}