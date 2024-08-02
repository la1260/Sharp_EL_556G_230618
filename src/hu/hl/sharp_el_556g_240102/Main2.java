package hu.hl.sharp_el_556g_240102;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Stack;

public class Main2 {
	public static void main(String[] args) {
		new Main2();
	}
	public Main2() {
/*		reset();
		cal2(  3.0, 207, true);
		cal2( -2.0,   0, true);
		reset();
		cal2(  5.0, 208, true);
		cal2(  2.0,   0, true);
		reset();
		cal2(  7.0, 209, true);
		cal2(  0.5,   0, true);
		
		reset();
		cal2( null, 204, true);
		cal2( -2.0,   0, true);
		reset();
		cal2( null, 205, true);
		cal2( -4.0,   0, true);
		reset();
		cal2( null, 206, true);
		cal2( -6.0,   0, true);
				
		reset();
		cal2( null, 201, true);
		cal2( -0.2,   0, true);
		reset();
		cal2( null, 202, true);
		cal2( -0.4,   0, true);
		reset();
		cal2( null, 203, true);
		cal2( -0.6,   0, true);

		reset();
		cal2( null, 198, true);
		cal2( -2.0,   0, true);
		reset();
		cal2( null, 199, true);
		cal2( -4.0,   0, true);
		reset();
		cal2( null, 200, true);
		cal2( -6.0,   0, true);
		
		reset();
		cal2(  3.0, 196, true);
		cal2(  4.0,   0, true);
		reset();
		cal2( null, 197, true);
		cal2(  2.0,   0, true);
		
		
		reset();
		cal2(  9.0, 194, true);
		cal2(0.001,   0, true);
		
		reset();
		cal2( null, 195, true);
		cal2( 10.0,   0, true);
		
		reset();
		cal2(  9.0, 160, true);
		cal2(  7.0,   0, true);
		
		reset();
		cal2(  9.0, 161, true);
		cal2(  7.0,   0, true);
		
		reset();
		cal2( 12.0,   0, true);		
		reset();
		cal2( null,   0, true);		
	
		reset();
		cal2( null,   1, true);		
		cal2(  9.0, 128, true);		
		cal2( 10.0,   2, true);
		cal2( null, 160, true);
		cal2( null,   1, true);		
		cal2(  3.0,  96, true);		
		cal2(  2.0,   0, true);
		cal2( null,   0, true);		

		reset();
		cal2( null, 193, true);
		cal2(125.0,   0, true);
		
		reset();
		cal2(2.0, 242, true);
		cal2(null, 1, true);
		cal2(2.0, 128, true);
		cal2(6.0,   2, true);
		
		cal2(null,   0, true);

		reset();
		cal2(5.0, 243, true);
		cal2(33554432.0,   0, true);
		
		reset();
		cal2(105.0, 130, true);
		cal2( null, 192, true);
		cal2(441.0,   0, true);
		
		reset();
		cal2(  2.0,   1, true);
		cal2(  2.0,   1, true);
		cal2(  2.0,   2, true);
		cal2( null,   2, true);
		cal2( null,   0, true);
		
		reset();
		cal2(  6.0,   1, true);
		cal2(  5.0,   1, true);
		cal2(  4.0,   1, true);
		cal2(  3.0,   1, true);
		cal2(  2.0,  96, true);
		cal2(  0.0,   2, true);
		cal2( null,   2, true);
		cal2( null,   2, true);
		cal2( null,  96, true);
		cal2(  1.0,   2, true);
		cal2( null,   0, true);
		
		reset();
		cal2( 36.0, 128, true);
		cal2( null,   1, true);
		cal2(  5.0,  96, true);
		cal2(  7.0,   2, true);
		cal2( null,   0, true);

		reset();
		cal2( 36.0,   1, true);
		cal2(  5.0,  96, true);
		cal2(  7.0,   2, true);
		cal2( null,   0, true);

		reset();
		cal2( null,   1, true);
		cal2(  5.0,  96, true);
		cal2(  7.0,   2, true);
		cal2( null,   0, true);

		reset();
		cal2( 36.0, 130, true);
		cal2( null,   1, true);
		cal2(  5.0,  96, true);
		cal2(  7.0,   2, true);
		cal2( null,   0, true);

		reset();
		cal2(  8.0, 130, true);
		cal2(  2.0, 128, true);
		cal2(-15.0, 130, true);
		cal2( null,   1, true);
		cal2( null,   1, true);
		cal2(  5.0,  97, true);
		cal2(  8.0,   2, true);
		cal2( null,  97, true);
		cal2(  7.0,   2, true);
		cal2( null,  96, true);
		cal2(  9.0,  96, true);
		cal2(  6.0 ,128, true);
		cal2(  3.0 ,  0, true);
*/				
	}
	public Stack<Double> regs= new Stack<Double>();
	public Stack<Integer> ops= new Stack<Integer>();
	private int zl;
	public void reset() {
		regs.clear();
		ops.clear();
		zl= 0;
	}
	protected void cal2(Double reg, int op, boolean out) {
		cal1(reg, op, out);
		
		String s;
		if (regs.isEmpty()) {
			s= "";
		} else {
			MathContext mc= new MathContext(10, RoundingMode.HALF_UP);
			DecimalFormat df= new DecimalFormat("##########.#########");
			BigDecimal bd= new BigDecimal(regs.peek(), mc);
			s= df.format(bd);
		}
		if (out) System.out.println(reg+"\t"+op+"\t"+s+"\t"+ops);
	}
	private void cal1(Double reg, int op, boolean out) {
		switch (op) {
		case 0: cal0((reg==null) ? (regs.isEmpty()) ? 0.0 : regs.peek() : reg, 0, out); break;
		case 1: if (reg!=null) {regs.push(reg); ops.push(zl<<8|129);} zl++; break;
		case 2:	cal0(reg, zl--<<8, out); break;
		case 96:
		case 97:
		case 128:
		case 130:
		case 160:
		case 161:
		case 242:
		case 243: cal0((reg==null) ? 0.0 : reg, zl<<8|op, out); break;
		case 192:
		case 193:
		case 194:
		case 195:
		case 196:			
		case 197:
		case 198:
		case 199:
		case 200: 
		case 201:
		case 202:
		case 203:
		case 204:
		case 205:
		case 206:
		case 207:
		case 208:
		case 209: cal0((reg==null) ? 1.0 : reg, zl<<8|op, out); break;
		default: System.exit(op); break;
		}
	}
	public void cal0(Double reg, int op, boolean out) {
//		if (out) System.out.println("e:"+reg+"\t"+op+"\t"+regs+"\t"+ops);
		switch ((!ops.isEmpty() && (op&2016)<=(ops.peek()&2016)) ? ops.pop()&255 : 256) {
		case  0: cal0(regs.pop(), op, false); break;
		case  96: cal0(regs.pop()+reg, op, false); break;
		case  97: cal0(regs.pop()-reg, op, false); break;
		case 128:
		case 129: cal0(regs.pop()*reg, op, false); break;
		case 130: cal0(regs.pop()/reg, op, false); break;
		case 160: cal0(getProduct(regs.pop(), reg)/getProduct(reg, reg), op, false); break; //nCr
		case 161: cal0(getProduct(regs.pop(), reg), op, false); break; //nPr
		case 192: cal0(regs.pop()*Math.sqrt(reg), op, false); break;
		case 193: cal0(regs.pop()*Math.cbrt(reg), op, false); break;
		case 194: cal0(regs.pop()*Math.log10(reg), op, false); break;
		case 195: cal0(regs.pop()*Math.log(reg), op, false); break;
		case 196: cal0(regs.pop()*Math.pow(10.0, reg), op, false); break;
		case 197: cal0(regs.pop()*Math.exp(reg), op, false); break;
		case 198: cal0(regs.pop()*Math.sin(reg), op, false); break;
		case 199: cal0(regs.pop()*Math.cos(reg), op, false); break;
		case 200: cal0(regs.pop()*Math.tan(reg), op, false); break;
		case 201: cal0(regs.pop()*Math.asin(reg), op, false); break;
		case 202: cal0(regs.pop()*Math.acos(reg), op, false); break;
		case 203: cal0(regs.pop()*Math.atan(reg), op, false); break;
		case 204: cal0(regs.pop()*Math.sinh(reg), op, false); break;
		case 205: cal0(regs.pop()*Math.cosh(reg), op, false); break;
		case 206: cal0(regs.pop()*Math.tanh(reg), op, false); break;
		case 207: cal0(regs.pop()*Math.log(reg+Math.sqrt(reg*reg+1)), op, false); break; //sin hyp -1
		case 208: cal0(regs.pop()*Math.log(reg+Math.sqrt(reg*reg-1)), op, false); break; //cos hyp -1
		case 209: cal0(regs.pop()*Math.log((1+reg)/(1-reg))/2, op, false); break; //tan hyp -1
		case 242: cal0(Math.pow(regs.pop(), reg), op, false); break;
		case 243: cal0(Math.pow(reg, 1.0/regs.pop()), op, false); break;
		case 256: regs.push(reg); ops.push(op); break;
		}
//		if (out) System.out.println("u:"+reg+"\t"+op+"\t"+regs+"\t"+ops+"\n");
	}
	private double getProduct(double last, double cnt) { //factorial(n)= getProduct(n, n);
		double result= last;
		while (0<--cnt) result*= --last;
		return result;
	}
	private long getGCD(long a, long b) {
		a= Math.abs(a);
		b= Math.abs(b);
		if (a<b) {
			return getGCD(b, a);
		} else {
			if (a % b==0) {
				return b;
			} else {
				return getGCD(b, a % b);
			}
		}
	}
	private long getLCM(long a, long b) {
		return Math.floorDiv(a*b, getGCD(a, b));
	}
}