package hu.hl.sharp_el_556g_241106;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;
import java.util.TreeMap;

public class Main {
	private Form form;
	private Calculator calculator= new Calculator();
	private String keybuffer= "";
	private String tokenbuffer= "";
	
/*	private StringBuilder keybuffer= new StringBuilder();
	private TreeMap<String, KeyProcedure> keysequences= new TreeMap<String, KeyProcedure>();
	private StringBuilder tokenbuffer= new StringBuilder();
	private TreeMap<String, TokenProcedure> tokensequences= new TreeMap<String, TokenProcedure>();
*/	
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		form= new Form(new KeyListener() {
			public void keyPressed(KeyEvent keyevent) {
				char k= keyevent.getKeyChar();
				switch (k) {
				case ',': k= '.'; break;
				case '\n': k= '='; break;
				}
				if (' '<=k && k<='y') {
//					form.update(calculator.sendkey(k));
					keybuffer+= k;
					System.out.printf("%s -> ", keybuffer);
					keybuffer= brb(keybuffer);
				}
			}
			public void keyReleased(KeyEvent keyevent) {}
			public void keyTyped(KeyEvent keyevent) {}
		});
	}
	public String brb(String keybuffer) {
		switch (keybuffer) {
		case "a":
			return keybuffer;
		case "b":
			return keybuffer;
		case "c":
			System.out.println("drg");
			return "";
		case "d":
			System.out.println("cnst");
			return "";
		case "e":
			System.out.println("back->input");
			return "";			
		case "f":
			System.out.println("reset");
			return "";
		case "g":
			System.out.println("hyp");
			return "";
		case "m":
			System.out.println("y^x");
			return "";
		case "v":
			return keybuffer; 
		case "w":
			return keybuffer;
		case "x":
			System.out.println("m+");
			return "";
		case "y":
			System.out.println("+/-; neg; sumxx");
			return "";
		case "1":
			System.out.println("1->input; sumxy");
			return "";
		case ".":
			System.out.println(".->input; sumx");
			return "";
		case "*":
			return keybuffer;
			
		case "aa":
			System.out.println();
			return "";
		case "ab":
			System.out.println("mdf");
			return "";
		case "ac":
			System.out.println("drg>");
			return "";
		case "ad":
			System.out.println("conv");
			return "";
		case "ae":
			System.out.println("ca");
			return "";			
		case "af":
			System.out.println("off");
			return "";
		case "ag":
			System.out.println("hyp-1");
			return "";
		case "am":
			System.out.println("xVy");
			return "";
		case "av":
			return keybuffer;
		case "aw":
			System.out.println("_,_");
			return "";
		case "ax":
			System.out.println("m-");
			return "";
		case "ay":
			return keybuffer;
		case "a1":
			System.out.println("sumxy");
			return "";
		case "a.":
			System.out.println("fse>");
			return "";
		case "a*":
			System.out.println(">hex");
			return "";

		case "ba":
			return keybuffer;
		case "bb":
			System.out.println();
			return "";
		case "bc":
			return brb("b");
		case "bd":
			return brb("b");
		case "be":
			return brb("b");
		case "bf":
			return brb("f");
		case "bg":
			return brb("b");
		case "bm":
			return brb("b");
		case "bv":
			return brb("b");
		case "bw":
			return brb("b");
		case "bx":
			return brb("b");
		case "by":
			return brb("b");
		case "b1":
			System.out.println("1 -> mode");
			return "";
		case "b.":
			return brb("b");
		case "b*":
			return brb("b");
			
		case "ga":
			return brb("ag");
		case "gb":
			return brb("b");
		case "gc":
			return brb("c");
		case "gd":
			return brb("d");
		case "ge":
			return brb("e");
		case "gf":
			return brb("f");
		case "gg":
			System.out.println();
			return "";
		case "gm":
			return brb("m");
		case "gv":
			return brb("v");
		case "gw":
			return brb("w");
		case "gx":
			return brb("x");
		case "gy":
			return brb("y");
		case "g1":
			return brb("1");
		case "g.":
			System.out.println();
			return "";
		case "g*":
			return brb("*");
			
		case "va":
			return brb("a");
		case "vb":
			return brb("b");
		case "vc":
			return brb("c");
		case "vd":
			return brb("d");
		case "ve":
			return brb("e");
		case "vf":
			return brb("f");
		case "vg":
			return brb("g");
		case "vm":
			System.out.println("rcl a");
			return "";
		case "vv":
			System.out.println();
			return "";
		case "vw":
			System.out.println();
			return "";
		case "vx":
			System.out.println("rcl m");
			return "";
		case "vy":
			return brb("y");
		case "v1":
			return brb("a1");
		case "v.":
			return brb(".");
		case "v*":
			return brb("*");

		case "wa":
			return brb("a");
		case "wb":
			return brb("b");
		case "wc":
			return brb("c");
		case "wd":
			return brb("d");
		case "we":
			return brb("e");
		case "wf":
			return brb("f");
		case "wg":
			return brb("g");
		case "wm":
			System.out.println("sto a");
			return "";
		case "wv":
			System.out.println();
			return "";
		case "ww":
			System.out.println();
			return "";
		case "wx":
			System.out.println("sto m");
			return "";
		case "wy":
			return brb("y");
		case "w1":
			return brb("1");
		case "w.":
			return brb(".");
		case "w*":
			return brb("*");
			
		case "*a":
			return brb("a");
		case "*b":
			return brb("b");
		case "*c":
			return brb("c");
		case "*d":
			return brb("d");
		case "*e":
			System.out.println("k mode");
			return "";
		case "*f":
			System.out.println("ce");
			return "";
		case "*g":
			return brb("g");
		case "*m":
			return brb("m");
		case "*v":
			return brb("v");
		case "*w":
			System.out.println();
			return "";
		case "*x":
			System.out.println();
			return "";
		case "*y":
			return brb("y");
		case "*1":
			return brb("1");
		case "*.":
			return brb("0.->input");
		case "**":
			return brb("*");
			
		case "ava":
			return brb("a");
		case "avb":
			return brb("b");
		case "avc":
			return brb("c");
		case "avd":
			return brb("d");
		case "ave":
			return brb("e");
		case "avf":
			return brb("f");
		case "avg":
			return brb("g");
		case "avm":
			System.out.println("alpha a");
			return "";
		case "avv":
			System.out.println();
			return "";
		case "avw":
			System.out.println();
			return "";
		case "avx":
			System.out.println("alpha m");
			return "";
		case "avy":
			return brb("y");
		case "av1":
			return brb("1");
		case "av.":
			return brb(".");
		case "av*":
			return brb("*");
			
		case "aya":
			return brb("a");
		case "ayb":
			return brb("b");
		case "ayc":
			return brb("c");
		case "ayd":
			return brb("d");
		case "aye":
			return brb("e");
		case "ayf":
			return brb("f");
		case "ayg":
			return brb("g");
		case "aym":
			return brb("m");
		case "ayv":
			return brb("v");
		case "ayw":
			return brb("w");
		case "ayx":
			return brb("x");
		case "ayy":
			return brb("y");
		case "ay1":
			System.out.println("1->tab");
			return "";
		case "ay.":
			return brb(".");
		case "ay*":
			return brb("*");
			
		case "baa":
			return brb("b");
		case "bab":
			return brb("b");
		case "bac":
			return brb("b");
		case "bad":
			return brb("b");
		case "bae":
			return brb("b");
		case "baf":
			return brb("f");
		case "bag":
			return brb("b");
		case "bam":
			return brb("b");
		case "bav":
			return brb("b");
		case "baw":
			return brb("b");
		case "bax":
			return brb("b");
		case "bay":
			return brb("b");
		case "ba1":
			return brb("b1");
		case "ba.":
			return brb("b");
		case "ba*":
			return brb("b");
			
		default:
			return "";
		}
	}
}

interface Procedure {
	public void execute();
}

interface KeyProcedure extends Procedure {}
interface TokenProcedure extends Procedure {}

class Calculator {
	protected int mode;
	protected int base;
	protected int coord;
	protected int statn;
	protected int drg;
	protected int fse;
	protected int tab;
	protected boolean n2df;
	protected boolean hyp;
	protected int store;
	
	protected String error;
//	private int zl;
//	protected String functDisplay;
//	protected String numDisplay;
//	protected StringBuilder out= new StringBuilder();
	public String[] sendkey(char k) {
		switch (k) {
		case 'a':
			setN2df(!n2df);
			break;
		case 'f':
			doReset();
			setN2df(false);
			break;
		case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
			if (isNoError()) {
				doAddToLastInput(k);
			}
			setN2df(false);
			break;
		case '*':
			if (isNoError()) {
				if (isNormal() && !isHex() && n2df) {
//					doHex();
//				} else if () {
//					getStatCReg();
				} else {
					doSzor();
				}
			}
			setN2df(false);
			break;
		case '/':
			if (isNoError()) {
				doPer();
			}
			setN2df(false);
			break;
		case '+':
			if (isNoError()) {
				doPlusz();
			}
			setN2df(false);
			break;
		case '-':
			if (isNoError()) {
				doMinusz();
			}
			setN2df(false);
			break;
		case '(':
			if (isNoError()) {
				doZaroNyit();
			}
			setN2df(false);
			break;
		case ')':
			if (isNoError()) {
				doZaroZar();
			}
			setN2df(false);
			break;
		case 'c':
			if (isNoError() && !isBin() && !isOct() && !isHex()) {
				if (n2df) {
					doEgyenlo();
					doDRGStepNext();
				} else {
					doDRGNext();
				}
			}
			setN2df(false);
			break;
		}
		
		
		
		String[] result= {"", "", "", "", "", ""};
		if (!isNoError()) {
			result[0]= "    ";
		}
		if (!isNoError()) {
			result[1]= error.toString();
		} else if (!isInputEmpty()) {
			result[1]= inputstrs.peek().toString();
		} else {
			result[1]= "_";
		}
//		result[2]= ((n2df) ? "2ndf;" : "")+((hyp) ? "hyp;" : "")+((drg==0) ? "deg;" : (drg==1) ? "rad;" : "grad;");
//		result[3]= String.format("%s", instructions.toString());
//		result[4]= String.format("%s", k);
//		result[5]= out.toString();
		return result;
	}
	
	private final Stack<StringBuilder> inputstrs= new Stack<StringBuilder>();
	public boolean isNoError() {
		return error==null;
	}
	public boolean isCplx() {
		return mode==1;
	}
	public boolean isNormal() {
		return mode==0;
	}
	public boolean isDec() {
		return isNormal() && base==0;
	}
	public boolean isBin() {
		return isNormal() && base==1;
	}
	public boolean isOct() {
		return isNormal() && base==2;
	}
	public boolean isHex() {
		return isNormal() && base==3;
	}
	public boolean isInputEmpty() {
		return inputstrs.isEmpty();
	}
	public void setN2df(boolean n2df) {
		this.n2df= n2df;
	}
	public void setHyp(boolean hyp) {
		this.hyp= !hyp;
	}
	public void doReset() {
		inputstrs.clear();
		error= null;
	}
	public void doPlusz() {
		
	}
	public void doMinusz() {
		
	}
	public void doSzor() {
		
	}
	public void doPer() {
		
	}
	public void doEgyenlo() {
		
	}
	public void doZaroNyit() {
		
	}
	public void doZaroZar() {
		
	}
	public void doDRGNext() {
		
	}
	public void doDRGStepNext() {
		doDRGNext();
	}
	public void doAddToLastInput(char c) {
		if (isInputEmpty()) {
			doCreateInput();
		}
		inputstrs.peek().append(c);
	}
	private void doCreateInput() {
		inputstrs.push(new StringBuilder());		
	}
}


class Input {
	private static int inputtype;
	public static String inputstr;
	public static void reset() {
		inputstr= "";
		inputtype= 0;
	}
	public static void append(char c) {
		if ('0'<=c && c<='9') {
			inputstr+= c;
/*		} else if (c=='/') {
			inputtype= 1;
		} else if {
		*/	
		}
	}
	public static Reg toReg() {
		return new Reg(inputtype, inputstr); 
	}
}

class Reg {
	private int type;
	private Object value;
	public Reg(int inputtype, String inputstr) {
		this.type= inputtype;
		this.value= Double.valueOf(inputstr);
	}
	public String toString() {
		return String.format("%s;%s", type, value); 
	}
}