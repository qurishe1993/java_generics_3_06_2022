package java_generics_example_part_1;

import java.util.*;
/*
 * ---------------------------------------------------------
 * -----------Generics Method and Wild cards-----------------
 * wildcard symbol and character  is "?" 
 * "extends" is keyword.
 * ---------------------------------------------------------
 * 1. this is Method Bounded type example by using wildcard/upper bound
 * 
 */

public class Example_10 {

	public static double Sum(ArrayList<? extends Number> num) {
		double sum = 0.0;
		for (Number number : num) {
			sum = sum + number.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayList<Integer> t1 = new ArrayList<Integer>();
		t1.add(10);
		t1.add(20);
		System.out.println("The sum is = " + Sum(t1));

		ArrayList<Double> t2 = new ArrayList<Double>();
		t2.add(30.78);
		t2.add(25.89);
		System.out.println("The sum is = " + Sum(t2));
	}
}
