package hu.hl.sharp_el_556g_230926;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main implements KeyListener {
	private Calculator calculator;
	private Frame frame;
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		calculator= new Calculator();
		calculator.setMode(Calculator.Mode.NormOct);
		calculator.setFse(Calculator.Fse.Nrm);
		calculator.setTab(Calculator.Tab.Tab4);
		frame= new Frame(this);
		keyPressed(new KeyEvent(frame, -1, -1, -1, KeyEvent.VK_ESCAPE)); //ez kell!!!
	}
	public void keyPressed(KeyEvent keyevent) {
		Calculator.KeyComm c= KeyCode.getCode(keyevent);
		String[] s= calculator.key(c);
		if (c.equals(Calculator.KeyComm.Unkn)) {
			s[0]= "chr:"+keyevent.getKeyChar()+" cd:"+keyevent.getKeyCode();
		}
		frame.update(s);
	}
	public void keyTyped(KeyEvent keyevent) {}
	public void keyReleased(KeyEvent keyevent) {}			
}