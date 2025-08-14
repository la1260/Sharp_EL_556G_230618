package hu.hl.sharp_el_556g_250119;

import java.util.Arrays;

public class Main {
// private Frame frame;
private Calc calc;
	public static void main(String[] args) throws SharpEL556GException {
		new Main();
	}
	public Main() throws SharpEL556GException {
		calc= new Calc(); System.out.println(calc.out());
		System.out.println(calc.setMode0(1));
		System.out.println(calc.setReg(0, 90));
		System.out.println(calc.toHex());
		System.out.println(calc.toDec());
		System.out.println(calc.setReg(0, 90));
		System.out.println(calc.nextDRG(true));
		System.out.println(calc.nextDRG(true));
		System.out.println(calc.nextDRG(true));
		
		System.out.println(calc.setReg(0, 2, 4, 5));
		System.out.println(calc.setReg(0, 2, 4, 5, 7));
		System.out.println(calc.setReg(0, 2.7, 4));
		
		System.out.println(calc.setMode1(0));

/*		
		calc.execute(4);
		calc.execute(5, 2);
		calc.execute(2, 90d);
		calc.execute(3, false);
		calc.execute(3, true);
		calc.execute(6);
		calc.execute(3, true);
		calc.execute(3, false);
		
		calc.execute(2, 0d);
		calc.execute(1, 1);
		calc.execute(2, "100101");
		calc.execute(2, 0d);
		calc.execute(1, 2);
		calc.execute(2, "1005");
		calc.execute(2, 0d);
		calc.execute(1, 3);
		calc.execute(2, "1005");
*/
	}
}

class Calc {
	private int[] mode;
	private int tab;
	private Reg[] regs;
	public Calc() {
		reset(true);
	}
	public String setMode0(int mode0) {
		this.mode[0]= mode0;
		reset(false);
		return out();
	}
	public String setMode1(int mode1) {
		this.mode[1]= mode1;
		return out();
	}
	public String reset(boolean hard) {
		regs= new Reg[]{new Reg(0), null, null, null, null, null, null, null, null, null, null, null};
		if (hard) {
			mode= new int[]{0, 0, 0, 0};
		}
		return out();
	}
	public String setReg(int index, double value) {
		regs[index]= new Reg(value);
		return out();
	}
	public String setReg(int index, String value) {
		int radix= new int[]{2, 8, 16}[mode[1]-1];
		setReg(index, Integer.parseInt(value, radix));
		return out();
	}
	public String setReg(int index, int a, int b, int c) {
		regs[index]= new Reg(a, b, c);
		return out();
	}
	public String setReg(int index, int d, int m, int s, int f) {
		regs[index]= new Reg(d, m, s, f);
		return out();
	}
	public String setReg(int index, double x, double y) {
		regs[index]= new Reg(x, y);
		return out();
	}
	public String toDec() {
		return (mode[0]==0) ? setMode1(0) : out();
	}
	public String toBin() {
		return (mode[0]==0) ? setMode1(1) : out();
	}
	public String toOct() {
		return (mode[0]==0) ? setMode1(2) : out();
	}	
	public String toHex() {
		return (mode[0]==0) ? setMode1(3) : out();
	}
	public String nextDRG(boolean recalc) {
		if (++mode[2]==3) mode[2]= 0;
		if (recalc) {
			double mul= new double[]{9d/10d, Math.PI/180, 200/Math.PI}[mode[2]];
			regs[0].multiply(new Reg(mul));
		}
		return out();
	}
	public void nextFSE() {
		
	}
	public void setTab(int places) {
		
	}
	public void goMdf() {
		
	}
	public void cnst(int no) {
		
	}
	public void conv(int no) {
		
	}
	public String out() {
		switch (mode[0]<<4 | mode[1]) {
		case 0x01:
			return "bin;"+Integer.toBinaryString((int) Math.round((double) regs[0].value[0]));  
		case 0x02:
			return "oct;"+Integer.toOctalString((int) Math.round((double) regs[0].value[0]));  
		case 0x03:
			return "hex;"+Integer.toHexString((int) Math.round((double) regs[0].value[0]));
		default:
			return regs[0].toString()+" "+Arrays.toString(mode)+Arrays.toString(regs);
		}
	}
}


class Reg {
	public int type;
	public Object[] value;
	public Reg(double value) {
		this.type= 0;
		this.value= new Object[]{value};
	}
	public Reg(int a, int b, int c) {
		this.type= 1;
		this.value= new Object[]{a, b, c};
	}
	public Reg(int d, int m, int s, int f) {
		this.type= 2;
		this.value= new Object[]{d, m, s, f};
	}
	public Reg(double x, double y) {
		this.type= 3;
		this.value= new Object[]{x, y};
	}
	public void multiply(Reg reg) {
		switch (type<<4 | reg.type) {
		case 0x00: value[0]= ((double) value[0])* ((double) reg.value[0]); break;
		}
	}
	public String toString() {
		return String.format("%d:%s", type, Arrays.toString(value));
	}
}


class SharpEL556GException extends Exception {
	private static final long serialVersionUID = 1L;
}