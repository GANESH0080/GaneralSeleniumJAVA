import java.util.ArrayList;
import java.util.Iterator;

public class HasNextTwo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ganesh");
		list.add("Salunkhe");

		Iterator test = list.iterator();
		while (test.hasNext()) {
			System.out.println(test.next());
			System.out.println(test.hasNext());

		}

	}

}