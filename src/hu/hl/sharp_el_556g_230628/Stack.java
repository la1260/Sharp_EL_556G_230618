package hu.hl.sharp_el_556g_230628;

import java.nio.ByteBuffer;

interface IStackListener {
	public void onChange(String s);
}

public class Stack {
	private final IStackListener istacklistener;
	private java.util.Stack<ByteBuffer> operand= new java.util.Stack<ByteBuffer>();
	private java.util.Stack<Integer> operator= new java.util.Stack<Integer>();
	private int pl;
	public Stack(IStackListener istacklistener) {
		this.istacklistener= istacklistener;
	}
	public void push(ByteBuffer operand, int operator) {
		if (this.operator.isEmpty() && operand!=null) {
			this.operand.clear();
		}
		switch (operator) {
		case 0:
			if (operand!=null) this.operand.push(operand);
			while (executeLastOperator());
			break;
		case 1:
			if (operand!=null) this.operand.push(operand);
			if (this.operator.size()<this.operand.size()) {
				this.operator.push(pl<<8 | 130);
			}
			if(pl<7) {
				pl++;
			}
			break;
		case 2:
			if (operand!=null) this.operand.push(operand);
			while (pl<<8<=getLastOperator()) executeLastOperator();
			if(0<pl) {
				pl--;
				while ((pl<<8 | 128)<=getLastOperator()) executeLastOperator();
			}
			break;
		case 3:
			push(operand, 0);
//			base= Base.B;
			break;
		case 4:
			push(operand, 0);
//			base= Base.O;
			break;
		case 5:
			push(operand, 0);
//			base= Base.D;
			break;
		case 6:
			push(operand, 0);
//			base= Base.H;
			break;
		case 32:
		case 33:
		case 96:
		case 97:
		case 128:
		case 129:
			if (operand!=null) this.operand.push(operand);
			while ((pl<<8 | operator & 0xe0)<=getLastOperator()) executeLastOperator();
			this.operator.push(pl<<8 | operator);
			break;
		}
		update();
	}
	private int getLastOperator() {
		return (operator.isEmpty()) ? -1 : operator.peek();
	}
	private boolean executeLastOperator() {
		if (!operator.isEmpty()) {
/*			Operand operand= this.operand.pop();
			switch (operator.pop() & 0xff) {
			case 32: this.operand.peek().or(operand); break;
			case 33: this.operand.peek().xor(operand); break;
			case 96: this.operand.peek().add(operand); break;
			case 97: this.operand.peek().sub(operand); break;
			case 130:
			case 128: this.operand.peek().mul(operand); break;
			case 129: this.operand.peek().div(operand); break;
			}*/
		}
		return !operator.isEmpty();
	}
	private void update() {
		istacklistener.onChange("");
	}
}
