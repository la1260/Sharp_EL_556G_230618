package hu.hl.sharp_el_556g_230701;

import java.nio.ByteBuffer;

enum Type {Lon, Dbl, Bin, Oct, Hex, Cmf, Hms}

public class Operand {
	private Type type;
	private ByteBuffer value= ByteBuffer.allocate(16);
	public Operand(Type type, Object value) {
/*		this.type= type;
		switch (type) {
		case Lon: this.value.putLong(0, (long) value); break;
		case Dbl: this.value.putDouble(0, (Double) value); break;
		}*/
	}
	public void add(Operand o) {
		if (type.equals(Type.Lon) && o.type.equals(Type.Lon)) {
			type= Type.Dbl;
			value.putLong(0, value.getLong(0)+o.value.getLong(0));
		} else if (type.equals(Type.Dbl) && o.type.equals(Type.Lon)) {
			type= Type.Dbl;
			value.putDouble(0, value.getDouble(0)+o.value.getLong(0));
		} else if (type.equals(Type.Lon) && o.type.equals(Type.Dbl)) {
			type= Type.Dbl;
			value.putDouble(0, value.getLong(0)+o.value.getDouble(0));
		} else if (type.equals(Type.Dbl) && o.type.equals(Type.Dbl)) {
			type= Type.Dbl;
			value.putDouble(0, value.getDouble(0)+o.value.getDouble(0));
		}
	}
	public void sub(Operand o) {
		if (type.equals(Type.Lon) && o.type.equals(Type.Lon)) {
			type= Type.Dbl;
			value.putLong(0, value.getLong(0)-o.value.getLong(0));
		} else if (type.equals(Type.Dbl) && o.type.equals(Type.Lon)) {
			type= Type.Dbl;
			value.putDouble(0, value.getDouble(0)-o.value.getLong(0));
		} else if (type.equals(Type.Lon) && o.type.equals(Type.Dbl)) {
			type= Type.Dbl;
			value.putDouble(0, value.getLong(0)-o.value.getDouble(0));
		} else if (type.equals(Type.Dbl) && o.type.equals(Type.Dbl)) {
			type= Type.Dbl;
			value.putDouble(0, value.getDouble(0)-o.value.getDouble(0));
		}

	}
	public void mul(Operand o) {
		if (type.equals(Type.Lon) && o.type.equals(Type.Lon)) {
			type= Type.Dbl;
			value.putLong(0, value.getLong(0)*o.value.getLong(0));
		} else if (type.equals(Type.Dbl) && o.type.equals(Type.Lon)) {
			type= Type.Dbl;
			value.putDouble(0, value.getDouble(0)*o.value.getLong(0));
		} else if (type.equals(Type.Lon) && o.type.equals(Type.Dbl)) {
			type= Type.Dbl;
			value.putDouble(0, value.getLong(0)*o.value.getDouble(0));
		} else if (type.equals(Type.Dbl) && o.type.equals(Type.Dbl)) {
			type= Type.Dbl;
			value.putDouble(0, value.getDouble(0)*o.value.getDouble(0));
		}
	}
	public void div(Operand o) {
		if (type.equals(Type.Lon) && o.type.equals(Type.Lon)) {
			type= Type.Dbl;
			value.putDouble(0, (double) value.getLong(0)/o.value.getLong(0));
		} else if (type.equals(Type.Dbl) && o.type.equals(Type.Lon)) {
			type= Type.Dbl;
			value.putDouble(0, value.getDouble(0)*o.value.getLong(0));
		} else if (type.equals(Type.Lon) && o.type.equals(Type.Dbl)) {
			type= Type.Dbl;
			value.putDouble(0, value.getLong(0)*o.value.getDouble(0));
		} else if (type.equals(Type.Dbl) && o.type.equals(Type.Dbl)) {
			type= Type.Dbl;
			value.putDouble(0, value.getDouble(0)*o.value.getDouble(0));
		}
	}
	public String toString() {
		switch (type) {
		case Lon: return String.valueOf(value.getLong(0));
		case Dbl:
			double d= value.getDouble(0);
			if (Math.abs(d)<1e+10) {
				String s= String.valueOf(d);
				while (10<s.replaceAll("(\\d*)\\.(\\d*)", "$1$2").length()) s= s.substring(0, s.length()-1);
				return s;
			} else {
				return String.format("%e", d);
			}
		default: return "";
		}
	}
}