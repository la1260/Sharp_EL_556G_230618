package hu.hl.sharp_el_556g_241106;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	private Alu alu= new Alu();
	private Input input= new Input();
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc= new Scanner(System.in);
		System.out.println(sc.next());
//		new Main();
	}
	public Main() throws FileNotFoundException {
		key(8); // 8
		key(32); // +
		key(33); // <-
		key(34); // =
		key(34); // =
	}
	public void key(int key) throws FileNotFoundException {
		FileInputStream fis= new FileInputStream(""); 
		BufferedInputStream bis= new BufferedInputStream(fis);

		
		Vector<Integer> c= new Vector<Integer>();
		c.add(1);
		c.add(4);
		c.add(1);
		c.add(5);
		c.add(9);
		c.add(2);
		c.add(6);
		c.add(5);
		c.add(3);
		c.add(5);
		Collections.reverse(c);
		
		int status= 0;
		switch (status<<8 | key) {
		case 0:
		case 1:
		case 2:
			input.append(key);
			break;
		case 17:
			alu.x= Double.parseDouble(input.input.toString());
			break;
		}
	}
	public String toString() {
		return null;
	}
	
}

class Input {
	public StringBuilder input= new StringBuilder();
	public void append(int i) {
		input.append(i);
	}
}

class Alu {
	public int o;
	public double x;
	public double y;
	public double a;
	public void calc() {
		switch (o) {
		case 0: a= x+y; return;
		case 1: a= x-y; return;
		case 2: a= x*y; return;
		case 3: a= x/y; return;
		}
	}
}