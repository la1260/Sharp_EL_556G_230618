package hu.hl.sharp_el_556g_230926;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;

public class Calculator {
	public static enum Mode {NormHex, NormDec, NormOct, NormBin, Vle3, CplxXY, CplxPol, Stat0, Stat1, Stat2, Stat3, Stat4, Stat5, Stat6};
	public static enum Fse {Nrm, Fix, Sci, Eng};
	public static enum Tab {Tab0, Tab1, Tab2, Tab3, Tab4, Tab5, Tab6, Tab7, Tab8, Tab9};
	public static enum KeyComm {C, K0, K1, K2, K3, K4, K5, K6, K7, K8, K9, KA, KB, KC, KD, KE, KF, Dot, Exp, Equals, Back, Bin, Oct, Dec, Hex, Unkn};
	private Mode[] mode= new Mode[2];
	private Fse[] fse= new Fse[2];
	private Tab tab;
	private int inputindex;
	private String[] inputstr;
	public static enum RegIds {Ans}
	private BigDecimal[] regs= new BigDecimal[RegIds.values().length];
	private static DecimalFormat[] decimalformat= new DecimalFormat[2];
	static {
		decimalformat[0]= new DecimalFormat("0.000000000E00");
		decimalformat[1]= new DecimalFormat();
	}
	public void setMode(Mode mode) {
		this.mode[0]= mode;
	}
	public void setFse(Fse fse) {
		this.fse[0]= fse;
	}
	public void setTab(Tab tab) {
		this.tab= tab;
	}	
	public String[] key(KeyComm keycomm) {
		switch (keycomm) {
		case C:
			inputindex= 0;
			inputstr= new String[] {"0", "", "", "", "", ""};
			break;
		case KF:
		case KE:
		case KD:
		case KC:
		case KB:
		case KA:
			if (inputindex==-1) {
				inputindex= 0;
			}
			if (inputstr[0].length()+inputstr[1].length()<10 && mode[0].equals(Mode.NormHex))
				if (inputindex==0 && inputstr[0].equals("0")) {
					inputstr[0]= "";
				}
				inputstr[inputindex]+= String.valueOf((char) (keycomm.ordinal()-KeyComm.K9.ordinal() | 0x60));
			break;
		case K9:
		case K8:
			if (mode[0].equals(Mode.NormOct)) {
				break;
			}
		case K7:
		case K6:
		case K5:
		case K4:
		case K3:
		case K2:
			if (mode[0].equals(Mode.NormBin)) {
				break;
			}
		case K1:
		case K0:
			if (inputindex==-1) {
				inputindex= 0;
			}
			if ((inputindex==0 || inputindex==1) && inputstr[0].length()+inputstr[1].length()<10) {
				if (inputindex==0 && inputstr[0].equals("0")) {
					inputstr[0]= "";
				} 
				inputstr[inputindex]+= String.valueOf((char) (keycomm.ordinal()-KeyComm.K0.ordinal() | 0x30));
			} else if (inputindex==2) {
				inputstr[2]= inputstr[2].charAt(1)+String.valueOf((char) (keycomm.ordinal()-KeyComm.K0.ordinal() | 0x30));
			}
			break;
		case Dot:
			if (inputindex==0 && mode[0].equals(Mode.NormDec)) {
				inputindex= 1;
			}
			break;
		case Exp:
			if ((inputindex==0 || inputindex==1) && mode[0].equals(Mode.NormDec)) {
				if (inputindex==0 && inputstr[0].equals("0")) {
					inputstr[0]= "1";
				}
				inputindex= 2;
				inputstr[2]= "00";
			}
			break;
		case Back:
			if ((inputindex==0 || inputindex==1) && (mode[0].equals(Mode.NormBin) || mode[0].equals(Mode.NormOct) || mode[0].equals(Mode.NormDec) || mode[0].equals(Mode.NormHex))) {
				if (0<inputstr[1].length()) {
					inputstr[1]= inputstr[1].substring(0, inputstr[1].length()-1);
				} else {
					if (inputindex==1) {
						inputindex= 0;
					}
					if(1<inputstr[0].length()){
						inputstr[0]= inputstr[0].substring(0, inputstr[0].length()-1);
					} else if (!inputstr[0].equals("0")) {
						inputstr[0]="0";
					}
				}
			} else if (inputindex==2 && mode[0].equals(Mode.NormDec)) {
				inputstr[2]= "0"+inputstr[2].charAt(0);
			}
			break;
		case Equals:
			if (inputindex!=-1) {
				regs[RegIds.Ans.ordinal()]= inputToReg();
				inputindex= -1;
			}
			break;
		case Bin:
			if (!mode[0].equals(Mode.NormBin)) {
				mode[1]= Mode.NormBin;
				return key(KeyComm.Equals);
			}
			break;
		case Oct:
			if (!mode[0].equals(Mode.NormOct)) {
				mode[1]= Mode.NormOct;
				return key(KeyComm.Equals);
			}
			break;
		case Dec:
			if (!mode[0].equals(Mode.NormDec)) {
				mode[1]= Mode.NormDec;
				return key(KeyComm.Equals);
			}
			break;
		case Hex:
			if (!mode[0].equals(Mode.NormHex)) {
				mode[1]= Mode.NormHex;
				return key(KeyComm.Equals);
			}
			break;
		}
		String[] result= new String[3];
		if (inputindex==-1) {
			mode[0]= mode[1];
			mode[1]= null;
			result= regToOutput(regs[RegIds.Ans.ordinal()]);
			switch (mode[0]) {
			case NormBin:
				result[1]= "b";
				break;
			case NormOct:
				result[1]= "o";
				break;
			case NormHex:
				result[1]= "h";
				break;
			}			
		} else {
			result[0]= inputstr[0]+"."+inputstr[1];
			if (inputindex==0) {
				switch (mode[0]) {
				case NormBin:
					result[1]= "b";
					break;
				case NormOct:
					result[1]= "o";
					break;
				case NormHex:
					result[1]= "h";
					break;
				}
			} else if (inputindex==2) {
				result[1]= inputstr[2];
			}
		}
		return result;
	}
	private BigDecimal inputToReg() {
		BigDecimal result= null;
		switch (mode[0]) {
		case NormBin:
			result= new BigDecimal(new BigInteger(inputstr[0], 2));
			break;
		case NormOct:
			result= new BigDecimal(new BigInteger(inputstr[0], 8));
			break;
		case NormDec:
			switch (inputindex) {
			case 0:
				result= new BigDecimal(inputstr[0]);
				break;
			case 1:
				result= new BigDecimal(inputstr[0]+"."+inputstr[1]);
				break;
			case 2:
				result= new BigDecimal(inputstr[0]+"."+inputstr[1]+"e"+inputstr[2]);
				break;
			}
			break;
		case NormHex:
			result= new BigDecimal(new BigInteger(inputstr[0], 16));
			break;
		}
		inputindex= 0;
		inputstr= new String[] {"0", "", "", "", "", ""};
		return result;
	}
	private String[] regToOutput(BigDecimal reg) {
		String[] result= new String[]{"", "", ""};
		switch (mode[0]) {
		case NormBin:
			result[0]= reg.toBigInteger().toString(2);
			break;
		case NormOct:
			result[0]= reg.toBigInteger().toString(8);
			break;
		case NormDec:
			int e= Integer.valueOf(decimalformat[0].format(reg).split("E")[1]);
			if (fse[0].equals(Fse.Eng)) { //eng
				int b= 2-Math.floorMod(e, 3);
				decimalformat[1].applyPattern("000.000000000".substring(b, Integer.min(b+7, tab.ordinal())+4)+"E00");
				result= decimalformat[1].format(reg).split("E");
			} else if (fse[0].equals(Fse.Nrm) && -10<e && e<10) { //nrm
				decimalformat[1].applyPattern("0.#########");
				result[0]= decimalformat[1].format(reg);
				result[1]= "";
			} else if (fse[0].equals(Fse.Fix) && e<=-10) { //fix; 0<x<1e-9 -> 0
				result[0]= "0."+"0".repeat(tab.ordinal());
				result[1]= "";
			} else if (fse[0].equals(Fse.Fix) && e<10) { //fix
				int b= Integer.min(9, 9-e);
				decimalformat[1].applyPattern("0000000000.000000000".substring(b, Integer.min(b+11, tab.ordinal()+11)));
				result[0]= decimalformat[1].format(reg);
				result[1]= "";
			} else { //sci
				decimalformat[1].applyPattern("0.000000000".substring(0, tab.ordinal()+2)+"E00");
				result= decimalformat[1].format(reg).split("E");
			}
			break;
		case NormHex:
			result[0]= reg.toBigInteger().toString(16);
			break;
		default:
			result= null;
			break;
		}
		return result;
	}
}