package hu.hl.sharp_el_556g_241106;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeMap;

interface IProcess {
	public void Execute();
}

public class Main {
	private final Form form;
	private Calculator1 calculator= new Calculator1();
	private StringBuilder in= new StringBuilder();
	
/*	private TreeMap<String, KeyProcedure> keysequences= new TreeMap<String, KeyProcedure>();
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
					brb(k);
				}
			}
			public void keyReleased(KeyEvent keyevent) {}
			public void keyTyped(KeyEvent keyevent) {}
		});
	}
	private void brb(char c) {
		switch (c) {
		case 'f':
			Input.goReset(in);
			break;
		case 'e':
			Input.addBack(in);
			break;
		case 's':
			Input.addExp(in);
			break;
		case 't':
			Input.addSlash(in);
			break;
		case 'u':
			Input.addDegree(in);
			break;
		case 'y':
			Input.addNeg(in);
			break;
		case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
			Input.addNum(in, c);
			break;
		case '.':
			Input.addDot(in);
			break;
		}		
		String[] ss= Output.getDisplay(in);
		ss[3]= String.format("%s,%s,", calculator.getMode0(), calculator.getMode1());
		form.update(ss);
	}
}

class Output {
	public static String[] getDisplay(StringBuilder sb) {
		String[] result= new String[7];
		if (Input.isUres(sb.toString())) {
			result[1]= "0";
		} else {
			result[1]= String.format("%s", sb.toString());
		}
		return result;
	}
}

class Input {
	public static void goReset(StringBuilder sb) {
		sb.setLength(0);
	}
	public static void addBack(StringBuilder sb) {
		if (isPontUtso(sb.toString())) {
			sb.deleteCharAt(sb.length()-1);
		}
		if (!isUres(sb.toString())) {
			sb.deleteCharAt(sb.length()-1);
		}
		if (isCsakMinusz(sb.toString())) {
			sb.deleteCharAt(sb.length()-1);
		}
		if (isExp(sb.toString()) || isFok(sb.toString())) {
			sb.insert(sb.length()-1, "0");
		}
		if (isUres(sb.toString())) {
			sb.setLength(0);
			sb.append("0");
		}
	}
	public static void addSlash(StringBuilder sb) {
		if (isPerMehet(sb.toString())) {
			sb.append("/");
		}
	}
	public static void addExp(StringBuilder sb) {
		if (isExpMehet(sb.toString())) {
			if (isUres(sb.toString())) {
				addNum(sb, '1');
			}
			sb.append("e00");
		}
	}
	public static void addNeg(StringBuilder sb) {
		if (isExp(sb.toString())) {
			if (isNegativ(sb.toString())) {
				sb.deleteCharAt(sb.indexOf("e")+1);
			} else {
				sb.insert(sb.indexOf("e")+1, "-");
			}
		} else {
			if (!isUres(sb.toString())) {
				if (isNegativ(sb.toString())) {
					sb.deleteCharAt(0);
				} else {
					sb.insert(0, "-");
				}
			}
		}
	}
	public static void addNum(StringBuilder sb, char c) {
		if (isSzamMehet(sb.toString())) {
			if (isNulla(sb.toString())) {
				sb.setLength(0);
			}
			if (isExp(sb.toString()) || isFok(sb.toString())) {
				sb.deleteCharAt(sb.length()-2);
			}
			sb.append(c);
		}
	}
	public static void addDot(StringBuilder sb) {
		if (isUres(sb.toString())) {
			sb.append("0");
		}
		if (isPontMehet(sb.toString())) {
			sb.append(".");
		}
	}
	public static void addDegree(StringBuilder sb) {
		if (isFokMehet(sb.toString())) {
			sb.append("°00");
		} else if (isFokig(sb.toString())) {
			sb.append("'00");
		} else if (isPercig(sb.toString())) {
			sb.append(".00");
		}
	}
	private static boolean isPerMehet(String s) {
		return s.matches("^-?\\d{1,3}(\\d{0,3}|/\\d{1,3})$") && !isNulla(s);
	}
	private static boolean isSzamMehet(String s) {
		return (!isPer(s) || s.matches(".*/\\d{0,2}$")) && s.matches("^-?(\\d{0,9}|[\\d\\.]{2,10})$") || isExp(s) || isFok(s);
	}
	private static boolean isPontMehet(String s) {
		return !isPont(s) && !isPer(s) && !isExp(s) && !isFok(s);
	}
	private static boolean isExpMehet(String s) {
		return !isExp(s) && !isPer(s) && !isFok(s);
	}
	private static boolean isFokMehet(String s) {
		return !isFok(s) && !isExp(s) && !isPer(s) && !isPont(s) && !isUres(s) && s.matches("^-?\\d{0,4}$");
	}
	public static boolean isUres(String s) {
		return s.isEmpty();
	}
	public static boolean isCsakMinusz(String s) {
		return s.equals("-");
	}
	private static boolean isNulla(String s) {
		return s.equals("0");
	}
	private static boolean isPer(String s) {
		return s.contains("/");
	}
	private static boolean isExp(String s) {
		return s.contains("e");
	}
	private static boolean isNegativ(String s) {
		return (isExp(s)) ? s.charAt(s.indexOf("e")+1)=='-' : s.startsWith("-");
	}
	private static boolean isPont(String s) {
		return s.contains(".");
	}
	private static boolean isPontUtso(String s) {
		return s.endsWith(".");
	}
	private static boolean isFok(String s) {
		return s.contains("°");
	}
	private static boolean isFokig(String s) {
		return s.charAt(s.length()-3)=='°';
	}
	private static boolean isPercig(String s) {
		return s.charAt(s.length()-3)=='\'';
	}
}

class Calculator1 extends Calculator0 {
	public void appendInput(char key) {
		switch (key) {
		case 0:
		case 1:
		}
	}
	public void goPlus() {
	}
	public void goSin() {
	}
	public void goInvSin() {
	}
	public void goHypSin() {
	}
	public void goHypInvSin() {
	}
	public void rcl(char reg) {
	}
}