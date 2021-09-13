package financialMaths;
import java.util.Scanner;

public class Scan {
	private final static Scanner sc = new Scanner(System.in);
	
	protected final static double nextDouble(String text) {
		System.out.println(text);
		return sc.nextDouble();
	}
	
	protected final static String next() {
		return sc.next();
	}
	
	protected final static char nextChar(String text) {
		System.out.println(text);
		return sc.next().trim().charAt(0);
	}
}
