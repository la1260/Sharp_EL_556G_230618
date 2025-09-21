package hu.hl.sharp_el_556g_241106;

public class Main {
	private Form form= new Form();
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		private Form form= new Form();
		
		Input.reset();
		Input.append('0');
		Input.append('1');
		Input.append('9');
		System.out.print(Input.toReg());
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