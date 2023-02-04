import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RoundedPi {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;

		try {
			in = new BufferedReader(new InputStreamReader(System.in));

			String line;
			while ((line = in.readLine()) != null) {
				int n = Integer.parseInt(line);

				if (n > 15) System.out.println("The value of \'n\' must be less than 16");
				else if (n == 0) System.out.println(3);
				else {
					String pi = String.valueOf(Math.PI);
					System.out.println(pi.substring(0, n + 2));
				}
			}
		} finally {
			if (in != null) in.close();
		}
	}
}
