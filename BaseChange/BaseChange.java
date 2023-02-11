import java.io.IOException;
import java.util.*;

public class BaseChange {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		while (in.hasNextLine()) {
			int n = in.nextInt();
			baseChangeToBinary2(n);
		}

	//	while (in.hasNextLine()) {
	//		int base1 = in.nextInt();
	//		String number1 = in.next();

	//		int base2 = in.nextInt();
	//		String number2 = in.next();
	//	}
	}

	private static void baseChange() {}

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
