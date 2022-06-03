package java_generics_example_part_1;

import java.util.*;

/*
 * 1. This example is a collection type array
 * 2. it is not provides type safety
 * any type of value we can add in a collection type array
 * 3. it is not fixed size
 * 4. type casting is mandatory 
 * 5. some few moment compile time do not show any error 
 * but runtime show in error 
 */
public class Example_2 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		// normal collection array
		l.add("hello");
		l.add("java");
		l.add(10);

		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));

		System.out.println("---------we do type casting here----------");
		String n1 = (String) l.get(0);
		String n2 = (String) l.get(1);
		// String n3=(String)l.get(3);//here not show compile time error.

		System.out.println(n1);
		System.out.println(n2);
		// System.out.println(n3);

	}
}
