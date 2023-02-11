import java.io.IOException;
import java.util.*;

public class Combinatorics {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		while (in.hasNextLine()) {
			int k;
			if (in.hasNextInt()) {
				k = in.nextInt();
				String word  = in.next();

				combinationsK(k, word);
			}
		}
	}

	private static void permutations(String str) { permutations("", str); }
	private static void permutations(String prefix, String str) {
		int n = str.length();
		if (n == 0) System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				permutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		}
	}

	private static void permutationsK(int k, String str) { permutationsK(k, "", str); }
	private static void permutationsK(int k, String prefix, String str) {
		int nPrefix = prefix.length();
		int n = str.length();
		if (nPrefix == k) System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				permutationsK(k, prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		}
	}

	private static void combinations(String str) { combinations("", str); }
	private static void combinations(String prefix, String str) {
		int n = str.length();
		System.out.println(prefix);
		for (int i = 0; i < n; i++) {
			combinations(prefix + str.charAt(i), str.substring(i + 1, n));
		}
	}

	private static void combinationsK(int k, String str) { combinationsK(k, "", str); }
	private static void combinationsK(int k, String prefix, String str) {
		int n = str.length();

		if (prefix.length() == k) System.out.println(prefix);
		for (int i = 0; i < n; i++) {
			combinationsK(k, prefix + str.charAt(i), str.substring(i + 1, n));
		}
	}

}
