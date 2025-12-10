package collection.org;

import java.util.*;

/*Take an ArrayList of integers, convert it to a Vector, then sort the Vector in ascending order manually (without using Collections.sort).
What you practice:
ArrayList → Vector conversion
Manual sorting (bubble sort / selection sort)
Vector methods like add(), get(), set()
*/
public class SortAnArrayListInVector {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList ans = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			int q = sc.nextInt();
			ans.add(q);

		}
		Vector v = new Vector(ans);
		for (int i = 0; i < v.size() - 1; i++) {
			for (int j = i + 1; j < v.size(); j++) {
				int first = (int) v.get(i);
				int second = (int) v.get(j);
				if (second < first) {

				}

			}
		}
		// print the vector
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
	}
}
