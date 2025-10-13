package hu.hl.sharp_el_556g_241106;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeMap;

public class Main {
	private final Form form;
	private Calculator1 calculator= new Calculator1();
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
					brb(k);
				}
			}
			public void keyReleased(KeyEvent keyevent) {}
			public void keyTyped(KeyEvent keyevent) {}
		});
	}
	private void brb(char c) {
		switch (c) {
		case 'a': calculator.toNorm(); break;
		case 'b': calculator.toCplx(); break;
		case 'c': calculator.to3Vle(); break;
		case 'd': calculator.toStat(-1); break;
		case 'e': calculator.toDec(); break;
		case 'f': calculator.toBin(); break;
		case 'g': calculator.toOct(); break;
		case 'h': calculator.toHex(); break;
		case 'i': calculator.toXY(); break;
		case 'j': calculator.toRθ(); break;
		}		
		String[] ss= new String[7];
		ss[3]= String.format("%s,%s,", calculator.getMode0(), calculator.getMode1());
		form.update(ss);
	}
}

class Calculator1 extends Calculator0 {
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