package hu.hl.sharp_el_556g_250202;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
	private StringBuilder[] in= new StringBuilder[] {new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder(), new StringBuilder()};
	private HashMap<String, Integer> ints= new HashMap<String, Integer>();
	private int _2ndf;
	private int intype;// 0=dec int; 1=hex; 2=oct; 3=bin; 4= dec float; 5= dec exp; 6= a B/c; 7= a b/C; 8= d°M's.d; 9= d°m'S.d; 10= d°m's.D; 11= conv; 12=cnst;
	public static void main(String[] args) {
/*		
		System.out.println("".matches("^-?(?:\\d{0,9}|(?!.{11})\\d+\\.\\d*)$"));
		System.out.println("1.".matches("^-?(?:\\d{0,9}|(?!.{11})\\d+\\.\\d*)$"));
		System.out.println("12.".matches("^-?(?:\\d{0,9}|(?!.{11})\\d+\\.\\d*)$"));
		System.out.println("123.".matches("^-?(?:\\d{0,9}|(?!.{11})\\d+\\.\\d*)$"));
		System.out.println("1234.".matches("^-?(?:\\d{0,9}|(?!.{11})\\d+\\.\\d*)$"));
		System.out.println("12345.".matches("^-?(?:\\d{0,9}|(?!.{11})\\d+\\.\\d*)$"));
		System.out.println("123456.".matches("^-?(?:\\d{0,9}|(?!.{11})\\d+\\.\\d*)$"));
		System.out.println("1234567.".matches("^-?(?:\\d{0,9}|(?!.{11})\\d+\\.\\d*)$"));
		System.out.println("12345678.".matches("^-?(?:\\d{0,9}|(?!.{11})\\d+\\.\\d*)$"));
		System.out.println("123456789.".matches("^-?(?:\\d{0,9}|(?!.{11})\\d+\\.\\d*)$"));
		System.out.println("1234567890.".matches("^-?(?:\\d{0,9}|(?!.{11})\\d+\\.\\d*)$"));
*/
		System.out.println("1/111/111".matches("^-?(?:(?!.{10}).*/\\d{0,2})$"));
		System.out.println("11/111/111".matches("^-?(?:(?!.{10}).*/\\d{0,2})$"));
		System.out.println("111/111/11".matches("^-?(?:(?!.{10}).*/\\d{0,2})$"));
		System.exit(4);
  		System.out.println("1111/111/".matches("^-?(?:(?!.{10}).*/\\d{0,2})$"));
		System.out.println("11111/111/".matches("^-?(?:(?!.{10}).*/\\d{0,2})$"));
		System.out.println("111111/111/".matches("^-?(?:(?!.{10}).*/\\d{0,2})$"));
		
		
		LinkedList<Double> regs= new LinkedList<Double>();
		HashMap<String, ArrayList<ArrayList<BinaryOperator<Integer>>>> flist0= new HashMap<String, ArrayList<ArrayList<BinaryOperator<Integer>>>>();
		ArrayList<ArrayList<BinaryOperator<Integer>>> flist1= new ArrayList<ArrayList<BinaryOperator<Integer>>>();
		ArrayList<BinaryOperator<Integer>> flist2= new ArrayList<BinaryOperator<Integer>>(); 
			
		
		
		flist2.add((a, b) -> {regs.set(a, regs.get(a)+regs.get(b)); return 0;});
		flist2.add((a, b) -> {regs.set(a, regs.get(a)-regs.get(b)); return 0;});
		flist2.add((a, b) -> {regs.set(a, regs.get(a)*regs.get(b)); return 0;});
		flist2.add((a, b) -> {regs.set(a, regs.get(a)/regs.get(b)); return 0;});

		flist1.add(flist2);
		flist0.put("elsoe", flist1);
		
		regs.add(7d);
		regs.add(13d);
		
		flist0.get("elsoe").get(0).get(3).apply(0, 1);
		
		class W {
			public String gonb;
			public boolean _2ndf;
			public int inputtype;
			public W(String gonb, boolean output, boolean _2ndf, int inputtype) {
				this.gonb = gonb;
				this._2ndf = _2ndf;
				this.inputtype = inputtype;
			}
		}
		HashMap<W, BinaryOperator<Integer>> fl= new HashMap<W, BinaryOperator<Integer>>();
 
		fl.put(new W("2ndf", false, true, 0), (a, b) -> {regs.set(a, regs.get(a)+regs.get(b)); return 0;});
		fl.put(new W("2ndf", true, true, 0), (a, b) -> {regs.set(a, regs.get(a)-regs.get(b)); return 0;});

		
		System.out.println(regs.get(0));
		
//		new Main();
	}
	public Main() {
		key("on/C"); 
//		key("2ndF"); 
//		key("÷"); 
		key("0"); 
		key("1"); 
		key("2"); 
		key("8"); 
		key("1"); 
		key("."); 
		key("Exp"); 
		key("1"); 
		key("2"); 
		key("+/-"); 
		key("8"); 
		key("1"); 
		key("D°M'S"); 
		key("2"); 
		key("8"); 
		// key(19); // a b/c
		key("1"); 
		key("2"); 
		key("8"); 
		key("1"); 
		key("2"); 
		key("8"); 
		key("+/-"); 
	}
	public void key(String code) {
		switch (code) {
		case "2ndF":
			_2ndf^= 1;
			break;
		case "on/C":
			switch (_2ndf) {
			case 0:
				switch (intype) {
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10: intype= 0;
				case 0:
				case 1:
				case 2:
				case 3:
					ints.put("2ndf", 0);
					Arrays.stream(in).forEach(sb -> sb.setLength(0));
					break;
				}
				break;
			case 1: //off
				_2ndf= 0;
				break;
			}
			break;
		case "+/-":
			switch (_2ndf) {
			case 0:
				switch (intype) {
				case 1:
				case 2:
				case 3: System.out.println("NEG function"); break;
				case 0:
					if(in[1].toString().equals("0")) {
						System.out.println("DEC NEG function");
						break;
					}
				case 4:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
					if (in[0].toString().equals("-")) {
						in[0].setLength(0);
					} else {
						in[0].append("-");
					}
					break;
				case 5:
					if (in[3].toString().equals("-")) {
						in[3].setLength(0);
					} else {
						in[3].append("-");
					}
					break;
				}
				break;
			case 1: //tab, fse nélkül hatástalan
				_2ndf= 0;
				break;
			}
			break;
		case "Exp":
			switch (_2ndf) {
			case 0:
				switch (intype) {
				case 0:
					if (in[1].isEmpty()) {
						in[1].append("1");
					}
				case 4:
					intype= 5;
					in[4].append("00");
					break;
				}
				break;
			case 1: // pi
				_2ndf= 0;
				break;
			}
			break;
		case "a b/c":
			switch (_2ndf) {
			case 0:
				switch (intype) {
				case 0:
					if (in[1].toString().length()<7) {
						intype= 6;
					}
					break;
				case 6:
					if (in[1].toString().length()<4 && 0<in[2].toString().length()) {
						intype= 7;
					}
					break;
				}
				break;
			case 1:
				_2ndf= 0;
				break;
			}
			break;
		case "D°M'S": 
			switch (_2ndf) {
			case 0:
				switch (intype) {
				case 0:
					if (in[1].toString().length()<5) {
						intype= 8;
						in[2].append("00");
					}
					break;
				case 8:
					intype= 9;
					in[3].append("00");
					break;
				case 9:
					intype= 10;
					in[4].append("00");
					break;
				case 4:
				case 5:
				case 6:
				case 7:
					System.out.println("Mutatott érték átszámítása dms-be.");
					break;
				}
				break;
			case 1:
				_2ndf= 0;
				break;
			}
			break;
		case ".":
			switch (_2ndf) {
			case 0:
				switch (intype) {
				case 0: intype= 4; break;
				}
				break;
			case 1:
				_2ndf= 0;
				break;
			}
			break;
		case "0":
			switch (_2ndf) {
			case 0:
				switch (intype) {
				case 0:
				case 1:
				case 2:
				case 3:
					if(!in[1].toString().equals("0") && in[1].toString().length()<10) {
						in[1].append("0");
					}
					break;
				case 4:
					if(in[1].toString().length()+in[2].toString().length()<10) {
						in[2].append("0");
					}
					break;
				case 5:
				case 10:
					in[4].deleteCharAt(0).append("0");
					break;
				case 6:
					if(in[2].toString().length()<3) {
						in[2].append("0");
					}
					break;
				case 7:
					if(in[3].toString().length()<3 && in[1].toString().length()+in[2].toString().length()+in[3].toString().length()<8) {
						in[3].append("0");
					}
					break;
				case 8:
					in[2].deleteCharAt(0).append("0");
					break;
				case 9:
					in[3].deleteCharAt(0).append("0");
					break;
				}
				break;
			case 1:
				_2ndf= 0;
				break;
			}
			break;
		case "1":
			switch (_2ndf) {
			case 0:
				switch (intype) {
				case 0:
				case 1:
				case 2:
				case 3:
					if (in[1].toString().equals("0")) {
						in[1].deleteCharAt(0);
					}
					if(in[1].toString().length()<10) {
						in[1].append("1");
					}
					break;
				case 4:
					if(in[1].toString().length()+in[2].toString().length()<10) {
						in[2].append("1");
					}
					break;
				case 5:
				case 10:
					in[4].deleteCharAt(0).append("1");
					break;
				case 6:
					if(in[2].toString().length()<3) {
						in[2].append("1");
					}
					break;
				case 7:
					if(in[3].toString().length()<3 && in[1].toString().length()+in[2].toString().length()+in[3].toString().length()<8) {
						in[3].append("1");
					}
					break;
				case 8:
					in[2].deleteCharAt(0).append("1");
					break;
				case 9:
					in[3].deleteCharAt(0).append("1");
					break;
				}
				break;
			case 1:
				_2ndf= 0;
				key(code);
				break;
			}
			break;
		case "2":
			switch (_2ndf) {
			case 0:
				switch (intype) {
				case 0:
				case 1:
				case 2:
					if (in[1].toString().equals("0")) {
						in[1].deleteCharAt(0);
					}
					if(in[1].toString().length()<10) {
						in[1].append("2");
					}
					break;
				case 4:
					if(in[1].toString().length()+in[2].toString().length()<10) {
						in[2].append("2");
					}
					break;
				case 5:
				case 10:
					in[4].deleteCharAt(0).append("2");
					break;
				case 6:
					if(in[2].toString().length()<3) {
						in[2].append("2");
					}
					break;
				case 7:
					if(in[3].toString().length()<3 && in[1].toString().length()+in[2].toString().length()+in[3].toString().length()<8) {
						in[3].append("2");
					}
					break;
				case 8:
					in[2].deleteCharAt(0).append("2");
					break;
				case 9:
					in[3].deleteCharAt(0).append("2");
					break;
				}
				break;
			case 1:
				_2ndf= 0;
				key(code);
				break;
			}
			break;
		case "8":
			switch (_2ndf) {
			case 0:
				switch (intype) {
				case 0:
				case 1:
					if (in[1].toString().equals("0")) {
						in[1].deleteCharAt(0);
					}
					if(in[1].toString().length()<10) {
						in[1].append("8");
					}
					break;
				case 4:
					if(in[1].toString().length()+in[2].toString().length()<10) {
						in[2].append("8");
					}
					break;
				case 5:
				case 10:
					in[4].deleteCharAt(0).append("8");
					break;
				case 6:
					if(in[2].toString().length()<3) {
						in[2].append("8");
					}
					break;
				case 7:
					if(in[3].toString().length()<3 && in[1].toString().length()+in[2].toString().length()+in[3].toString().length()<8) {
						in[3].append("8");
					}
					break;
				case 8:
					in[2].deleteCharAt(0).append("8");
					break;
				case 9:
					in[3].deleteCharAt(0).append("8");
					break;
				}
				break;
			case 1:
				_2ndf= 0;
				key(code);
				break;
			}
			break;
		case "÷":
			switch (_2ndf) {
			case 0:
				break;
			case 1:
				_2ndf= 0;
				switch (intype) {
				case 0:
					System.out.println("eredmény kiszámítása;");
					System.out.println("bin-be váltás;");
					System.out.println("megjelenítés;");
					intype= 3;
				}
				break;
			}
			break;
		default:
			System.out.println("hlba: "+code);
			return;
		}
		
		String out= null;
		switch (intype) {
		case 0:
			if (in[1].isEmpty()) {
				out= in[0].toString()+"0.";
			} else {
				out= in[0].toString()+in[1].toString()+".";
			}
			break;
		case 1:
		case 2:
		case 3:
			out= in[1].toString();
			break;
		case 4:
			out= in[0].toString()+in[1].toString()+"."+in[2].toString();
			break;
		case 5:
			out= in[0].toString()+in[1].toString()+"."+in[2].toString()+"e"+in[3].toString()+in[4].toString();
			break;
		case 6:
			out= in[0].toString()+in[1].toString()+"/"+in[2].toString();
			break;
		case 7:
			out= in[0].toString()+in[1].toString()+"/"+in[2].toString()+"/"+in[3].toString();
			break;
		case 8:
			out= in[0].toString()+in[1].toString()+"°"+in[2].toString();
			break;
		case 9:
			out= in[0].toString()+in[1].toString()+"°"+in[2].toString()+"´"+in[3].toString();
			break;
		case 10:
			out= in[0].toString()+in[1].toString()+"°"+in[2].toString()+"´"+in[3].toString()+"."+in[4].toString();
			break;
		}
		out= ((_2ndf==1) ? "2ndf; " : "") + out; 
		System.out.println(out);
	}
}