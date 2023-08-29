package hu.hl.sharp_el_556g_230826;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.TreeMap;


public class Main implements KeyListener {
	private JFrame frame;
	private JLabel label0;
	private JLabel label1;
	private JLabel label2;
	private Calculator calculator;
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		frame= new JFrame();
		frame.setBounds(100, 200, 300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.addKeyListener(this);
		
		frame.add(label0= new JLabel());
		label0.setBounds(16, 16, 32, 16);
		label0.setOpaque(true);
		label0.setBackground(Color.CYAN);
		label0.setVisible(true);

		frame.add(label1= new JLabel());
		label1.setBounds(56, 16, 96, 16);
		label1.setOpaque(true);
		label1.setBackground(Color.YELLOW);
		label1.setVisible(true);

		frame.add(label2= new JLabel());
		label2.setBounds(160, 16, 24, 16);
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		label2.setVisible(true);
		
		calculator = new Calculator();
		keyPressed(new KeyEvent(frame, -1, -1, -1, KeyEvent.VK_ESCAPE)); //ez kell!!!

	}
	public void keyPressed(KeyEvent keyevent) {
		int c= KeyCode.getCode(keyevent);
		if (-1<c) {
/*			String[] s= calculator.key(c);
			label0.setText("");
			label1.setText(s[0]);
			label2.setText(s[1]);*/
		} else {
			label1.setText("chr:"+keyevent.getKeyChar()+" cd:"+keyevent.getKeyCode());
		}
	}
	public void keyTyped(KeyEvent keyevent) {}
	public void keyReleased(KeyEvent keyevent) {}
}

class Calculator {
	public static enum Mode {NormalDec, NormalBin, NormalOct, NormalHex, CplxDes, CplxPol, Vle3, Stat0, Stat1, Stat2, Stat3, Stat4, Stat5, Stat6}
	public static enum Drg {Deg, Rad, Grad}
	public static enum Fse {Non, Fix, Sci, Eng}
	public static enum Tab {Tab0, Tab1, Tab2, Tab3, Tab4, Tab5, Tab6, Tab7, Tab8, Tab9}
	public static enum RegID {Input, Ans, A, B, C, D, E, F, X, Y, M}
	private Mode mode= Mode.NormalDec;
	private Drg drg= Drg.Deg;
	private Fse fse= Fse.Non;
	private Tab tab= Tab.Tab9;
	private TreeMap<RegID, Reg> regs= new TreeMap<RegID, Reg>();
	public Calculator() {
		Arrays.asList(RegID.values()).forEach(rid -> regs.put(rid, new Reg()));
	}
	public String[] key(int key) {
		Reg result= null;
		switch (key) {
		case 0:
		case 1:
			(result= regs.get(RegID.Input)).in(mode, key);
			break;
		case 2:
			result= regs.get(RegID.Ans);
			break;
		case 3:
			result= regs.get(RegID.M);
			break;
		}
		return result.out(mode, drg, fse, tab);
	}
}

class Reg {
	private final BigDecimal[] bds= new BigDecimal[3];
	private static enum Type {Nrm, Hms, Cfr, CorDes, CorPol}
	private Type type;
	private int index;
	public void in(Calculator.Mode mode, int key) {
		
	}
	public String[] out(Calculator.Mode mode, Calculator.Drg drg, Calculator.Fse fse, Calculator.Tab tab) {
		return null;
	}
}