package collection.org;

import java.util.*;

public class Vect_or {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector(5);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		for (int i = 0; i < 8; i++) {
			int a = sc.nextInt();
			v.add(a);

		}
		System.out.println(v.capacity());
		for (int i = 0; i < 4; i++) {
			System.out.println(v.get(i));
		}

	}
}
