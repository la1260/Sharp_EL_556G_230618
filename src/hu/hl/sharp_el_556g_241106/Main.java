package hu.hl.sharp_el_556g_241106;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
	private Form form;
	private Calculator calculator= new Calculator();
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
					form.update(calculator.sendkey(k));
				}
			}
			public void keyReleased(KeyEvent keyevent) {}
			public void keyTyped(KeyEvent keyevent) {}
		});
	}
}

class Calculator {
	protected int drg;
	protected int base;
	protected String error;
	protected boolean n2df;
	protected boolean hyp;
	private int zl;
	protected String functDisplay;
	protected String numDisplay;
	protected StringBuilder out= new StringBuilder();
	public String[] sendkey(char k) {
		String[] result= {"", "", "", "", "", ""};
		if (error!=null) {
			result[0]= "    ";
		} else if (functDisplay!=null) {
			result[0]= functDisplay;
/*		} else if (vanNyitottZarojel()) {
			result[0]= "  ( ";
		} else if (!vanUtasitas() || vanInput(inputs[0]) && instructions.peek().isKMode()) {
			result[0]= "    ";
		} else {
			result[0]= instructions.peek().getFunctionDisplay();
*/		}
		if (error!=null) {
			result[1]= error.toString();
		} else if (numDisplay!=null) {
			result[1]= numDisplay;
/*		} else if (!inputs[1].isEmpty()) {
			return inputs[1].toString();
*//*		} else if (vanInput(inputs[0])) {
			result[1]= inputs[0].toString();
		} else if (tobbAdatMintUtasitas()) {
			result[1]= String.format("%s", values.peek());
*/		} else {
			result[1]= "_";
		}
		result[2]= ((n2df) ? "2ndf;" : "")+((hyp) ? "hyp;" : "")+((drg==0) ? "deg;" : (drg==1) ? "rad;" : "grad;");
//		result[3]= String.format("%s", instructions.toString());
		result[4]= String.format("%s", k);
		result[5]= out.toString();
		return result;
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