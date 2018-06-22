package collections;

import java.util.*;
import java.lang.*;

public class question1 {
	public static void main(String args[]) {
		Set s = new TreeSet();
		Set s1 = new TreeSet();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		ListIterator<Integer> itr = (ListIterator) s.iterator();
		ListIterator<Integer> itr1 = (ListIterator) s1.iterator();
		while (itr.hasNext() && itr1.hasNext()) {
			if (itr.next() < itr1.next()) {
				itr.remove();
			} else if (itr.next() == itr1.next()) {
				continue;

			} else
				itr1.remove();

		}
		while (itr != null) {
			itr.remove();
		}
		System.out.println(s);
	}
}
