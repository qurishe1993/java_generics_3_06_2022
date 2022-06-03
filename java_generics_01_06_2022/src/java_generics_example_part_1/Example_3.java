package java_generics_example_part_1;

import java.util.*;

/*
 * ----this example is a collection type array but
 * in here is a simple difference which is:- 
 * 1. After Array List we can declare a data type
 * 2. we declare data type then it will be a collection of 
 * generics.
 * 3. we can add only 'String' type value only.
 * 4. it is not fixed size
 * 5. it provides type safety
 * 6. type casting is not mandatory
 * 7. it detect an error at compile time.
 */
public class Example_3 {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("hello");
		l.add("java");
		l.add("programming");

		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		
		System.out.println("------------------------------");
		
		String n1 = l.get(0);// type casting not use here
		String n2 = (String) l.get(0);// type casting use here

		System.out.println("without type casting output :" + n1);
		System.out.println("with type casting output :" + n2);
	}
}
