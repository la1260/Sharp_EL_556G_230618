package hu.hl.sharp_el_556g_230618;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class Calculator {
//	private Type inputtype;
//	private int inputindex;
	String[] inputstr;
//	private Stack stack= new Stack();
	public Calculator() {
//		inputtype= Type.L;
//		inputindex= 0;
		inputstr= new String[]{"0", "", ""};
		
		key(1);
		key(2);
		key(3);
		key(4);
		key(5);
		key(6);
		key(10);
		key(7);
		key(8);
		System.out.println();
		System.exit(4);
		
/*		Operand o= new Operand(Type.D);
		o.appendNum(1);
		o.appendNum(2);
		o.appendNum(3);
		o.appendNum(4);
		o.appendNum(5);
		o.appendDot();
		o.appendNum(6);
		o.appendNum(7);
		o.appendNum(8);
		o.appendNum(9);
		o.appendNum(0);
		*/
//		o.value.putDouble(3);
//		o.value.putDouble(-4);
		
		ByteBuffer b= ByteBuffer.allocate(16);
		b.position(0);
		b.put((byte) 48);
		b.put((byte) 48);
		System.out.println(Charset.forName("UTF-8").decode(b).toString());
		b.put((byte) 192);
		System.out.println(Charset.forName("UTF-8").decode(b).toString());
		
/*		stack.push(new CommonFraction(4, 1), 1);
		stack.push(new CommonFraction(1, 1), 97);
		stack.push(new CommonFraction(1, 3), 96);
		stack.push(new CommonFraction(1, 5), 97);
		stack.push(new CommonFraction(1, 7), 96);
		stack.push(new CommonFraction(1, 9), 97);
		stack.push(new CommonFraction(1, 11), 96);
		stack.push(new CommonFraction(1, 13), 97);
		stack.push(new CommonFraction(1, 15), 96);
		stack.push(new CommonFraction(1, 17), 0);
		
		stack.push(new Long(4356, stack), 97);
		stack.push(new Long(260, stack), 6);
		System.out.println(stack.operand.toString());
		stack.push(null, 5);
		System.out.println(stack.operand.toString());
		stack.push(null, 4);
		System.out.println(stack.operand.toString());
		stack.push(null, 3);
		
/*		
		stack.push(new CommonFraction(1, 2), 97);
		stack.push(new CommonFraction(1, 3), 1);
		stack.push(new CommonFraction(42, 15), 97);
		stack.push(new CommonFraction(1, 8), 96);
		stack.push(new CommonFraction(5, 4), 97);
		stack.push(new CommonFraction(6, 7), 2);
		stack.push(null, 0);
		
/*		stack.push(new Operand(8), 129);
		stack.push(new Operand(2), 128);
		stack.push(new Operand(-15), 129);
		stack.push(null, 1);
		stack.push(null, 1);
		stack.push(new Operand(5), 97);
		stack.push(new Operand(8), 2);
		stack.push(null, 97);
		stack.push(new Operand(7), 2);
		stack.push(null, 96);
		stack.push(new Operand(9), 96);
		stack.push(new Operand(6), 128);
		stack.push(new Operand(3), 0);

		stack.push(null, 97);

		stack.push(new Operand(1), 96);
//		stack.push(new Operand(2), 128); // 
//		stack.push(null, 1);             // 
		stack.push(new Operand(2), 1);
		
		stack.push(new Operand(3), 96);
//		stack.push(new Operand(4), 128); //
//		stack.push(null, 1);             //
		stack.push(new Operand(4), 1);
		
		stack.push(new Operand(5), 97);
		stack.push(new Operand(6), 2);
//		stack.push(null, 128);           //
		stack.push(null, 1);
//		System.out.println(stack.operand.toString()); 
//		System.out.println(stack.operator.toString()); 
		stack.push(new Operand(7), 97);
		stack.push(new Operand(8), 2);
		stack.push(null, 2);
		
		stack.push(null, 0);*/

		
//		System.out.println(stack.operand.toString());
	}
	private void key(int key) {
/*		switch(index<<8 | key) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			
/*			if ((s[0]+s[1]+s[2]).matches("\\d{1,4}")) {
				s[index]+= String.valueOf(key);
			}
			break;
		case 10:
			if (inputtype.equals(Type.L) && !inputstr[0].equals("0")) {
				inputtype= Type.C;
			}
			if (inputtype.equals(Type.C) && (inputstr[0]+"/"+inputstr[1]+"/"+inputstr[2]).matches("")) {
				inputindex++;
			}
		}*/
	}
}