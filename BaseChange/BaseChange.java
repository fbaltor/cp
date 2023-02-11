import java.io.IOException;
import java.util.*;

public class BaseChange {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		// while (in.hasNextLine()) {
		// 	int n = in.nextInt();
		// 	baseChangeToBinary2(n);
		// }

		while (in.hasNextLine()) {
			int fromBase = in.nextInt();
			int toBase = in.nextInt();
			String number = in.next();

			System.out.println(baseChange(fromBase, toBase, number));
		}
	}

	private static String decimalToBase(int decimal) {
		if (decimal < 10) return Integer.toString(decimal);

		int algorism = ((int) 'A') + (decimal - 10);

		return Character.toString((char) algorism);
	}

	private static int baseToDecimal(char base) {
		int ascii = (int) base;

		if (48 <= ascii && ascii <= 57) return ascii - 48;

		return ascii - ((int) 'A') + 10;
	}

	private static String baseChange(int fromBase, int toBase, String number) {
		int decimal = 0;
		for (int i = number.length() - 1; -1 < i; i--) {
			int baseMultiplier = (int) Math.pow(fromBase, number.length() - i - 1);
			decimal += baseToDecimal(number.charAt(i)) * baseMultiplier;
		}

		String base = "";

		int q = decimal;
		int r;

		do {
			r = q % toBase;
			q = q / toBase;

			base = decimalToBase(r) + base;

		} while (q > toBase);

		if (q != 0) base = decimalToBase(q) + base;

		return base;
	}

	private static void baseChangeToBinary(int baseTen) {
		String binary = "";

		int q = baseTen;
		int r; 

		do {
			r = q % 2;
			q = q / 2;

			binary = Integer.toString(r) + binary;
		} while (q > 1);

		if (q == 1) binary = Integer.toString(q) + binary;

		System.out.println(binary);
	}

	private static void baseChangeToBinary2(int baseTen) { baseChangeToBinary2("", baseTen); }
	private static void baseChangeToBinary2(String binary, int baseTen) {
		if (baseTen == 1) System.out.println("1" + binary);
		else baseChangeToBinary2(Integer.toString(baseTen % 2) + binary, baseTen / 2);
	}
}
