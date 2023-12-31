package hu.hl.sharp_el_556g_230716;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Reg {
	private final BigDecimal[] bds= new BigDecimal[3];
	private static MathContext mc= new MathContext(10, RoundingMode.HALF_UP);
	private static DecimalFormat df0= new DecimalFormat("0.000000000E00");
	private static DecimalFormat df1= new DecimalFormat();
	private Type type;
	static {
		DecimalFormatSymbols dfs= new DecimalFormatSymbols();
		dfs.setDecimalSeparator('.');
		df1.setDecimalFormatSymbols(dfs);    	
		df1.setGroupingUsed(false);
		df1.setRoundingMode(RoundingMode.HALF_UP);		
	}
	public Reg() {
		
	}
	public void op(Operator operator) {
		switch (operator) {
		case Add:
		case Sub:
		case Mul: 
		}
	}
	public String[] out(Base base, Fse fse, int tab, int index) {
		switch (type) {
		case Nrm:
			switch (base) {
			case Dec:
				break;
			}
			break;
		case Hms:
		case Cfr: //index=0: int/num/den; index=1: num/den;
			switch (index) {
			case 0:
				String[] result= new String[3];
				result[0]= bds[0].toString()+"/"+bds[1].toString()+"/"+bds[2].toString();
				return result;
			case 1:
				break;
			}
		case Cor: //index=0: r, real; index=1: theta, imag;
			return out0(bds[index],  fse, tab); 
		}
		return null;
	}
	private String[] out0(BigDecimal bd, Fse fse, int tab) {
		String[] result= new String[]{"", "", ""};
		int e= Integer.valueOf(df0.format(bd).split("E")[1]);
		if (fse.equals(Fse.Eng)) { //eng
			int b= 2-Math.floorMod(e, 3);
			df1.applyPattern("000.000000000".substring(b, Integer.min(b+7, tab)+4)+"E00");
			result= df1.format(bd).split("E");
		} else if (fse.equals(Fse.Nrm) && -10<e && e<10) { //nrm
			df1.applyPattern("0.#########");
			result[0]= df1.format(bd);
			result[1]= "";
		} else if (fse.equals(Fse.Fix) && e<=-10) { //fix; 0<x<1e-9 -> 0
			result[0]= "0."+"0".repeat(tab);
			result[1]= "";
		} else if (fse.equals(Fse.Fix) && e<10) { //fix
			int b= Integer.min(9, 9-e);
			df1.applyPattern("0000000000.000000000".substring(b, Integer.min(b+11, tab+11)));
			result[0]= df1.format(bd);
			result[1]= "";
		} else { //sci
			df1.applyPattern("0.000000000".substring(0, tab+2)+"E00");
			result= df1.format(bd).split("E");
		}
		return result;
	}
}

enum Type {Nrm, Hms, Cfr, Cor}
enum Operator {Add, Sub, Mul, Div, Sin}