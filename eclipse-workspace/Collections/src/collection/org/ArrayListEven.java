package collection.org;

import java.util.*;

/*Q1. Given an integer array, convert it into an ArrayList. Remove all even numbers and print the updated list.
What you practice:
Converting array → ArrayList using loops / Arrays.asList
Removing elements while iterating
Understanding wrapper Integer
*/
public class ArrayListEven {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int arr[] = { 10, 20, 5, 7, 2, 90 };
		ArrayList List = new ArrayList();

		/*
		 * Using Arrays.asList() (Most Common) 🔹 For Wrapper Class Arrays (Integer,
		 * String, Double, etc.)
		 */

		// ArrayList List=new ArrayList(Arrays.asList(arr));

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 != 0) {
				List.add(arr[j]);
			}

		}

		// Using Collections.addAll() (Good for Primitive Wrapper Use)
		// Collections.addAll(List, arr);
		for (int i = 0; i < List.size(); i++) {

			System.out.println(List.get(i));

		}

		// using for each loop
		// this is a raw ArrayList so java don't no the datatype of the Array
		// This has no data type, so Java doesn’t know what i really is.
		/*
		 * for(Object i:List) { System.out.println((int)i); }
		 */

	}

}
