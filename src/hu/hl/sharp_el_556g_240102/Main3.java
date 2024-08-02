package hu.hl.sharp_el_556g_240102;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.Arrays;
import java.util.Stack;
import java.util.TreeMap;

import hu.hl.sharp_el_556g_230926.Calculator;
import hu.hl.sharp_el_556g_230926.Frame;

public class Main3 /*extends Frame*/ {
	public static void main(String[] args) throws AWTException {
//		new Main3();
		Robot bot = new Robot();
		int mask = InputEvent.BUTTON1_DOWN_MASK;
		bot.mouseMove(1732, 772);           
		bot.mousePress(mask);     
		bot.mouseRelease(mask);		
	}
	private String in_str;
	private Double[] reg= new Double[2];
	private Integer op;
	private boolean sw;
	public static TreeMap<Integer, Integer> key_code_to_op_code= new TreeMap<Integer, Integer>();
	static {
		key_code_to_op_code.put(32, 96);
		key_code_to_op_code.put(33, 97);
		key_code_to_op_code.put(34, 128);
		key_code_to_op_code.put(64, 0);
	}
	private Main2 m= new Main2();
	public Main3() { //keycodes 128: C és Ce; 0-9: num; 160: .; 17: -; 32: +; 33: -; 34: *; 35: /; 64: =; back: 96; 192: +-;
/*		super(new KeyListener() {
			public void keyTyped(KeyEvent e) {}
			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		}); 
	*/	
/*		key(128);
		key(3);
		key(33);
		key(96);
		key(96);
		key(64);
		key(64);
		key(64);
		key(9);
		key(7);
		key(64);
		key(64);
*/		
		key(128);
//		Arrays.stream(new int[]{	32,	5,	64,	1,	1,	32,	34,	4,	7,	64,	2,	3,	34,	33,	96,	96,	96,	96,	64,	64,	64,	1,	9,	64,	64,	64,	96,	64,	64,	64,	96,	64,	64,	64,	96,	96,	96,	96,	96,	64,	64,	64,	5,	3,	64, 128}).forEach(i -> key(i));
/*		Arrays.stream(new int[]{	192,	64,	128}).forEach(i -> key(i));						
		Arrays.stream(new int[]{	160,	64,	128}).forEach(i -> key(i));						
		Arrays.stream(new int[]{	5,	192,	160,	3,	34, 2, 3,	64,	128}).forEach(i -> key(i));		
		Arrays.stream(new int[]{	5,	192,	64,	128}).forEach(i -> key(i));					
		Arrays.stream(new int[]{	5,	160,	64,	128}).forEach(i -> key(i));					
		Arrays.stream(new int[]{	5,	192,	3,	64,	128}).forEach(i -> key(i));				
		Arrays.stream(new int[]{	5,	192,	192,	3,	64,	128}).forEach(i -> key(i));			
		Arrays.stream(new int[]{	5,	160,	192,	3,	64,	128}).forEach(i -> key(i));			
		Arrays.stream(new int[]{	5,	160,	192,	192,	3,	64,	128}).forEach(i -> key(i));		
		Arrays.stream(new int[]{	5,	160,	3,	64,	128}).forEach(i -> key(i));				
		Arrays.stream(new int[]{	5,	192,	160,	3,	64,	128}).forEach(i -> key(i));			
		Arrays.stream(new int[]{	5,	160,	160,	3,	64,	128}).forEach(i -> key(i));			
		Arrays.stream(new int[]{	5,	160,	192,	160,	3,	64,	128}).forEach(i -> key(i));		
		Arrays.stream(new int[]{	5,	192,	33,	7,	64,	128}).forEach(i -> key(i));			
		Arrays.stream(new int[]{	5,	160,	33,	7,	64,	128}).forEach(i -> key(i));			
		Arrays.stream(new int[]{	5,	192,	3,	33,	7,	64,	128}).forEach(i -> key(i));		
		Arrays.stream(new int[]{	5,	192,	192,	3,	33,	7,	64,	128}).forEach(i -> key(i));	
		Arrays.stream(new int[]{	5,	160,	192,	3,	33,	7,	64,	128}).forEach(i -> key(i));	
		Arrays.stream(new int[]{	5,	160,	192,	192,	3,	33,	7,	64,	128}).forEach(i -> key(i));
		Arrays.stream(new int[]{	5,	160,	3,	33,	7,	64,	128}).forEach(i -> key(i));		
		Arrays.stream(new int[]{	5,	192,	160,	3,	33,	7,	64,	128}).forEach(i -> key(i));	
		Arrays.stream(new int[]{	5,	160,	160,	3,	33,	7,	64,	128}).forEach(i -> key(i));	
		Arrays.stream(new int[]{	5,	160,	192,	160,	3,	33,	7,	64,	128}).forEach(i -> key(i));*/
/*		Arrays.stream(new int[]{	5,	4, 160, 3, 2, 64,	128}).forEach(i -> key(i));
		Arrays.stream(new int[]{	5,	4, 160, 3,  96, 2, 64,	128}).forEach(i -> key(i));
		Arrays.stream(new int[]{	5,	4, 160, 3,  96, 96, 2, 64,	128}).forEach(i -> key(i));
		Arrays.stream(new int[]{	5, 	4, 160, 3,  96, 96, 96, 2, 64,	128}).forEach(i -> key(i)); */
//		Arrays.stream(new int[]{	5, 4, 160, 3,  33, 96, 96, 96,  2, 3, 4, 64, 64, 128}).forEach(i -> key(i));
		Arrays.stream(new int[]{	5, 4, 160, 3,  33, 96, 96, 96,  2, 160, 3, 4, 64, 64, 128}).forEach(i -> key(i));
		Arrays.stream(new int[]{	5, 4, 160, 3,  33, 96, 96, 96,  2, 192, 3, 4, 64, 64, 128}).forEach(i -> key(i));
		Arrays.stream(new int[]{	5, 4, 160, 3,  33, 96, 96, 96,  2, 160, 192, 3, 4, 64, 64, 128}).forEach(i -> key(i));
	}
	private void reset() {
		in_str= null;
		reg[0]= null;
		reg[1]= null;
		op= null;
		sw= false;
		m.reset();
	}
	private int getStat() {
		return
			((in_str!=null && in_str.contains("e-")) ? 1<<8 : 0) |
			((in_str!=null && in_str.contains("e")) ? 1<<7 : 0) |
			((in_str!=null && in_str.startsWith("-")) ? 1<<6 : 0) |
			((in_str!=null && in_str.contains(".")) ? 1<<5 : 0) |
			((!m.ops.isEmpty() && m.ops.lastElement()==0) ? 1<<4 : 0) |
			((reg[1]==null) ? 1<<3 : 0) |
			((reg[0]==null  | sw) ? 1<<2 : 0) |
			((in_str==null) ? 1<<1 : 0) // |
//			((    op==null) ? 1<<0 : 0)
			;
	}
	private void key(int code) {
		System.out.print((code<<8&61440 | getStat())+";"+String.valueOf(code)+";"+op);
		switch (code<<8&61440 | getStat()) {
		case    14:
		case     2:
		case     6: in_str= String.valueOf(code); break;

		case  8206: in_str= "0.0"; //k1 módban op0 nyomása - kivezet a k módból 8204 elől hoztam át, ellenőrizni kell
		case  8194: 
		case  8198: m.cal0(reg[1], op, false); m.cal0(reg[0], key_code_to_op_code.get(code), false); reg[1]= null; reg[0]= null; op= null; break; //k0 módban op0 nyomása - kivezet a k módból
		
		case    12:
		case    44:
		case    76:
		case   108:
		case     0:
		case 	32:
		case 	64:
		case 	96: 
		case     4:
		case 	36:
		case 	68: 
		case   100: in_str+= code; break;

		case  8204:
		case  8236:
		case  8268:
		case  8300: reg[0]= Double.valueOf(in_str); in_str= null;
		case  8202: op= key_code_to_op_code.get(code); break; //nem üres op0-ra újabb op0 nyomása
		
		
		case 16398: in_str= "0.0";
//		case 16430: //ezek nem fordulhatnak elő
//		case 16462: //ezek nem fordulhatnak elő
//		case 16494: //ezek nem fordulhatnak elő
		case 16388:
		case 16420:
		case 16452:
		case 16484:	reg[0]= Double.valueOf(in_str); in_str= null; 
		case 16390:
		case 16422:
		case 16454:
		case 16486: m.cal0(reg[0], op, false); m.cal0(reg[1], 0, false); reg[0]= m.regs.lastElement(); System.out.print("\t"+m.regs.toString()+":"+m.ops.toString()); m.reset(); break;

		case 16396: 
		case 16428: 
		case 16460: 
		case 16492: reg[0]= Double.valueOf(in_str); in_str= null; op= key_code_to_op_code.get(code); m.cal0(reg[0], op, false); System.out.print("\t"+m.regs.toString()+":"+m.ops.toString()); break;
		case 16384:
		case 16416: 
		case 16448:
		case 16480: reg[0]= Double.valueOf(in_str); in_str= null; //ezt ellenőrizni kell!
		case 16386:
		case 16418:
		case 16450:
		case 16482: m.cal0(reg[1], op, false); m.cal0(reg[0], 0, false); reg[0]= m.regs.lastElement(); System.out.print("\t"+m.regs.toString()+":"+m.ops.toString()); m.reset(); break;
		
		case 24588:
		case 24620:
		case 24652:
		case 24684:
		case 24576:
		case 24608:
		case 24640:
		case 24672:
		case 24580:
		case 24612:
		case 24644:
		case 24676: in_str= (in_str+"×").replaceAll(".\\.*×$", "×").replaceAll("^-*×$", "0").replaceAll("×", ""); break;
		
		case 32780:
		case 32812:
		case 32844:
		case 32876: in_str= null; break;
		case 32768:
		case 32800:
		case 32832:
		case 32864:
		case 32772:
		case 32804:
		case 32836:
		case 32868: reset(); break;
		
		case 40972:
		case 41036:
		case 40960:
		case 41024:
		case 40964:
		case 41028:	in_str+= "."; break;
		case 41004:
		case 41068:
		case 40992:
		case 41056:
		case 40996:
		case 41060: break;

		case 40974:
		case 40962:	
		case 40966: in_str= "0."; break;

		case 49164:
		case 49196:
		case 49152:
		case 49184:
		case 49156:
		case 49188: in_str= "-"+in_str; break;
		case 49228:
		case 49260:
		case 49216:
		case 49248:
		case 49220:
		case 49252: in_str= in_str.substring(1); break;

		case 49166:
		case 49154:
		case 49158: break;
		
		case 16394: break; //op1 után üres inputra egyenlő nyomása
		
		//ezeket nem találtam
		
		case    10: m.cal0(reg[0], op, false); reg[0]= null; op= null; in_str= String.valueOf(code); break; //op0 után (üres inputra) szám nyomása
		case    26: in_str= String.valueOf(code); reg[0]= null; op= null; m.reset(); break; //eredmény a veremben (=ops-ban 1 db 0) és input érkezett
		case 24586: reg[1]= reg[0]; reg[0]= 0.0; break; //nem k módból k0 módba lépés (x+?)
		case 24582: sw= false; reg[0]= 0.0; break; //k1-ből k0 módba lépés (x+?)
		case 24578: sw= true; reg[0]= 0.0; break; //k0-ből k1 módba lépés (?+x)
		case 32770: //k0 módban reset nyomása
		case 32774: reset(); break; //k1 módban reset nyomása
		
		
		case 16368: //k0 módban nem üres, előjel és tizedespont nélküli inputra nem első egyenlő nyomása
		
		case 16410:
		case 24590:
		case 24602:
		case 32778:
		case 32782: //üres inputra reset nyomása
		case 32794: reset(); break; //egyenlő után reset nyomása
		default: System.out.print(" unknown"); 
		}
		System.out.println();
	}
	private void imput() {
		
	}
}