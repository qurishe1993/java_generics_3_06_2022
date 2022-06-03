package java_generics_example_part_1;

/*
 * based on our requirement we can create our own generic classes also
 * --------------------------------------------------------------------
 */
class OwnGenericClass<T> {
	T Obj;

	public T getObj() {
		return Obj;
	}

	public void setObj(T obj) {
		Obj = obj;
	}

	public void show() {
		System.out.println("The Type of Object is : " + Obj.getClass().getName());
	}
}

public class Example_6 {
	public static void main(String[] args) {

		OwnGenericClass<String> str_value = new OwnGenericClass<String>();
		str_value.setObj("hello");
		str_value.getObj();
		str_value.show();
		System.out.println(str_value.getObj());

		OwnGenericClass<Integer> int_value = new OwnGenericClass<Integer>();
		int_value.setObj(10);
		int_value.getObj();
		int_value.show();
		System.out.println(int_value.getObj());

		OwnGenericClass<Double> double_value = new OwnGenericClass<Double>();
		double_value.setObj(10.67);
		double_value.getObj();
		double_value.show();
		System.out.println(double_value.getObj());
	}
}
