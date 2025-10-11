package hu.hl.sharp_el_556g_241106;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeMap;

public class Main {
	private final Form form;
	private Calculator calculator= new Calculator();
	private StringBuilder keybuffer= new StringBuilder();
	
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
//					form.update(calculator.sendkey(k));
					String[] ss= new String[7];
					brb(k);
					ss[3]= String.format("%s,%s,%s,%s", _mode0.name(), _mode1.name(), _hyp.name(), _2ndf.name());
					form.update(ss);
//					System.out.printf("%s -> ", keybuffer);
				}
			}
			public void keyReleased(KeyEvent keyevent) {}
			public void keyTyped(KeyEvent keyevent) {}
		});
		interface IExecutable {
			public void Execute();
		}
		
	}
	
	public static enum EMode0 {N, C, V, S};
	public static enum EMode1 {D, B, O, H, X, R, V, SU, S0, S1, S2, S3, S4, S5, S6};
	public static enum EHyp {N, Y};
	public static enum E2ndf {N, Y};
	EMode0 _mode0= EMode0.N;
	EMode1 _mode1= EMode1.D;
	EHyp _hyp= EHyp.N;
	E2ndf _2ndf= E2ndf.N;
	
	public String getMode0(EMode0 _mode0) {
		switch (_mode0) {
		case N: return "normal";
		case C: return "cplx";
		case V: return "3-vle";
		case S: return "stat";
		}
		return null;
	}
	public String getMode1(EMode1 _mode1) {
		switch (_mode1) {
		case D: return "dec";
		case B: return "bin";
		case O: return "oct";
		case H: return "hex";
		case X: return "xy";
		case R: return "rθ";
		case V: return "";
		case SU: return "";
		case S0: return "st0";
		case S1: return "st1";
		case S2: return "st2";
		case S3: return "st3";
		case S4: return "st4";
		case S5: return "st5";
		case S6: return "st6";
		}
		return null;
	}
	private String getHyp(EHyp _hyp) {
		switch (_hyp) {
		case N: return ""; 
		case Y: return "hyp"; 
		}
		return null;
	}
	private String get2ndf(E2ndf _2ndf) {
		switch (_2ndf) {
		case N: return ""; 
		case Y: return "2ndf"; 
		}
		return null;
	}

	public void brb(char key) {
/*		switch (_mode0.name()+_mode1.name()+_hyp.name()+_2ndf.name()+key) {
		case "NDNNa": // -
		case "aabaa": // hyp
			_2ndf= "b";
			break;
		case "aaaba": // 2ndf
		case "aabba": // hyp,2ndf
			_2ndf= "a";
			break;
		case "aaaag": // -
		case "aaabg": // 2ndf
			_hyp= "b";
			break;
		case "aabag": //
		case "aabbg": //
			_hyp= "a";
			break;
		case "aaaab": // -
		case "aabab": // hyp
			_mode0= "?";
			break;
		case "aaabb": // 2ndf
			_2ndf= "a";
			break;
		case "aabbb": // hyp,2ndf
			_hyp= "a";
			_2ndf= "a";
			break;
		}*/
//		System.out.printf("%s\n", stat);
	}
	public void brb2(StringBuilder keybuffer) {
		switch (keybuffer.toString()) {
		case "a": return;
		case "b": return;
		case "c": System.out.println("drg;"); keybuffer.setLength(0); return;
		case "d": return;
		case "e": System.out.println("input(back); switch;"); keybuffer.setLength(0); return;			
		case "f": System.out.println("on/c;"); keybuffer.setLength(0); return;
		case "g": return;
		case "h": System.out.println("sin; and;"); keybuffer.setLength(0); return;
		case "m": System.out.println("y^x;"); keybuffer.setLength(0); return;
		case "v": return;
		case "w": return;
		case "x": System.out.println("m+;"); keybuffer.setLength(0); return;
		case "y": System.out.println("+/-; neg;"); keybuffer.setLength(0); return;
		case "1": System.out.println("input(1);"); keybuffer.setLength(0); return;
		case ".": System.out.println("input(.);"); keybuffer.setLength(0); return;
		case "*": return;
			
		case "aa": System.out.println("∅"); keybuffer.setLength(0); return;
		case "ab": System.out.println("mdf;"); keybuffer.setLength(0); return;
		case "ac": System.out.println("drg>;"); keybuffer.setLength(0); return;
		case "ad": return;
		case "ae": System.out.println("ca;"); keybuffer.setLength(0); return;			
		case "af": System.out.println("off;"); keybuffer.setLength(0); return;
		case "ag": return;
		case "ah": System.out.println("sin-1;"); keybuffer.setLength(0); return;
		case "am": System.out.println("xVy;"); keybuffer.setLength(0); return;
		case "av": return;
		case "aw": System.out.println("_,_;"); keybuffer.setLength(0); return;
		case "ax": System.out.println("m-;"); keybuffer.setLength(0); return;
		case "ay": return;
		case "a1": System.out.println("sumxy;"); keybuffer.setLength(0); return;
		case "a.": System.out.println("fse>;"); keybuffer.setLength(0); return;
		case "a*": System.out.println(">hex;"); keybuffer.setLength(0); return;

/*		case "ba": return;
		case "bb": System.out.println("∅"); keybuffer.setLength(0); return;
		case "bc": keybuffer.setLength(0); brb(keybuffer.append("b")); return;
		case "bd": keybuffer.setLength(0); brb(keybuffer.append("b")); return;
		case "be": keybuffer.setLength(0); brb(keybuffer.append("b")); return;
		case "bf": keybuffer.setLength(0); brb(keybuffer.append("f")); return;
		case "bg": keybuffer.setLength(0); brb(keybuffer.append("b")); return;
		case "bh": keybuffer.setLength(0); brb(keybuffer.append("b")); return;
		case "bm": keybuffer.setLength(0); brb(keybuffer.append("b")); return;
		case "bv": keybuffer.setLength(0); brb(keybuffer.append("b")); return;
		case "bw": keybuffer.setLength(0); brb(keybuffer.append("b")); return;
		case "bx": keybuffer.setLength(0); brb(keybuffer.append("b")); return;
		case "by": keybuffer.setLength(0); brb(keybuffer.append("b")); return;
		case "b1": System.out.println("mode(1)"); keybuffer.setLength(0); return;
		case "b.": keybuffer.setLength(0); brb(keybuffer.append("b")); return;
		case "b*": keybuffer.setLength(0); brb(keybuffer.append("b")); return;
			
/*		case "ga": return brb("ag");
		case "gb": return brb("b");
		case "gc": return brb("c");
		case "gd": return brb("d");
		case "ge": return brb("e");
		case "gf": return brb("f");
		case "gg": System.out.println(); return "";
		case "gh": System.out.println("hyp sin"); return "";
		case "gm": return brb("m");
		case "gv": return brb("v");
		case "gw": return brb("w");
		case "gx": return brb("x");
		case "gy": return brb("y");
		case "g1": return brb("1");
		case "g.": System.out.println(); return "";
		case "g*": return brb("*");
			
		case "va": return brb("a");
		case "vb": return brb("b");
		case "vc": return brb("c");
		case "vd": return brb("d");
		case "ve": return brb("e");
		case "vf": return brb("f");
		case "vg": return brb("g");
		case "vh": return brb("h");
		case "vm": System.out.println("rcl a"); return "";
		case "vv": System.out.println(); return "";
		case "vw": System.out.println(); return "";
		case "vx": System.out.println("rcl m"); return "";
		case "vy": return brb("y");
		case "v1": return brb("a1");
		case "v.": return brb(".");
		case "v*": return brb("*");

		case "wa": return brb("a");
		case "wb": return brb("b");
		case "wc": return brb("c");
		case "wd": return brb("d");
		case "we": return brb("e");
		case "wf": return brb("f");
		case "wg": return brb("g");
		case "wh": return brb("h");
		case "wm": System.out.println("sto a"); return "";
		case "wv": System.out.println(); return "";
		case "ww": System.out.println(); return "";
		case "wx": System.out.println("sto m");	return "";
		case "wy": return brb("y");
		case "w1": return brb("1");
		case "w.": return brb(".");
		case "w*": return brb("*");
			
		case "*a": brb("*"); return brb("a");
		case "*b": brb("*"); return brb("b");
		case "*c": brb("*"); return brb("c");
		case "*d": brb("*"); return brb("d");
		case "*e": brb("*"); System.out.println("k mode"); return "";
		case "*f": brb("*"); System.out.println("ce"); return "";
		case "*g": brb("*"); return brb("g");
		case "*h": brb("*"); return brb("h");
		case "*m": brb("*"); return brb("m");
		case "*v": brb("*"); return brb("v");
		case "*w": brb("*"); System.out.println(); return "";
		case "*x": brb("*"); System.out.println(); return "";
		case "*y": brb("*"); return brb("y");
		case "*1": brb("*"); return brb("1");
		case "*.": brb("*"); return brb("0.->input");
		case "**": return brb("*");
			
		case "aga": return brb("g");
		case "agb": return brb("b");
		case "agc": return brb("c");
		case "agd": return brb("d");
		case "age": return brb("e");
		case "agf": return brb("f");
		case "agg": return brb("a");
		case "agh":	return brb("h");
		case "agm": System.out.println("alpha a"); return "";
		case "agv": System.out.println(); return "";
		case "agw": System.out.println(); return "";
		case "agx": System.out.println("alpha m"); return "";
		case "agy": return brb("y");
		case "ag1": return brb("1");
		case "ag.": return brb(".");
		case "ag*": return brb("*");
		
		case "ava": return brb("a");
		case "avb": return brb("b");
		case "avc": return brb("c");
		case "avd": return brb("d");
		case "ave": return brb("e");
		case "avf": return brb("f");
		case "avg": return brb("g");
		case "avh":	return brb("h");
		case "avm": System.out.println("alpha a"); return "";
		case "avv": System.out.println(); return "";
		case "avw": System.out.println(); return "";
		case "avx": System.out.println("alpha m"); return "";
		case "avy": return brb("y");
		case "av1": return brb("1");
		case "av.": return brb(".");
		case "av*": return brb("*");
			
		case "aya": return brb("a");
		case "ayb": return brb("b");
		case "ayc": return brb("c");
		case "ayd": return brb("d");
		case "aye": return brb("e");
		case "ayf": return brb("f");
		case "ayg": return brb("g");
		case "ayh": return brb("h");
		case "aym": return brb("m");
		case "ayv": return brb("v");
		case "ayw": return brb("w");
		case "ayx": return brb("x");
		case "ayy": return brb("y");
		case "ay1": System.out.println("1->tab"); return "";
		case "ay.": return brb(".");
		case "ay*": return brb("*");
			
		case "baa": return brb("b");
		case "bab": return brb("b");
		case "bac": return brb("b");
		case "bad": return brb("b");
		case "bae": return brb("b");
		case "baf": return brb("f");
		case "bag": return brb("b");
		case "bah": return brb("b");
		case "bam": return brb("b");
		case "bav": return brb("b");
		case "baw": return brb("b");
		case "bax": return brb("b");
		case "bay": return brb("b");
		case "ba1": return brb("b1");
		case "ba.": return brb("b");
		case "ba*": return brb("b");
*/			
		default: System.out.println("unknown"); keybuffer.setLength(0); return;
		}
	}
}

class Calculator {
	private int mode= 0;
	public void toNorm() {
		mode= 0;
	}
	public void toCplx() {
		mode= 4;
	}
	public void to3Vle() {
		mode= 6;
	}
	public void toStat() {
		
	}
	public void toDec() {
		
	}
	public void toBin() {
		
	}
	public void toOct() {
		
	}
	public void toHex() {
		
	}
	public void toXY() {
		
	}
	public void toRθ() {
		
	}
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