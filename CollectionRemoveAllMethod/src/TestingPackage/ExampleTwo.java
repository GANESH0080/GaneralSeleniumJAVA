package TestingPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleTwo {
	public static void ExampletwoMethod() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Shree");
		list.add("Om");
		list.add("Salunkhe");
		list.remove(2);
		// list.removeAll(list);
		Iterator itr = list.iterator();
		for (String e : list) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {
		ExampletwoMethod();
		ArrayList<String> listed = new ArrayList<String>();
		listed.add("Mahadev");
		listed.add("Salunkhe");

		Iterator itrt = listed.iterator();
		while (itrt.hasNext()) {
			System.out.println(itrt.hasNext());
			String str = (String) itrt.next();
			System.out.println(itrt.next());
			if (str.equals("Salunkhe")) {
				itrt.remove();
			}
		}
	}
}