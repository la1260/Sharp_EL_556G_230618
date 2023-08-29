package hu.hl.sharp_el_556g_230826;

import java.awt.event.KeyEvent;
import java.util.TreeMap;

public class KeyCode {
	private static final long serialVersionUID = -694378855022590151L;
	private static final TreeMap<Character, Integer> keychar= new TreeMap<Character, Integer>();  
	private static final TreeMap<Integer, Integer> keycode= new TreeMap<Integer, Integer>();  
	static {
		keychar.put('0', 0);
		keychar.put('1', 1);
		keychar.put('2', 2);
		keychar.put('3', 3);
		keychar.put('4', 4);
		keychar.put('5', 5);
		keychar.put('6', 6);
		keychar.put('7', 7);
		keychar.put('8', 8);
		keychar.put('9', 9);
		keychar.put(',', 17);
		keychar.put('.', 17);
		keychar.put('x', 18);
		keychar.put('=', 21);
		keychar.put('+', 22);
		keychar.put('-', 23);
		keychar.put('*', 24);
		keychar.put('/', 25);
		keychar.put('(', 26);
		keychar.put(')', 27);
		keychar.put('%', 28);
		keychar.put('!', 29);
		keychar.put('°', 30);
		
		keycode.put(KeyEvent.VK_A, 10);
		keycode.put(KeyEvent.VK_B, 11);
		keycode.put(KeyEvent.VK_C, 12);
		keycode.put(KeyEvent.VK_D, 13);
		keycode.put(KeyEvent.VK_E, 14);
		keycode.put(KeyEvent.VK_F, 15);
		keycode.put(KeyEvent.VK_ESCAPE, 16);
		keycode.put(KeyEvent.VK_BACK_SPACE, 19);
		keycode.put(KeyEvent.VK_F9, 20);
		keycode.put(KeyEvent.VK_ENTER, 21);
		keycode.put(KeyEvent.VK_F5, 31); //bin
		keycode.put(KeyEvent.VK_F6, 32); //oct
		keycode.put(KeyEvent.VK_F7, 33); //dec
		keycode.put(KeyEvent.VK_F8, 34); //hex
	}
	public static int getCode(KeyEvent keyevent) {
		return keychar.getOrDefault(keyevent.getKeyChar(), keycode.getOrDefault(keyevent.getKeyCode(), -1));
	}
}
