package hu.hl.sharp_el_556g_241106;

class Calculator0 {
	protected int mode= 0;
	public void toNorm() {
		mode= 0;
	}
	public void toCplx() {
		mode= 4;
	}
	public void to3Vle() {
		mode= 6;
	}
	public void toStat(int stat) {
		mode= 8+stat;			
	}
	public void toDec() {
		if (mode==1 | mode==2 | mode==3) {
			mode= 0;
		}
	}
	public void toBin() {
		if (mode==0 | mode==2 | mode==3) {
			mode= 1;
		}
	}
	public void toOct() {
		if (mode==0 | mode==1 | mode==3) {
			mode= 2;
		}
	}
	public void toHex() {
		if (mode==0 | mode==1 | mode==2) {
			mode= 3;
		}
	}
	public void toXY() {
		if (mode==5) {
			mode= 4;
		}
	}
	public void toRθ() {
		if (mode==4) {
			mode= 5;
		}
	}
	public String getMode0() {
		switch (mode) {
		case 0: case 1: case 2: case 3:
			return "normal";
		case 4: case 5:
			return "cplx";
		case 6:
			return "3-vle";
		case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14:
			return "stat";
		}
		return null;
	}
	public String getMode1() {
		switch (mode) {
		case 0:
			return "dec";
		case 1:
			return "bin";
		case 2:
			return "oct";
		case 3:
			return "hex";
		case 4: 
			return "XY";
		case 5:
			return "Rθ";
		case 6:
			return "";
		case 7:
			return "?";
		case 8:
			return "0";
		case 9:
			return "1";
		case 10:
			return "2";
		case 11:
			return "3";
		case 12:
			return "4";
		case 13:
			return "5";
		case 14:
			return "6";
		}
		return null;
	}	
}