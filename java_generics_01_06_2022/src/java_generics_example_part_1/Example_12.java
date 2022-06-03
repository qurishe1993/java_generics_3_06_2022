package java_generics_example_part_1;

import java.util.*;

public class Example_12 {

	public static void methodOne(ArrayList l) {
		/*--this area is a non generic area
		* we can add any type value
		--*/
		l.add(10);// valid
		l.add("Java");// valid
	}

	public static void main(String[] args) {
		/*--this area is a generic area
		* we can add only string type value
		--*/
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Hello");// valid
      //l.add(10);//not valid.it is integer type
		methodOne(l1);// in non generic area we add generic area value
		System.out.println(l1);
//l.add(34);//not valid
	}
}
