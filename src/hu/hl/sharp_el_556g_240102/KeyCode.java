package hu.hl.sharp_el_556g_240102;

import java.awt.event.KeyEvent;
import java.util.TreeMap;

public class KeyCode {
	private static final TreeMap<Character, Integer> keychar= new TreeMap<Character, Integer>();  
	private static final TreeMap<Integer, Integer> keycode= new TreeMap<Integer, Integer>();  
	static {
		keychar.put('0', 1); 
		keychar.put('1', 2); 
		keychar.put('2', 3); 
		keychar.put('3', 4); 
		keychar.put('4', 5); 
		keychar.put('5', 6); 
		keychar.put('6', 7); 
		keychar.put('7', 8); 
		keychar.put('8', 9); 
		keychar.put('9', 10);
		keychar.put(',', 11);
		keychar.put('.', 11);
		keychar.put('x', 12);
		keychar.put('y', 13); // /
		keychar.put('k', 14); // °
/*		keychar.put('=', Calculator.KeyComm.Equals);
*/		keychar.put('+', 17);
		keychar.put('-', 18);
/*		keychar.put('*', 19);
		keychar.put('/', 20);
		keychar.put('(', 26);
		keychar.put(')', 27);
		keychar.put('%', 28);
		keychar.put('!', 29);
		keychar.put('°', 14);
		
		keycode.put(KeyEvent.VK_A, Calculator.KeyComm.KA);
		keycode.put(KeyEvent.VK_B, Calculator.KeyComm.KB);
		keycode.put(KeyEvent.VK_C, Calculator.KeyComm.KC);
		keycode.put(KeyEvent.VK_D, Calculator.KeyComm.KD);
		keycode.put(KeyEvent.VK_E, Calculator.KeyComm.KE);
		keycode.put(KeyEvent.VK_F, Calculator.KeyComm.KF);
*/		keycode.put(KeyEvent.VK_ESCAPE, 0);
		keycode.put(KeyEvent.VK_BACK_SPACE, 15);
		keycode.put(KeyEvent.VK_F9, 16);
/*		keycode.put(KeyEvent.VK_ENTER, Calculator.KeyComm.Equals);
		keycode.put(KeyEvent.VK_F5, Calculator.KeyComm.Bin); //bin
		keycode.put(KeyEvent.VK_F6, Calculator.KeyComm.Oct); //oct
		keycode.put(KeyEvent.VK_F7, Calculator.KeyComm.Dec); //dec
		keycode.put(KeyEvent.VK_F8, Calculator.KeyComm.Hex); //hex
*/	}
	public static int getCode(KeyEvent keyevent) {
		return keychar.getOrDefault(keyevent.getKeyChar(), keycode.getOrDefault(keyevent.getKeyCode(), 63));
	}
}
