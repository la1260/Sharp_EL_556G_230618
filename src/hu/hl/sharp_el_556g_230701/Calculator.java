package hu.hl.sharp_el_556g_230701;

import java.math.BigDecimal;

public class Calculator implements InputListener, StackListener {
	private final CalculatorListener calculatorlistener;
	private Input input;
	public Stack stack= new Stack(this);
	public Calculator(CalculatorListener calculatorlistener) {
		this.calculatorlistener= calculatorlistener;
		reset();
	}
	private BigDecimal result;
	private void reset() {
		result= null;
		stack.reset();
		if (input!=null) input.reset();
	}
	public void key(int keycode) {
		if (-1<keycode)	{
			if (keycode<21) {
				if (keycode==16) {
					reset();
				} else {
					if (input==null) input= new Input(this);
					input.key(keycode);
				}
			} else {
				if (input!=null) {
					result= stack.push(input.getValue(), keycode);
				} else if (result!=null && keycode!=26) {
					result= stack.push(result, keycode);
				} else {
					result= stack.push(null, keycode);
				}
				input= null;
			}
			System.out.println(stack.stack0);
			System.out.println(stack.stack1);
		}
	}
	public void update(String s0, String s1, String s2) {
		calculatorlistener.onChange(s0, s1, s2);
	}
}

interface CalculatorListener {
	public void onChange(String s0, String s1, String s2);
}