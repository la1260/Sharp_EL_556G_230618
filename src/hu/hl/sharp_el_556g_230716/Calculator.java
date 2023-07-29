package hu.hl.sharp_el_556g_230716;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Calculator {
	private String[] input= new String[]{"", "", ""};
	public String[] key(int c) {
		String[] result= new String[]{"", "", ""};
		switch (c) {
		case 16:
			input[0]= "0"; 
			input[1]= ""; 
			input[2]= ""; 
			break;
		case 0:
			if (input[0].equals("0")) input[0]= "";
			if (input[0].length()+input[1].length()<10) input[0]+= "0"; 
			break;
		case 1:
			if (input[0].equals("0")) input[0]= "";
			if (input[0].length()+input[1].length()<10) input[0]+= "1"; 
			break;
		case 2:
			if (input[0].equals("0")) input[0]= "";
			if (input[0].length()+input[1].length()<10) input[0]+= "2"; 
			break;
		case 3:
			if (input[0].equals("0")) input[0]= "";
			if (input[0].length()+input[1].length()<10) input[0]+= "3"; 
			break;
		case 4:
			if (input[0].equals("0")) input[0]= "";
			if (input[0].length()+input[1].length()<10) input[0]+= "4"; 
			break;
		case 5:
			if (input[0].equals("0")) input[0]= "";
			if (input[0].length()+input[1].length()<10) input[0]+= "5"; 
			break;
		case 6:
			if (input[0].equals("0")) input[0]= "";
			if (input[0].length()+input[1].length()<10) input[0]+= "6"; 
			break;
		case 7:
			if (input[0].equals("0")) input[0]= "";
			if (input[0].length()+input[1].length()<10) input[0]+= "7"; 
			break;
		case 8:
			if (input[0].equals("0")) input[0]= "";
			if (input[0].length()+input[1].length()<10) input[0]+= "8"; 
			break;
		case 9:
			if (input[0].equals("0")) input[0]= "";
			if (input[0].length()+input[1].length()<10) input[0]+= "9"; 
			break;
		}
		return result= input;
	}
}

enum Base {Bin, Oct, Dec, Hex}
enum Fse {Nrm, Fix, Sci, Eng}
