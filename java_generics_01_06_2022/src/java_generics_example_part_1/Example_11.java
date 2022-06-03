package java_generics_example_part_1;

import java.util.*;
/*
 * 1. Here it is a lower bound wildcard example. 
      From this example we learn, if we use “super” keyword
      Then we add value either that class or parent class value.
  ------------------------------------------------------------------
 * 2. Such as this example , we add only integer value and that 
      parent class value. By mistake we can add any other value then 
      we will get compile time error.
 */

public class Example_11 {

	public static void display(List<? super Integer> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}

	public static void main(String[] args) {
		List<Integer> i1 = Arrays.asList(12, 13, 34, 56);
		System.out.println("Lower Bound Integer Value : ");
		display(i1);

		List<Number> n1 = Arrays.asList(12.78, 13.89, 34.34, 56.01);
		System.out.println("Lower Bound Number Value : ");
		display(n1);
	}
}
