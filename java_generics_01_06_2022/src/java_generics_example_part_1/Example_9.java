package java_generics_example_part_1;

/*
 * THIS is unbounded type generics class 
 */
public class Example_9<T> {

	public static void main(String[] args) {
		Example_9<Integer> t1 = new Example_9<Integer>();
		Example_9<Double> t2 = new Example_9<Double>();
		Example_9<String> t3 = new Example_9<String>();
		Example_9<Runnable> t4 = new Example_9<Runnable>();
		Example_9<Thread> t5 = new Example_9<Thread>();
		Example_9<Number> t6 = new Example_9<Number>();
	}
}


