package java_generics_example_part_1;

/*
 * 1. a array is a fixed size.
 * 2. array provides type safety
 * 3. type casting is not mandatory
 * 4. if declare as a data type 'String' then
 * we will insert only String type value.
 * 5. by mistake we can add other type value then
 * we will get compile time error.
 * 6. if we want to add 's[3]=10' then
 * firstly, show array size limit exceed
 * secondly, add only 'string' type value can not
 * add 'int' type value.
 */
public class Example_1 {

	public static void main(String[] args) {
		String[] s = new String[3];
		s[0] = "ABC";
		s[1] = "DEF";
		s[2] = "GHI";
		// s[3] = 10;

		for (int i = 0; i < s.length; i++) {
			System.out.println("Array " + i + " Index Value is=" + s[i]);
		}
		System.out.println("-------------------------------");

		System.out.println("Without Type Casting Output");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);

		System.out.println("-------------------------------");

		System.out.println("With Type Casting Output");
		String n1 = (String) s[0];
		String n2 = (String) s[1];
		String n3 = (String) s[2];

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}
}
