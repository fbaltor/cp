import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadFormat {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;

		try {
			in = new BufferedReader(new InputStreamReader(System.in));

			String doubleEntry;
			while ((doubleEntry = in.readLine()) != null) {
				Double d = Double.parseDouble(doubleEntry);
				System.out.format("%7.3f%n", d);
			}
		} finally {
			if (in != null) {
				in.close();
			}
		}
	}
}
