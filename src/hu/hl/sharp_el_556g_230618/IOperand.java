package hu.hl.sharp_el_556g_230618;

public interface IOperand {
	public void or(IOperand operand);
	public void xor(IOperand operand);
	public void add(IOperand operand);
	public void sub(IOperand operand);
	public void mul(IOperand operand);
	public void div(IOperand operand);
}

enum Base{B, O, D, H}

interface ILong {
	public Base getBase();
}

class CLong implements IOperand {
	private long value;
	private ILong ilong;
	public CLong(long value, ILong ilong) {
		this.value= value;
		this.ilong= ilong;
	}
	public void or(IOperand operand) {
		CLong b= (CLong) operand;
		value|= b.value;
	}
	public void xor(IOperand operand) {
		CLong b= (CLong) operand;
		value^= b.value;
	}
	public void add(IOperand operand) {
		CLong b= (CLong) operand;
		value+= b.value;
	}
	public void sub(IOperand operand) {
		CLong b= (CLong) operand;
		value-= b.value;
	}
	public void mul(IOperand operand) {
		CLong b= (CLong) operand;
		value*= b.value;
	}
	public void div(IOperand operand) {
		CLong b= (CLong) operand;
		value/= b.value;
	}
	public String toString() {
		switch (ilong.getBase()) {
		case B: return java.lang.Long.toBinaryString(value);
		case O: return java.lang.Long.toOctalString(value);
		case D: return java.lang.Long.toString(value);
		case H: return java.lang.Long.toHexString(value);
		}
		return String.valueOf(value);
	}
}

class Double implements IOperand {
	private double value;
	public Double(double value) {
		this.value= value;
	}
	public void or(IOperand operand) {}
	public void xor(IOperand operand) {}
	public void add(IOperand operand) {
		Double b= (Double) operand;
		value+= b.value;
	}
	public void sub(IOperand operand) {
		Double b= (Double) operand;
		value-= b.value;
	}
	public void mul(IOperand operand) {
		Double b= (Double) operand;
		value*= b.value;
	}
	public void div(IOperand operand) {
		Double b= (Double) operand;
		value/= b.value;
	}
	public String toString() {
		return String.valueOf(value);
	}
}

class CommonFraction implements IOperand {
	private long numerator;
	private long denominator;
	public CommonFraction(long numerator, long denominator) {
		this.numerator= Math.floorDiv(numerator, getGCD(numerator, denominator));
		this.denominator= Math.floorDiv(denominator, getGCD(numerator, denominator));
	}
	public CommonFraction(long numerator1, long numerator2, long denominator) {
		this(numerator1*denominator+numerator2, denominator);
	}
	public void or(IOperand operand) {}
	public void xor(IOperand operand) {}
	public void add(IOperand operand) {
		CommonFraction b= (CommonFraction) operand;
		long cd= getLCM(denominator, b.denominator);
		numerator= Math.floorDiv(cd*numerator, denominator)+Math.floorDiv(cd*b.numerator, b.denominator);
		denominator= cd;
	}
	public void sub(IOperand operand) {
		CommonFraction b= (CommonFraction) operand;
		long cd= getLCM(denominator, b.denominator);
		numerator= Math.floorDiv(cd*numerator, denominator)-Math.floorDiv(cd*b.numerator, b.denominator);
		denominator= cd;
	}
	public void mul(IOperand operand) {
		CommonFraction b= (CommonFraction) operand;
		long nn= numerator*b.numerator;
		long nd= denominator*b.denominator;
		numerator= Math.floorDiv(nn, getGCD(nn, nd));
		denominator= Math.floorDiv(nd, getGCD(nn, nd));
	}
	public void div(IOperand operand) {
		CommonFraction b= (CommonFraction) operand;
		long nn= numerator*b.denominator;
		long nd= denominator*b.numerator;
		numerator= Math.floorDiv(nn, getGCD(nn, nd));
		denominator= Math.floorDiv(nd, getGCD(nn, nd));
	}
	private static long getGCD(long a, long b) {
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
	private static long getLCM(long a, long b) {
		return Math.floorDiv(a*b, getGCD(a, b));
	}
	public String toString() {
		return String.valueOf(numerator+"/"+denominator);
	}
}

class Complex implements IOperand {
	private double real;
	private double imag;
	public Complex(double real, double imag) {
		this.real= real;
		this.imag= imag;
	}
	public void or(IOperand operand) {}
	public void xor(IOperand operand) {}
	public void add(IOperand operand) {
		Complex b= (Complex) operand;
		real+= b.real;
		imag+= b.imag;
	}
	public void sub(IOperand operand) {
		Complex b= (Complex) operand;
		real-= b.real;
		imag-= b.imag;
	}
	public void mul(IOperand operand) {
		Complex b= (Complex) operand;
		double real= this.real*b.real-this.imag*b.imag;
		double imag= this.real*b.imag+b.real*this.imag;
		this.real= real;
		this.imag= imag;
	}
	public void div(IOperand operand) {
		Complex b= (Complex) operand;
		double d= b.real*b.real+b.imag*b.imag;
		double real= (this.real*b.real+this.imag*b.imag)/d;
		double imag= (this.imag*b.real-this.real*b.imag)/d;
		this.real= real;
		this.imag= imag;
	}
	public String toString() {
		return String.valueOf(real+"+"+imag+"i");
	}
}