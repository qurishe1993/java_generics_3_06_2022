package java_generics_example_part_1;

/*
 * java 1.4v a non-generic array list declared
 * --------------------------------------------------
 * 1. in java 1.4v we can add any type value by using create'Object'.
 * 2. and also use object 'getter' and 'setter' method.
 * 3. then we must be create different class object
 */
public class Example_4 {
	Object o;

	public Object getO() {
		return o;
	}

	public void setO(Object o) {
		this.o = o;
	}

	public static void main(String[] args) {
		Example_4 str_value = new Example_4();
		str_value.setO("hello");

		Example_4 int_value = new Example_4();
		int_value.setO(10);

		System.out.println("string type value is = " + str_value.getO());
		System.out.println("int type value is = " + int_value.getO());
	}
}
