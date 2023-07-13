package hu.hl.sharp_el_556g_230701;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import hu.hl.sharp_el_556g_230701.Main.Base;
import hu.hl.sharp_el_556g_230701.Main.Fse;

public class Stack {
	private final StackListener stacklistener;
	private static final MathContext mathcontext= new MathContext(18, RoundingMode.HALF_UP);
	public java.util.Stack<BigDecimal> stack0= new java.util.Stack<BigDecimal>();
	public java.util.Stack<Integer> stack1= new java.util.Stack<Integer>();
	private int pl;
	public Stack(StackListener stacklistener) {
		this.stacklistener= stacklistener;
	}
	public void reset() {
		stack0.clear();
		stack1.clear();
		pl= 0;
		push(BigDecimal.ZERO, 21); 
	}
	public BigDecimal push(BigDecimal operand, int operator) {
		BigDecimal result= null;
		switch (operator) {
		case 21: // =
			if (operand!=null) stack0.push(operand);
			while (executeLastOperator());
			result= stack0.pop();
			pl= 0;
			break;
		case 22: // +
			if (operand!=null) stack0.push(operand);
			if (stack0.size()==stack1.size()) stack1.pop(); //kiszedi az előző műveletet, ha újat nyomtunk operandus nélkül
			while ((pl<<8 | 22)<=getLastOperator()) executeLastOperator();
			stack1.push(pl<<8 | operator);
			break;
		case 23: // -
			if (operand!=null) stack0.push(operand);
			if (stack0.size()==stack1.size()) stack1.pop();
			while ((pl<<8 | 22)<=getLastOperator()) executeLastOperator();
			stack1.push(pl<<8 | operator);
			break;
		case 24: // *
			if (operand!=null) stack0.push(operand);
			if (stack0.size()==stack1.size()) stack1.pop();
			while ((pl<<8 | 24)<=getLastOperator()) executeLastOperator();
			stack1.push(pl<<8 | operator);
			break;
		case 25: // /
			if (operand!=null) stack0.push(operand);
			if (stack0.size()==stack1.size()) stack1.pop();
			while ((pl<<8 | 24)<=getLastOperator()) executeLastOperator();
			stack1.push(pl<<8 | operator);
			break;
		case 26: // (
			if (operand!=null) stack0.push(operand);
			if (stack0.isEmpty()) stack0.push(BigDecimal.ONE);
			if (stack1.size()<stack0.size()) {
				stack1.push(pl<<8 | 26);
			}
			if(pl<7) {
				pl++;
			}
			break;
		case 27: // )
			if (operand!=null) stack0.push(operand);
			while (pl<<8<=getLastOperator()) executeLastOperator();
			if(0<pl) {
				pl--;
				while ((pl<<8 | 24)<=getLastOperator()) executeLastOperator();
			}
			break;
		}
		String[] s= print((stack0.isEmpty()) ? result : stack0.peek(), Base.Dec, Fse.Nrm, 4);
		stacklistener.update("", s[0], s[1]);
		return result;
	}
	private int getLastOperator() {
		return (stack1.isEmpty()) ? -1 : stack1.peek();
	}
	private boolean executeLastOperator() {
		if (!stack1.isEmpty()) {
			BigDecimal operand= stack0.pop();
			switch (stack1.pop() & 0xff) {
//			case 32: this.operand.peek().or(operand); break;
//			case 33: this.operand.peek().xor(operand); break;
			case 22: stack0.push(stack0.pop().add(operand, mathcontext)); break;
			case 23: stack0.push(stack0.pop().subtract(operand, mathcontext)); break;
			case 24:
			case 26: stack0.push(stack0.pop().multiply(operand, mathcontext)); break;
			case 25: stack0.push(stack0.pop().divide(operand, mathcontext)); break;
			}
		}
		return !stack1.isEmpty();
	}
	
	
	private static DecimalFormat df= new DecimalFormat();
    static {
		DecimalFormatSymbols dfs= new DecimalFormatSymbols();
		dfs.setDecimalSeparator('.');
		df.setDecimalFormatSymbols(dfs);    	
		df.setGroupingUsed(false);
		df.setRoundingMode(RoundingMode.HALF_UP);
    }
	private String format(BigDecimal bd, String pattern) {
		df.applyPattern(pattern);
		df.setDecimalSeparatorAlwaysShown(true);
		return df.format(bd);
	}
	private String[] print(BigDecimal bd, Base base, Fse fse, int tab) {
		String[] result= {null, null};
		switch (base) {
		case Bin:
			result[0]= bd.toBigInteger().toString(2);
			result[1]= "b";
			break;
		case Oct:
			result[0]= bd.toBigInteger().toString(8);
			result[1]= "o";
			break;
		case Dec:
			int exp= bd.precision()-bd.scale()-1;
			switch (fse) {
			case Nrm:
				if (-10<exp && exp<10) {
					result[0]= format(bd, "#########0.#########".substring(Integer.min(9, 9-exp), Integer.min(20, 20-exp)));
					result[1]= "";
				} else {
					return print(bd, base, Fse.Sci, -1);
				}
				break;
			case Fix:
				if (10<=exp) {
					return print(bd, base, Fse.Sci, tab);
				} else {
					if (exp<=-10) {
						bd= BigDecimal.ZERO;
						exp= bd.precision()-bd.scale()-1;
					}
					result[0]= format(bd, "#########0.000000000".substring(Integer.min(9, 9-exp), Integer.min(11+tab, 20-exp)));
					result[1]= "";
				}
				break;
			case Sci:
				if (tab==-1) {
					result= format(bd, "0.#########E00").split("E");
				} else {
					result= format(bd, "0."+"000000000".substring(0, tab)+"E00").split("E");
				}
				break;
			case Eng:
				result= format(bd, "000.000000000".substring(Math.floorMod(2-exp, 3), tab+4)+"E00").split("E");
				break;
			}
			break;
		case Hex:
			result[0]= bd.toBigInteger().toString(16);
			result[1]= "h";
			break;
		}
		return result;
	}	
}

interface StackListener {
	public void update(String s0, String s1, String s2);
}
