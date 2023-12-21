package hu.hl.sharp_el_556g_231010;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Stack;

class EL556Exception extends Exception {
	private static final long serialVersionUID = 1L;
	public final int id;
	public EL556Exception(int id) {
		this.id= id;
	}
	public String[] getError() {
		return new String[]{"er"+id, "", ""};
	}
}

public class Calculator {
	private DecimalFormat[] decimalformat= new DecimalFormat[2];
	private static final MathContext mathcontext= new MathContext(18, RoundingMode.HALF_UP);
	private String functiondisplay;
	private int inputindex; 
	private StringBuilder[] inputreg= {new StringBuilder(), new StringBuilder(), new StringBuilder()};
	private Stack<BigDecimal> stack0= new Stack<BigDecimal>();
	private Stack<Integer> stack1= new Stack<Integer>();
	private int zl;
	public Calculator() {
		DecimalFormatSymbols decimalformatsymbols= new DecimalFormatSymbols();
		decimalformatsymbols.setDecimalSeparator('.');
		decimalformat[0]= new DecimalFormat("0.000000000E00");
		decimalformat[1]= new DecimalFormat();
		decimalformat[1].setDecimalFormatSymbols(decimalformatsymbols);
		decimalformat[1].setDecimalSeparatorAlwaysShown(false);
	}
	public String[] key(int code) throws EL556Exception {
		switch (code) {
		case 9:
		case 8:
		case 7:
		case 6:
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			if (!stack1.isEmpty() && stack1.peek()==-1) { //ha a veremben előző művelet eredménye van, azt a gépeléssel töröljük 
				stack0.clear();
				stack1.clear();				
			}
			if (inputreg[1].length()+inputreg[2].length()<10) {
				if (inputindex==1 && inputreg[1].toString().equals("0")) {
					inputreg[inputindex].setLength(0);
				}
				inputreg[inputindex].append((char) (code | 0x30));
			}
			return inputToOut(functiondisplay, inputreg);
		case 16:
			reset();
			return inputToOut(functiondisplay, inputreg);
		case 17:
			inputindex= 2;
			return inputToOut(functiondisplay, inputreg);
		case 19:
			if (inputindex==2 && inputreg[inputindex].length()==0) {
				inputindex= 1;
			}
			inputreg[inputindex].deleteCharAt(inputreg[inputindex].length()-1);
			if (inputreg[1].isEmpty()) {
				inputreg[0].setLength(0);
				inputreg[1].append("0");
			}
			return inputToOut(functiondisplay, inputreg);
		case 20:
			if (inputreg[1].toString().equals("0")) {
				return null;
			} else {
				if (inputreg[0].isEmpty()) {
					inputreg[0].append("-");
				} else {
					inputreg[0].setLength(0);
				}
				return inputToOut(functiondisplay, inputreg);
			}
		case 21:
			functiondisplay= "";
			return regToOut(functiondisplay, execute(inputToReg(inputreg), -1));
			
		case 22:
			functiondisplay= " + ";
			execute(inputToReg(inputreg), zl<<8 | 0);
			return new String[]{functiondisplay, "_", ""};
		case 23:
			functiondisplay= " - ";
			execute(inputToReg(inputreg), zl<<8 | 1);
			return new String[]{functiondisplay, "_", ""};
		case 24:
			functiondisplay= " * ";
			execute(inputToReg(inputreg), zl<<8 | 2);
			return new String[]{functiondisplay, "_", ""};
		case 25:
			functiondisplay= " / ";
			execute(inputToReg(inputreg), zl<<8 | 3);
			return new String[]{functiondisplay, "_", ""};
		case 26:
			if (zl<7) {
				if (inputindex!=1 || !inputreg[1].toString().equals("0")) {
					System.out.println("1. inputban van adat");
					execute(inputToReg(inputreg), zl<<8 | 6);
				} else {
					if (stack1.isEmpty()) {
						System.out.println("2.2. inputban nincs adat, veremben nincs adat");
					} else {
						if (stack1.peek()==-1) {
							System.out.println("2.1.2. inputban nincs adat, veremben van adat, veremben levőt nem figyelembe venni");
							stack0.clear();
							stack1.clear();				
						} else {
							System.out.println("2.1.1. inputban nincs adat, veremben van adat, veremben levőt figyelembe venni");
						}
					}
				}
				zl++;
				return new String[]{" ( ", "_", ""};
			} else {
				reset();
				throw new EL556Exception(3);
			}
		case 27:
			functiondisplay= "";
			String[] result= regToOut(functiondisplay, execute(inputToReg(inputreg), (zl<<8)-1));
			if (0<zl) {
				zl--;
			}
			return result;
		default:
			throw new EL556Exception(0);
		}
	}
	private void reset() {
		functiondisplay= "";
		inputindex= 1;
		inputreg[0].setLength(0);
		inputreg[1].setLength(0);
		inputreg[1].append("0");
		inputreg[2].setLength(0);
		stack0.clear();
		stack1.clear();
		zl= 0;
	}
	private String[] inputToOut(String functiondisplay, StringBuilder[] input) {
		return new String[]{functiondisplay, input[0].toString()+input[1].toString()+"."+input[2].toString(), ""};
	}
	private BigDecimal inputToReg(StringBuilder[] input) {
		BigDecimal result= new BigDecimal(input[0].toString()+input[1].toString()+"."+input[2].toString());
		inputindex= 1;
		inputreg[0].setLength(0);
		inputreg[1].setLength(0);
		inputreg[1].append("0");
		inputreg[2].setLength(0);
		return result; 
	}
	private String[] regToOut(String functiondisplay, BigDecimal reg) {
		String[] result= {functiondisplay, "", ""};
		decimalformat[1].applyPattern("0.#########");
		result[1]= decimalformat[1].format(reg);
		if (!result[1].contains(".")) {
			result[1]+= ".";
		}
		result[2]= "";
		return result;
	}
	private BigDecimal execute(BigDecimal reg, int op) {
		System.out.println(stack0+"\t"+stack1);
		System.out.println("-----");
		if (!stack1.isEmpty() && (stack1.peek() & 0xff)==0xff) { //ha a veremben előző művelet eredménye van, akkor azt előszedni;  
			reg= stack0.pop();
			stack1.pop();
		}
		while (!stack1.isEmpty() && (op | 0x01)<=(stack1.peek() | 0x01)) {
			switch (stack1.pop() & 0xff) {
			case 0: reg= stack0.pop().add(reg, mathcontext); break; 
			case 1: reg= stack0.pop().subtract(reg, mathcontext); break;
			case 2: reg= stack0.pop().multiply(reg, mathcontext); break;
			case 3: reg= stack0.pop().divide(reg, mathcontext); break;
			case 6: reg= stack0.pop().multiply(reg, mathcontext); break;
			}
		}
		stack0.push(reg);
		stack1.push(op);
		System.out.println(stack0+"\t"+stack1);
		System.out.println("=====");
		return reg;
	}
}