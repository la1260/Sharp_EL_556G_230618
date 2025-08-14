package hu.hl.sharp_el_556g_250708;

import java.util.LinkedList;

public class Input extends LinkedList<Character> {
	private static final long serialVersionUID = 1L;
/*	public int size() {
		return toString().replace("-", "").replace(".", "").length();
	}
*/	public String toString() {
		return stream().collect(() -> new StringBuilder(), (stringbuilder, c) -> stringbuilder.append(c), (c, d) -> {}).toString();
	}
}