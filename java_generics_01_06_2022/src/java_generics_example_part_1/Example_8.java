package java_generics_example_part_1;
/* this example is bounded type interface
 * -----------------------------------------------
 * 1. As a type parameter , at a same time,we can access class or interface.
 *    also we can add one more interface class.but 
 *    class name will be firstly then after interface name. 
 * 2. Never can not use one or more class at a time.
 * ---------------------------------------------------------------------
 * public class Test<T extends Number & Runnable>{
 * 	//this is valid number is class and Runnable is interface
 * }
 * ----------------------------------------------------------------------
 * this example will be a unbounded types if we use only type parameter 'T'.
 * AND remove extends keyword.
 */
class ExampleInterface<T extends Runnable>{
	
}
public class Example_8 {

	public static void main(String[] args) {
		ExampleInterface<Runnable> r1=new ExampleInterface<Runnable>();
		System.out.println(r1.getClass());
		
		ExampleInterface<Thread> r2=new ExampleInterface<Thread>();
		System.out.println(r2.getClass());
	}
}
