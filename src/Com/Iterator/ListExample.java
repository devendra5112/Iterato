package Com.Iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
	public static void main(String[] args) {

		List<Integer> linked = new LinkedList<Integer>();

		linked.add(11);
		linked.add(12);
		linked.add(13);
		linked.add(14);
		linked.add(15);
		linked.add(16);

		System.out.println("************* hashNext**********");

		ListIterator<Integer> itr = linked.listIterator(linked.size());

		while (itr.hasPrevious()) {
			int i = itr.previous();

			System.out.println(i);

		}
		System.out.println("*********** remove **************");

		while (itr.hasNext()) {
			if (itr.next() == 15) {
				itr.remove();

			}
		}
		System.out.println(linked);

		System.out.println("*************************  set() last**************");

		itr.set(19);
		System.out.println(linked);

		System.out.println("*************Add*****************");

		if (itr.hasNext()) {
			itr.next();
		}
		itr.add(20);
		System.out.println(linked);

		while (itr.hasNext()) {
			if (itr.next() == 5) {
				int i = itr.previous();
				itr.previousIndex();
			}
		}
	}
}