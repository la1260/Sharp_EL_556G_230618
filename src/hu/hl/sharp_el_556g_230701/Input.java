package hu.hl.sharp_el_556g_230701;

import java.math.BigDecimal;

public class Input {
	private int ii;
	public String n0;
	public String i0;
	public String i1;
	public String n1;
	public String i2;
	public Input() {
		reset();
		key(16);
	}
	public void reset() {
		ii= 0;
		n0= "";
		i0= "0";
		i1= "";
		n1= "";
		i2= "";
	}
	public void key(int keycode) {
		switch (keycode) {
		case 9:
			appendInput("9");
			break;
		case 8:
			appendInput("8");
			break;
		case 7:
			appendInput("7");
			break;
		case 6:
			appendInput("6");
			break;
		case 5:
			appendInput("5");
			break;
		case 4:
			appendInput("4");
			break;
		case 3:
			appendInput("3");
			break;
		case 2:
			appendInput("2");
			break;
		case 1:
			appendInput("1");
			break;
		case 0:
			appendInput("0");
			break;
		case 16:
			reset();
			break;
		case 17:
			ii= Integer.max(ii, 1);
			break;
		case 18:
			ii= 2;
			i0= (i0.equals("0") && i1.isEmpty()) ? "1" : i0;
			i2= "00";
			break;
		case 19:
			switch (ii) {
			case 0:
				if (i0.length()==1) i0= "0";
				else i0= i0.substring(0, i0.length()-1);
				break;
			case 1:
				if (i1.isEmpty()) {
					ii= 0;
					key(19);
				}
				else i1= i1.substring(0, i1.length()-1);
				break;
			case 2:
				i2= ("0"+i2).substring(0, 2);
				break;
			}
			break;
		case 20:
			if (ii<2) {
				n0= (n0.isEmpty()) ? "-" : "";
			} else {
				n1= (n1.isEmpty()) ? "-" : "";
			}
			break;
		}
	}
	private void appendInput(String s) {
		switch (ii) {
		case 0:
			if (i0.equals("0")) i0= "";
			if (i0.length()<10) i0+= s;
			break;
		case 1:
			if (i0.length()+i1.length()<10) i1+= s;
			break;
		case 2:
			i2= (i2+s).substring(1);
			break;
		}
	}
	public BigDecimal getValue() {
		return new BigDecimal(n0+i0+((!i1.isEmpty()) ? "."+i1 : "")+((!i2.isEmpty()) ? "e"+n1+i2 : ""));
	}
	public String toString() {
		return getValue().toString();
	}
}