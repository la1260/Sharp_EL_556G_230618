package hu.hl.sharp_el_556g_230618;

import java.nio.ByteBuffer;

enum Type {L, C, D, H, X, R}

public class Operand {
	private Type type;
	public ByteBuffer value= ByteBuffer.allocate(16);
	public Operand(Type type) {
		this.type= type;
		value.position(0);
	}
	public void key(byte key) {
		switch(this.type) {
		case L:
//			if ( ) value.put(key);
			break;
		case C:
		case D:
		case H:
		case X:
		case R:
		}
	}
	public void appendDot() {
		if (type.equals(Type.L)) {
			type= Type.D;
			value.putDouble(0, value.getLong(0));
		} else {
			
		}
		if (!String.valueOf(value.getDouble(0)).contains(".")) ; 
	}
	public void appendNum(int num) {
		switch(this.type) {
		case L:
			if (String.valueOf(value.getLong(0)).length()<10) value.putLong(0, value.getLong(0)*10+num);
			break;
		case D:
			if (String.valueOf(value.getDouble(0)).replace("-", "").replace(".", "").length()<10) value.putDouble(0, value.getDouble(0)*10+num);
			break;
		case C:
		case H:
		case X:
		case R:
		}
	}
	public String toString() {
		value.position(0);
		switch (type) {
		case L: return String.format("%s", value.getLong()); 
		case C: return String.format("%s/%s", value.getShort(), value.getShort()); 
		case D: return String.format("%s", value.getDouble());
		case H: return String.format("%s°%s´%s", value.getInt(), value.get(), value.getDouble());
		case X: return String.format("%s %si", value.getDouble(), value.getDouble());
		case R: return String.format("%s %sr", value.getDouble(), value.getDouble());
		default: return super.toString();
		}
	}
	public void or(Operand operand) {
		
	}
	public void xor(Operand operand) {
		
	}
	public void add(Operand operand) {
		
	}
	public void sub(Operand operand) {
		
	}
	public void mul(Operand operand) {
		
	}
	public void div(Operand operand) {
		
	}
}
