package hu.hl.sharp_el_556g_230701;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import hu.hl.sharp_el_556g_230701.Main.Base;
import hu.hl.sharp_el_556g_230701.Main.Fse;

public class Calculator {
	private final CalculatorListener calculatorlistener;
	public Stack stack= new Stack();
	public Calculator(CalculatorListener calculatorlistener) {
		this.calculatorlistener= calculatorlistener;
		key(16);
	}
	private Input input;
	private BigDecimal result;
	private int prevopcode;
	private BigDecimal previnput;
	public void key(int keycode) {
		String[] s;
		if (-1<keycode)	{
			if (keycode<21 && keycode!=16) {
				if (keycode==19 && input==null) {
					prevopcode= stack.getLastOperator();
				} else {
					if (input==null) input= new Input();
					input.key(keycode);
				}
				s= new String[]{input.n0+input.i0+"."+input.i1, (input.i2.isEmpty()) ? "" : input.n1+input.i2};
			} else {
				if (keycode==16) {
					stack.reset();
					prevopcode= -1;
					result= stack.push(BigDecimal.ZERO, 21);
				} else if (keycode==21 && -1<prevopcode) {
					if (input!=null) {
						stack.reset();
						result= stack.push(input.getValue(), prevopcode);
					}
					result= stack.push(previnput, 21);
					stack.push(result, prevopcode);
				} else if (input!=null) {
					result= stack.push(previnput= input.getValue(), keycode);
				} else if (result!=null && keycode!=26) {
					result= stack.push(result, keycode);
				} else if (keycode!=21){
					result= stack.push(null, keycode);
				}
				input= null;
				s= (result==null) ? new String[]{"ide kell vmi", ""} : print(result, Base.Dec, Fse.Nrm, 4);
			}
			update("", s[0], s[1]);
			System.out.println(stack.stack0);
			System.out.println(stack.stack1);
		}
	}
	public void update(String s0, String s1, String s2) {
		calculatorlistener.onChange(s0, s1, s2);
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

interface CalculatorListener {
	public void onChange(String s0, String s1, String s2);
}