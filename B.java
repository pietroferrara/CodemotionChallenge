import java.io.PrintStream;
import java.util.Calendar;

public class B extends A {
	private final PrintStream out = System.out;
	private final String key;

	public B(String key) {
		this.key = key;
	}

	@Override
	public boolean equals(Object obj) {
		// objects of class B are considered equals
		// if and only if they have keys of the same length
		String k1 = key, k2 = ((B) obj).key;
		if (k1 == null && k2 == null)
			return true;
		else
			return k1.length() == k2.length();
	}

	@Override
	protected void verifyCreationCondition() {
		Calendar cal = Calendar.getInstance();
		if (cal.get(Calendar.DAY_OF_MONTH) == 17 && cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY)
			out.println("Never run this program on Friday 17th");
	}

	public void printTable(double start, double end, double step) {
		for (double d = start; d != end; d += step)
			System.out.printf("%.15f\n", d);
	}
}