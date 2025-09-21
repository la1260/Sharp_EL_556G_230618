package hu.hl.sharp_el_556g_250119;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		Value v= new Value("12d");
	}
}

class Value {
	private Object value;
	private int type; //0: dec double; 1: 1: a/b/c;
	public Value(String input) {
		if (input.contains("/")) {
			
		} else if (input.contains("i")) {
			
		} else if (input.contains("r")) {
			
		} else if (input.contains("°")) {
			
		} else {
			value= Double.valueOf(input); //dec float
		}
		
		switch (this.type= type) {
		case 0:
			break;
		case 1:
			value= new int[]{1, 2, 3, 4}; // a°b'c".d
			break;
		case 2:
			String[] s= input.split("/");
			int b= Integer.valueOf(input.split("/")[1]);
			int c= Integer.valueOf(input.split("/")[2]);
			Common.getGCD(type, type);
//			value= new int[]{a, b, c)}; // a/b/c
			break;
		case 3:
			value= new double[]{1, 2}; // a+bi
			break;
		}
	}
	public void toType(int type) {
		
	}
	public boolean isError() {
		return false;
	}
	public String out() {
		switch (type) {
//		case 0: return String.format("%s", d[0]);
//		case 1: return String.format("%s", d[0]);
		default: return null;
		}
	}
}

class ToHex extends Instr {
	public void execute() {
		
	}
	public String toString() {
		return String.format("[%s, %s, %s, %s]", lvl[2], lvl[1], lvl[0], id);
	}
}

abstract class Instr implements Comparable<Instr> {
	protected String id;
	protected final int[] lvl= {0, 0, 0};
	abstract public void execute();
	public int compareTo(Instr instr) {
		if (Integer.compare(lvl[2], instr.lvl[2])==0) {
			if (Integer.compare(lvl[1], instr.lvl[1])==0) {
				return Integer.compare(lvl[0], instr.lvl[0]);
			} else {
				return Integer.compare(lvl[1], instr.lvl[1]);
			}
		} else {
			return Integer.compare(lvl[2], instr.lvl[2]);
		}
	}	
	abstract public String toString();
}

class Common {
	public static long getGCD(long a, long b) {
		a= Math.abs(a);
		b= Math.abs(b);
		if (a<b) {
			return getGCD(b, a);
		} else {
			if (a % b==0) {
				return b;
			} else {
				return getGCD(b, a % b);
			}
		}
	}
	public static long getLCM(long a, long b) {
		return Math.floorDiv(a*b, getGCD(a, b));
	}	
}