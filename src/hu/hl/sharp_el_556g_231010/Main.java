package hu.hl.sharp_el_556g_231010;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import hu.hl.sharp_el_556g_230826.KeyCode;
import hu.hl.sharp_el_556g_230926.Frame;

enum Operator {Equ, Opn, Add, Sub, Mul, Div, Cls}

public class Main implements KeyListener {
	private Calculator calculator;
	private Frame frame;
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
//		frame= new Frame(this);
		Stack stack= new Stack(); // + 3; - 4; * 5; / 6
		
	
		stack.push(new BigDecimal(1), Operator.Add);
		stack.push(new BigDecimal(2), Operator.Mul);
		stack.push(null, Operator.Opn);
		stack.push(new BigDecimal(3), Operator.Add);
		stack.push(new BigDecimal(4), Operator.Mul);
		stack.push(null, Operator.Opn);
		stack.push(new BigDecimal(5), Operator.Sub);
		stack.push(new BigDecimal(6), Operator.Cls);
		stack.push(null, Operator.Mul);
		stack.push(null, Operator.Opn);
		stack.push(new BigDecimal(7), Operator.Sub);
		stack.push(new BigDecimal(8), Operator.Cls);
		stack.push(null, Operator.Cls);
		stack.push(null, Operator.Equ);
		
		
/*		stack.push(null, 1);
		stack.push(new BigDecimal(8), 4);
		stack.push(new BigDecimal(4), 2);
		stack.push(null, 5);
		stack.push(null, 1);
		stack.push(new BigDecimal(8), 4);
		stack.push(new BigDecimal(4), 2);
		stack.push(null, 0);
		
		
/*		stack.push(null, 1);
		stack.push(null, 1);
		stack.push(new BigDecimal(6), 4);
		stack.push(new BigDecimal(8), 2);
		stack.push(null, 5);
		stack.push(new BigDecimal(5), 3);
		stack.push(new BigDecimal(7), 2);
		stack.push(null, 5);
		stack.push(new BigDecimal(-3), 0);
*/		
		
/*		
		calculator= new Calculator();
		keyPressed(new KeyEvent(frame, -1, -1, 0, KeyEvent.VK_ESCAPE, (char) KeyEvent.VK_ESCAPE)); //ez kell!!!
		
		keyPressed(new KeyEvent(frame, -1, -1, 0,  81, 'q')); //2.2
		keyPressed(new KeyEvent(frame, -1, -1, 0, 104, '8'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 109, '-'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 100, '4'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  87, 'w'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  81, 'q')); //2.1.1
		keyPressed(new KeyEvent(frame, -1, -1, 0, 104, '8'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 109, '-'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 100, '4'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  87, 'w'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  KeyEvent.VK_ENTER, ' '));
		System.out.println("=====");
/*		keyPressed(new KeyEvent(frame, -1, -1, 0, 104, '8'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 111, '/'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  98, '2'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 106, '*'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  97, '1'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 101, '5'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  KeyEvent.VK_F9, ' '));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 111, '/'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  81, 'q')); //2.1.1
		keyPressed(new KeyEvent(frame, -1, -1, 0,  81, 'q')); //2.1.1
		keyPressed(new KeyEvent(frame, -1, -1, 0, 101, '5'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 109, '-'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 104, '8'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  87, 'w'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 109, '-'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 103, '7'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  87, 'w'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 107, '+'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 105, '9'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 107, '+'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 102, '6'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 106, '*'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  99, '3'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  KeyEvent.VK_ENTER, ' '));
		System.out.println("=====");
		keyPressed(new KeyEvent(frame, -1, -1, 0,  97, '1'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 107, '+'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  98, '2'));
//		keyPressed(new KeyEvent(frame, -1, -1, 0, 106, '*'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  81, 'q')); //1.
		keyPressed(new KeyEvent(frame, -1, -1, 0,  99, '3'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 107, '+'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 100, '4'));
//		keyPressed(new KeyEvent(frame, -1, -1, 0, 106, '*'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  81, 'q')); //1.
		keyPressed(new KeyEvent(frame, -1, -1, 0, 101, '5'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 109, '-'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 102, '6'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  87, 'w'));
//		keyPressed(new KeyEvent(frame, -1, -1, 0, 106, '*'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  81, 'q')); //2.1.1.
		keyPressed(new KeyEvent(frame, -1, -1, 0, 103, '7'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 109, '-'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 104, '8'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  87, 'w'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  87, 'w'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  KeyEvent.VK_ENTER, ' '));
		System.out.println("=====");
		keyPressed(new KeyEvent(frame, -1, -1, 0,  81, 'q')); //2.1.2.
		keyPressed(new KeyEvent(frame, -1, -1, 0,  81, 'q')); //2.2.
		keyPressed(new KeyEvent(frame, -1, -1, 0, 102, '6'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 109, '-'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 104, '8'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  87, 'w'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 106, '*'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 101, '5'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 107, '+'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 103, '7'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  87, 'w'));
		keyPressed(new KeyEvent(frame, -1, -1, 0, 106, '*'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  99, '3'));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  KeyEvent.VK_F9, ' '));
		keyPressed(new KeyEvent(frame, -1, -1, 0,  KeyEvent.VK_ENTER, ' '));
*/		
	}
	public void keyPressed(KeyEvent keyevent) {
/*		System.out.println(keyevent.getKeyCode()+"\t"+keyevent.getKeyChar());  
		String[] result= null;
		try {
			result= calculator.key(KeyCode.getCode(keyevent));
			if (keyevent.getKeyCode()==10) {
				System.out.println(result[1]);
			}
		} catch (EL556Exception el556Exception) {
			if (el556Exception.id==0) {
				result= new String[3];
				result[1]= "chr:"+keyevent.getKeyChar()+" cd:"+keyevent.getKeyCode();
			} else {
				result= el556Exception.getError();
			}
		}
		frame.update(result);*/
	}
	public void keyTyped(KeyEvent keyevent) {}
	public void keyReleased(KeyEvent keyevent) {}			
}


class Stack extends java.util.Stack<Item> {
	private static final long serialVersionUID= 1L;
	private int bracketlevel= 0;
	public void push(BigDecimal operand, Operator operator) {
		switch (operator) {
		case Equ:
			if (operand==null) {
				//push(new Item(BigDecimal.ZERO, bracketlevel, Operator.Equ, true));
			} else {
				push(new Item(operand, bracketlevel, Operator.Equ, true));
			}
			executeLastOperators(0, Operator.Equ);
			break;
		case Add:
		case Sub:
		case Mul:
		case Div:
			if (operand==null) {
				peek().operator= operator;
			} else {
				push(new Item(operand, bracketlevel, operator, false));
			}
			break;
		case Opn:
			if (operand==null) {
				push(new Item(BigDecimal.ONE, bracketlevel+1, Operator.Mul, true));
			} else {
				push(new Item(operand, bracketlevel+1, Operator.Mul, true));
			}
			bracketlevel++;
			break;
		case Cls:
			bracketlevel--;
			if (operand==null) {
				System.out.print("");
			} else {
				push(new Item(operand, bracketlevel+1, Operator.Cls, false));
				executeLastOperators(bracketlevel+1, Operator.Mul);
			}
			break;
		}
		System.out.println(operand+"\t"+bracketlevel+"\t"+operator+"\t"+this);
	}
	
	private void executeLastOperators(int bracketlevel, Operator operator) {
		while (1<size() && (bracketlevel<peek().bracketlevel || bracketlevel==peek().bracketlevel && operator.ordinal()<=peek().operator.ordinal())) {
			Item item= pop();
			peek().execute(item);
		}
	}
}

class Item {
	private static final MathContext mathcontext= new MathContext(18, RoundingMode.HALF_UP);
	public BigDecimal operand;
	public int bracketlevel;
	public Operator operator; //= + - * /
	public boolean implied; // ()
	public Item(BigDecimal reg, int bracketlevel, Operator operator, boolean implied) {
		this.operand= reg;
		this.bracketlevel= bracketlevel;
		this.operator= operator;
		this.implied= implied;
	}
	public void execute(Item item) {
		switch (operator) {
		case Add: operand= operand.add(item.operand, mathcontext); break; 
		case Sub: operand= operand.subtract(item.operand, mathcontext); break;
		case Mul: operand= operand.multiply(item.operand, mathcontext); break;
		case Div: operand= operand.divide(item.operand, mathcontext); break;
		}
		operator= item.operator;
	}
	public String toString() {
		return "["+operand+", " +bracketlevel+ ", " +operator+ ", " +implied+"]";
	}
}