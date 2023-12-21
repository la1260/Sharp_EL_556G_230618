package hu.hl.sharp_el_556g_230926;

import java.awt.event.KeyEvent;
import java.util.TreeMap;

public class KeyCode {
	private static final TreeMap<Character, Calculator.KeyComm> keychar= new TreeMap<Character, Calculator.KeyComm>();  
	private static final TreeMap<Integer, Calculator.KeyComm> keycode= new TreeMap<Integer, Calculator.KeyComm>();  
	static {
		keychar.put('0', Calculator.KeyComm.K0);
		keychar.put('1', Calculator.KeyComm.K1);
		keychar.put('2', Calculator.KeyComm.K2);
		keychar.put('3', Calculator.KeyComm.K3);
		keychar.put('4', Calculator.KeyComm.K4);
		keychar.put('5', Calculator.KeyComm.K5);
		keychar.put('6', Calculator.KeyComm.K6);
		keychar.put('7', Calculator.KeyComm.K7);
		keychar.put('8', Calculator.KeyComm.K8);
		keychar.put('9', Calculator.KeyComm.K9);
		keychar.put(',', Calculator.KeyComm.Dot);
		keychar.put('.', Calculator.KeyComm.Dot);
		keychar.put('x', Calculator.KeyComm.Exp);
		keychar.put('=', Calculator.KeyComm.Equals);
/*		keychar.put('+', 22);
		keychar.put('-', 23);
		keychar.put('*', 24);
		keychar.put('/', 25);
		keychar.put('(', 26);
		keychar.put(')', 27);
		keychar.put('%', 28);
		keychar.put('!', 29);
		keychar.put('°', 30);
*/		
		keycode.put(KeyEvent.VK_A, Calculator.KeyComm.KA);
		keycode.put(KeyEvent.VK_B, Calculator.KeyComm.KB);
		keycode.put(KeyEvent.VK_C, Calculator.KeyComm.KC);
		keycode.put(KeyEvent.VK_D, Calculator.KeyComm.KD);
		keycode.put(KeyEvent.VK_E, Calculator.KeyComm.KE);
		keycode.put(KeyEvent.VK_F, Calculator.KeyComm.KF);
		keycode.put(KeyEvent.VK_ESCAPE, Calculator.KeyComm.C);
		keycode.put(KeyEvent.VK_BACK_SPACE, Calculator.KeyComm.Back);
/*		keycode.put(KeyEvent.VK_F9, 20);
*/		keycode.put(KeyEvent.VK_ENTER, Calculator.KeyComm.Equals);
		keycode.put(KeyEvent.VK_F5, Calculator.KeyComm.Bin); //bin
		keycode.put(KeyEvent.VK_F6, Calculator.KeyComm.Oct); //oct
		keycode.put(KeyEvent.VK_F7, Calculator.KeyComm.Dec); //dec
		keycode.put(KeyEvent.VK_F8, Calculator.KeyComm.Hex); //hex
	}
	public static Calculator.KeyComm getCode(KeyEvent keyevent) {
		return keychar.getOrDefault(keyevent.getKeyChar(), keycode.getOrDefault(keyevent.getKeyCode(), Calculator.KeyComm.Unkn));
	}
}
