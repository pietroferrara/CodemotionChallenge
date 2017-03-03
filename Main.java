import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		B b1 = new B("hello");
		B b2 = new B("hallo");
		B b3 = new B(null);
		
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.print("Insert choice [table,set,comparison]: ");
			String choice = keyboard.next();

			switch (choice) {
			case "table": b1.printTable(0.0, 1.0, 0.01); break;
			case "set":
				Set<B> set = new HashSet<>();
				set.add(b1);
				set.add(b2); // b1 and b2 are equals()
				set.add(b3);
				System.out.println("set.size() = " + set.size());
				break;
			case "comparison":
				System.out.println("b1 vs b2: " + b1.equals(b2));
				System.out.println("b1 vs b3: " + b1.equals(b3));
				System.out.println("b2 vs b3: " + b2.equals(b3));
				break;
			}
		}
	}
}
