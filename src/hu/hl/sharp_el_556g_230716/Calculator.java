package hu.hl.sharp_el_556g_230716;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.TreeMap;

public class Calculator {
	private Var var= new Var();
	private Reg ans= new Reg();
	public String[] key(int keycode) {
		switch (keycode) {
		case 16:
			var.putInt("inputtype", 0);
			var.putString("inputintsgn", "");
			var.putString("inputint", "0");
			var.putString("inputfract", "");
			var.putString("inputexpsgn", "");
			var.putString("inputexp", "");
			var.putBigDecimal("ans", null);
			break;
		case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
			switch (var.getInt("inputtype")) {
			case 0:
				if (var.getString("inputint").equals("0")) var.putString("inputint", "");
				if (var.getString("inputint").length()+var.getString("inputfract").length()<10) var.putString("inputint", var.getString("inputint")+keycode);
				break;
			case 1:
				if (var.getString("inputint").length()+var.getString("inputfract").length()<10) var.putString("inputfract", var.getString("inputfract")+keycode);
				break;
			case 2:
				var.putString("inputexp", (var.getString("inputexp")+keycode).substring(1));
				break;
			}
			break;
		case 19:
			switch (var.getInt("inputtype")) {
			case 0:
				var.putString("inputint", var.getString("inputint").substring(0, var.getString("inputint").length()-1));
				if (var.getString("inputint").isEmpty()) var.putString("inputint", "0");
				break;
			case 1:
				if (var.getString("inputfract").isEmpty()) {
					var.putInt("inputtype", 0);
					key(19);
				} else var.putString("inputfract", var.getString("inputfract").substring(0, var.getString("inputfract").length()-1));
				break;
			case 2:
				var.putString("inputexp", ("0"+var.getString("inputexp")).substring(0, 2));
				break;
			}
			break;
		case 17:
			if (var.getInt("inputtype")==0) var.putInt("inputtype", 1);
			break;
		case 18:
			if (var.getString("inputexp").isEmpty()) {
				if (var.getString("inputint").equals("0") && var.getString("inputfract").isEmpty()) var.putString("inputint", "1");
				var.putString("inputexp", "00");
			}
			if (var.getInt("inputtype")!=2) var.putInt("inputtype", 2);
			break;
		case 20:
			switch (var.getInt("inputtype")) {
			case 0:
			case 1:
				if (var.getString("inputintsgn").isEmpty()) var.putString("inputintsgn", "-"); 
				else var.putString("inputintsgn", "");
				break;
			case 2:
				if (var.getString("inputexpsgn").isEmpty()) var.putString("inputexpsgn", "-"); 
				else var.putString("inputexpsgn", "");
				break;
			}
			break;
		case 21:
			inputToAns(var);
			break;
		case 22:
			
			break;
		default:
			System.out.println(keycode);
			break;
		}
		
		System.out.println(var);
		String[] result= new String[]{"", "", ""};
		if (var.getBigDecimal("ans")==null) {
			result[0]= var.getString("inputintsgn")+var.getString("inputint")+"."+var.getString("inputfract");
			result[1]= var.getString("inputexpsgn")+var.getString("inputexp");
		} else {
			//result= regToOut(var, "ans");
		}
		return result;
	}
	private static void inputToAns(Var var) {
		int inputtype= var.getInt("inputtype");
		switch (inputtype) {
		case 0:
			var.putBigDecimal("ans", new BigDecimal(var.getString("inputintsgn")+var.getString("inputint")));
			break;
		case 1:
			var.putBigDecimal("ans", new BigDecimal(var.getString("inputintsgn")+var.getString("inputint")+"."+var.getString("inputfract")));
			break;
		case 2:
			var.putBigDecimal("ans", new BigDecimal(var.getString("inputintsgn")+var.getString("inputint")+"."+var.getString("inputfract")+"E"+var.getString("inputexpsgn")+var.getString("inputexp")));
			break;
		}
	}
}

class Var {
	private TreeMap<String, Integer> ints= new TreeMap<String, Integer>();
	private TreeMap<String, String> strings= new TreeMap<String, String>();
	private TreeMap<String, BigDecimal> bigdecimals= new TreeMap<String, BigDecimal>();
	public Var() {
		putInt("fse", Fse.Eng.ordinal());
		putInt("tab", 4);
	}
	public int getInt(String id) {
		return ints.get(id);
	}
	public void putInt(String id, int val) {
		ints.put(id, val);
	}
	public String getString(String id) {
		return strings.get(id);
	}
	public void putString(String id, String val) {
		strings.put(id, val);
	}
	public BigDecimal getBigDecimal(String id) {
		return bigdecimals.get(id);
	}
	public void putBigDecimal(String id, BigDecimal val) {
		bigdecimals.put(id, val);
	}
	public String toString() {
		return ints.toString()+"\r\n"+strings.toString()+"\r\n"+bigdecimals.toString();
	}
}

enum Base {Dec, Bin, Oct, Hex}
enum Fse {Nrm, Fix, Sci, Eng}
