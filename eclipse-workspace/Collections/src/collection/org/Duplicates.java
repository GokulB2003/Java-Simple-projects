package collection.org;

import java.util.*;
/*Q2. Create two ArrayLists containing integers. Merge them into a new ArrayList but avoid adding repeated numbers.
What you practice:
Merging lists
Checking for duplicates (contains)
Building logical flow to avoid sets
*/

public class Duplicates {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList first = new ArrayList();
		ArrayList second = new ArrayList();
		ArrayList third = new ArrayList();
		first.add(10);
		first.add(10);
		first.add(30);
		first.add(50);
		first.add(90);

		second.add(40);
		second.add(89);
		second.add(20);

		for (int i = 0; i < first.size(); i++) {
			int p = (int) first.get(i);
			if (!third.contains(p)) {
				third.add(p);
			}
		}
		for (int j = 0; j < second.size(); j++) {
			int q = (int) second.get(j);
			if (!third.contains(q)) {
				third.add(q);

			}
		}

		// printing
		for (int i = 0; i < third.size(); i++) {
			System.out.println(third.get(i));
		}

	}
}
