package hu.hl.sharp_el_556g_240802;

import java.nio.ByteBuffer;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.Map.Entry;
import java.util.stream.Stream;

/*
class Reg {
	public static enum Type {Integer, Double, Fraction, Complex}
	private Type type;
	private ByteBuffer b= ByteBuffer.allocate(16);
	public Reg(long value) {
		type= Type.Integer;
		b.putLong(0, value);
	}
	public Reg(double value) {
		type= Type.Double;
		b.putDouble(0, value);
	}
	public Reg(long value0, long value1) {
		type= Type.Fraction;
		b.putLong(0, value0);
		b.putLong(value1);
	}
	public Reg(double value0, double value1) {
		type= Type.Complex;
		b.putDouble(0, value0);
		b.putDouble(value1);
	}
	public void add(Reg reg) {
		switch (type) {
		case Integer:
			b.putLong(0, b.getLong(0)+reg.b.getLong(0));
			break;
		case Fraction:
			long counter0= b.getLong(0);
			long denom0= b.getLong();
			long counter1= reg.b.getLong(0);
			long denom1= reg.b.getLong();
			counter0= counter0*denom1+counter1*denom0;
			denom0*= denom1;
			int lcm= getGCD(counter0, denom0);
			this.counter/= lcm;
			this.denom/= lcm;
			
			b.putLong(0, counter0);
			b.putLong(denom0);
			break;
		}
	}
	public void sub(Reg reg) {
		switch (type) {
		case Integer:
			b.putLong(0, b.getLong(0)-reg.b.getLong(0));
			break;
		}	
	}
	public void mul(Reg reg) {
		switch (type) {
		case Integer:
			b.putLong(0, b.getLong(0)*reg.b.getLong(0));
			break;
		}
	}
	public void div(Reg reg) {
		switch (type) {
		case Integer:
			b.putLong(0, b.getLong(0)/reg.b.getLong(0));
			break;
		}
	}
	public String toString() {
		switch (type) {
		case Integer:
			return String.valueOf(b.getLong(0));
		default:
			return super.toString();
		}
	}
	private int getGCD(int a, int b) {
		a= Math.abs(a);
		b= Math.abs(b);
		if (a<b) {
			return getGCD(b, a);
		} else {
			if (a % b==0) {
				return b;
			} else {
				return getGCD(b, a % b);
			}
		}
	}
	private int getLCM(int a, int b) {
		return Math.floorDiv(a*b, getGCD(a, b));
	}
}

class Reg2 implements Reg {
	private int counter;
	private int denom;
	public Reg2(int counter, int denom) {
		this.counter= counter;
		this.denom= denom;
	}

	public void add(Reg reg) {
	}
	public void sub(Reg reg) {
		Reg2 reg2= (Reg2) reg;
		this.counter= this.counter*reg2.denom-reg2.counter*this.denom;
		this.denom= this.denom*reg2.denom;
		simpl();
	}
	public void mul(Reg reg) {
		Reg2 reg2= (Reg2) reg;
		this.counter*= reg2.counter;
		this.denom*= reg2.denom;
		simpl();
	}
	public void div(Reg reg) {
		Reg2 reg2= (Reg2) reg;
		this.counter*= reg2.denom;
		this.denom*= reg2.counter;
		simpl();
	}
	public String toString() {
		return String.valueOf(counter+"/"+denom);
	}
}
*/

class Reg {
	private double value;
	public Reg(double value) {
		this.value= value;
	}
	public void apply(Operator operator, Reg reg) {
		switch (operator.id) {
		case 1: value+= reg.value; break;
		case 2: value-= reg.value; break;
		case 3: value*= reg.value; break;
		case 4: value/= reg.value; break;
		case 5: value*= Math.sqrt(reg.value); break;
		}
	}
	public String toString() {
//		return "Reg [value=" + value + "]";
		return String.valueOf(value);
	}
}

class Operator {
	public final int bracket;
	public final int id;
	private static final int level[]=  { 0,   0,   0,   1,   1,   1};
	private static final String sym[]= {"", "+", "-", "*", "/", "√"};
	public Operator(int bracket, int id) {
		this.bracket = bracket;
		this.id = id;
	}
	public int level() {
		return level[id];
	}
	public String toString() {
//		return "Operator [bracket=" + bracket + ", level=" + level + ", id=" + id + "]";
		return sym[id];
	}
}

class Alu0 {
	private Stack<Reg> regs= new Stack<Reg>();
	private Stack<Operator> operators= new Stack<Operator>();
	public void put(Reg value) {
		if (operators.isEmpty()) {
			reset();
		}
		regs.push(value);
	}
	public void reset() {
		regs.clear();
		regs.add(new Reg(0));
		operators.clear();
	}
	public void put(Operator operator) {
		if (regs.toString().equals("[4.0, -15.0]")) {
			System.out.print("");
		}
		while (!operators.isEmpty() && operator.bracket<=operators.peek().bracket && operator.level()<=operators.peek().level()) {
			Reg reg= regs.pop();
			regs.peek().apply(operators.pop(), reg);
		}
		if (0<(operator.id)) {
			operators.push(operator);
		}
	}
	public String toString() {
		return regs.peek().toString();
//		return "Calc0 [values=" + values + ", operators=" + operators + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		Alu0 alu= new Alu0();
		
		alu.put(new Reg(  8)); alu.put(new Operator(0, 4)); // 8/  
		alu.put(new Reg(  2)); alu.put(new Operator(0, 3)); // 2*
		alu.put(new Reg(-15)); alu.put(new Operator(0, 4)); // -15/
//		calc.put(   1d); calc.put(4 |  8); System.out.println(calc); // 1*(
//		calc.put(   1d); calc.put(4 | 16); System.out.println(calc); // 1*(
		alu.put(new Reg(  5)); alu.put(new Operator(2, 2));  // 5-
		alu.put(new Reg(  8)); alu.put(new Operator(2, 0)); System.out.println(alu); // 8)
	                           alu.put(new Operator(1, 2));  // -
		alu.put(new Reg(  7)); alu.put(new Operator(1, 0)); System.out.println(alu); // 7)
	                           alu.put(new Operator(0, 1));  // +
		alu.put(new Reg(  9)); alu.put(new Operator(0, 1));  // 9+
		alu.put(new Reg(  6)); alu.put(new Operator(0, 3));  // 6*
		alu.put(new Reg(  3)); alu.put(new Operator(0, 0)); System.out.println(alu); // 3=
		
		alu.put(new Reg(  1)); alu.put(new Operator(0, 1)); // 1+  
		alu.put(new Reg(  2)); alu.put(new Operator(0, 3)); // 2*  
		alu.put(new Reg(  3)); alu.put(new Operator(1, 1)); // (3+  
		alu.put(new Reg(  4)); alu.put(new Operator(1, 3)); // 4*  
		alu.put(new Reg(  5)); alu.put(new Operator(2, 2)); // (5-  
		alu.put(new Reg(  6)); alu.put(new Operator(2, 0)); System.out.println(alu); // 6)  
		                       alu.put(new Operator(1, 3));  // *  
   		alu.put(new Reg(  7)); alu.put(new Operator(2, 2)); // (7-  
		alu.put(new Reg(  8)); alu.put(new Operator(2, 0)); System.out.println(alu); // 8)  
		                       alu.put(new Operator(1, 0)); System.out.println(alu); // )  
		                       alu.put(new Operator(0, 0)); System.out.println(alu); // =  
		
   		alu.put(new Reg(  1)); alu.put(new Operator(0, 4));  // 1/  
   		alu.put(new Reg(  3)); alu.put(new Operator(0, 3));  // 3*  
   		alu.put(new Reg(  3)); alu.put(new Operator(0, 0)); System.out.println(alu); // 3=
   		
   		alu.put(new Reg( 13)); alu.put(new Operator(1, 2));  // (13-  
   		alu.put(new Reg( 17)); alu.put(new Operator(1, 0)); System.out.println(alu); // 17)
   		                       alu.put(new Operator(0, 2));  // -
 		alu.put(new Reg( 19)); alu.put(new Operator(1, 2));  // (19-  
   		alu.put(new Reg( 29)); alu.put(new Operator(1, 0)); System.out.println(alu); // 29)
   		                       alu.put(new Operator(0, 0)); System.out.println(alu); //=
   		
   		alu.put(new Reg( 23)); alu.put(new Operator(0, 1));  // 23+
        alu.put(new Reg(  7)); alu.put(new Operator(0, 3));  // 7*
   		alu.put(new Reg(  1)); alu.put(new Operator(0, 5)); alu.put(new Reg(804)); // 1√(804+37)  
                               alu.put(new Operator(1, 1));
        alu.put(new Reg( 37)); alu.put(new Operator(1, 0)); System.out.println(alu);
                               alu.put(new Operator(0, 0)); System.out.println(alu); //=
                               
        alu.put(new Reg(  2)); alu.put(new Operator(0, 3));  // 2*(                               
        alu.put(new Reg(  3)); alu.put(new Operator(1, 3));  // 3*(
        alu.put(new Reg(  5)); alu.put(new Operator(2, 3));  // 5*(
        alu.put(new Reg(  7)); alu.put(new Operator(3, 3));  // 7*
        alu.put(new Reg( 11)); alu.put(new Operator(3, 0)); System.out.println(alu); // 11)
                               alu.put(new Operator(2, 0)); System.out.println(alu); //)
                               alu.put(new Operator(1, 0)); System.out.println(alu); //)
                               alu.put(new Operator(0, 0)); System.out.println(alu); //=
        
/*   		
   		alu.put(1, 8); alu.put(3     );  
   		alu.put(1, 5); alu.put(2 |  8);
   		alu.put(1, 9); alu.put(0     ); System.out.println(alu);
		
/*		
		Vector<User> users= new Vector<User>();
		users.add(new User("gergej2", 8.3));
		users.add(new User("gergej6", 53.6));
		users.add(new User("gergej1", 92.9));
		users.add(new User("gergej4", 64.6));
		users.add(new User("gergej3", 18.1));
		users.add(new User("gergej5", 46.4));
		
//		users.sort((a, b) -> a.name.compareTo(b.name));
//		users.sort((a, b) -> Double.compare(a.age, b.age));
		
	
		
/*		
		Vector<Double> v = new Vector<Double>();
		users.stream().forEach(System.out::println);
		users.stream().map(u -> ++u.age/users.size()).collect(() -> v, (a, b) -> a.add(b), (a, b) -> a.addAll(b));
		users.stream().map(u -> ++u.age/users.size()).collect(() -> v, (a, b) -> a.add(b), (a, b) -> a.addAll(b));
		v.stream().forEach(System.out::println);
//		double atlag= w.stream().reduce((a, b) -> a+b).get(); System.out.println(atlag);

		out.accept(users.stream().collect(() -> new StringBuilder(), (a, b) -> a.append(b.name), (a, b) -> a.append(b)).toString());
		
		


/*
		TreeMap<Integer, String> tm0= new TreeMap<Integer, String>();
		tm0.put(0, "dulla");
		tm0.put(1, "edj");
		tm0.put(2, "káttő");
		tm0.put(3, "hrom");
		tm0.put(4, "nedj");
		
//		tm0.forEach(Main::biconsumer1); System.out.println();
		
		TreeMap<Integer, String> tm1= tm0.entrySet().stream().collect(
			() -> new TreeMap<Integer, String>(),
			(a, b) -> {a.put(b.getKey(), b.getValue());},
			(c ,d) -> {}
		);
		TreeMap<Integer, String> tm1= tm0.entrySet().stream()
		.filter(Main::predicate1)
		.collect(
			Main::supplier,
			Main::biconsumer2,
			(c ,d) -> {}
		);


		Function<Entry<Integer, String>, Integer> fn= e -> e.getKey()*e.getKey();
		Stream<Integer> tm1= tm0.entrySet().stream().map(fn);
		Vector<Integer> v0= tm1.collect(() -> new Vector<Integer>(), (v, i) -> v.add(i), (v, i) -> v.addAll(i));
//		System.out.println(v0);
		
//		Vector<Integer> v1= tm0.entrySet().stream().map(e -> e.getKey()*e.getKey()).collect(() -> new Vector<Integer>(), (v, i) -> v.add(i), (v, i) -> v.addAll(i));
		Vector<Integer> v1= tm0.entrySet().stream().collect(() -> {
			out.accept("mocht 1");
			return new Vector<Integer>();
		}, (v, i) -> v.add(i.getKey()*i.getKey()), (v, i) -> v.addAll(i));
		
		StringBuilder i= tm0.entrySet().stream().map(e -> e.getKey()*e.getKey()).collect(() -> {
			out.accept("mocht 2");
			return new StringBuilder();
		}, (v, i0) -> {
			out.accept(v);
			v.append(i0);
		}, (v, i0) -> {
			out.accept(v);
			v.append(i0);
		});
		
		
		Vector<Integer> w= tm0.entrySet().stream().map(e -> e.getKey()).collect(() -> new Vector<Integer>(), (a, b) -> a.add(b), (a, b) -> a.addAll(b));
		out.accept(w);
		w.sort((a, b) -> Integer.compare(b, a));
		out.accept(w);
		
//		out.accept(i);
		
//		tm0.entrySet().forEach((e) -> v0.add(e.getKey()));
		
//		tm1.forEach(System.out::println);
		
		Supplier<TreeMap<Integer, String>> supplier= () -> new TreeMap<Integer, String>();
		BiConsumer<TreeMap<Integer, String>, Entry<Integer, String>> accumulator= (a, b) -> a.put(b.getKey(), b.getValue());
		BiConsumer<TreeMap<Integer, String>, TreeMap<Integer, String>> combiner= (a, b) -> a.putAll(b);
		tm0.entrySet().stream().collect(supplier, accumulator, combiner);
		
		
	}
	public static void biconsumer1(Integer i, String v) {
		System.out.println(i+", "+v);
	}
	public static boolean predicate1(Entry<Integer, String> e) {
		return (e.getKey() % 2)==0;
	}
	public static TreeMap<Integer, String> supplier() {
		return new TreeMap<Integer, String>();
	}
	public static void biconsumer2(TreeMap<Integer, String> a, Entry<Integer, String> e) {
		a.put(e.getKey(), e.getValue());
	}
	public static boolean predicate2(Entry<Integer, String> e) {
		return e.getKey()<2;
*/
	}
	
}
/*
class User  {
	public final String name;
	public double age;
	public User(String name, double age) {
		this.name= name;
		this.age= age;
	}
	public String toString() {
		return this.name+"("+this.age+")";
	}
}
*/