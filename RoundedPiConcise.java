import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RoundedPiConcise {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;

		in = new BufferedReader(new InputStreamReader(System.in));

		String n;
		while ((n = in.readLine()) != null) {
			System.out.format("%-15." + n + "f%n", Math.PI);
		}
	}
}
