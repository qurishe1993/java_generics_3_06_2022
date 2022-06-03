package java_generics_example_part_1;

/*
 * java 1.5v a generic array list declared
 * ----------------------------------------------
 * 1. if want to declare generic class then after class name
 * must be declared '<T>' THEN that class will be generic class
 * 2. we can add any type value by using generic class 
 * object. also we use getter and setter method.
 * 3. T means type parameter And any type value.
 * 4. WHEN we create class object then with declare type parameter
 * 5. it provides type safety
 */
public class Example_5<T> {
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public static void main(String[] args) {
		Example_5<String> str_value = new Example_5<String>();
		str_value.setObj("hello");

		Example_5<Integer> int_value = new Example_5<Integer>();
		int_value.setObj(10);

		System.out.println("string type value is = " + str_value.getObj());
		System.out.println("int type value is = " + int_value.getObj());
	}
}
