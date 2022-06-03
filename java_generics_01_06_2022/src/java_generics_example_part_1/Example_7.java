package java_generics_example_part_1;
/*
 * we can bound the type parameter for particular range 
 * by using extends keyword such as a type of called "bounded types".
 * bounded will be a class or interface.
 * ----------------------------------------------------------------
 * 1. this class is a bounded type generic class. if we not use extends
 * then it will be a unbounded generic class.we can pass any type of value.
 * 2. this is a bounded type generic class then we can pass value of either
 * class or child class.
 * 3. here 'Number' class we use so, we can add number value and child class value
 * such as : Number child class is byte, short , int , double, long
 * 4. in case we want to add string type value then we will get compile time error
 * 5. it is same to interface
 * 
 */

public class Example_7<T extends Number> {
	T Obj;

	public T getObj() {
		return Obj;
	}

	public void setObj(T obj) {
		Obj = obj;
	}

	public static void main(String[] args) {
		Example_7<Number> number_value = new Example_7<Number>();
		number_value.setObj(17);
		System.out.println("Number Value is : " + number_value.getObj());

		Example_7<Integer> int_value = new Example_7<Integer>();
		int_value.setObj(10);
		System.out.println("Integer Value is : " + int_value.getObj());

		Example_7<Double> double_value = new Example_7<Double>();
		double_value.setObj(10.78);
		System.out.println("Double Value is : " + double_value.getObj());

		/*
		 * Example_7<String> string_value = new Example_7<String>();
		 * string_value.setObj("hello"); System.out.println("String Value is : " +
		 * string_value.getObj());
		 */
	}
}
