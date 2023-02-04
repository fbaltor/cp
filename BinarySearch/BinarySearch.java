import java.io.IOException;
import java.util.*;

public class BinarySearch {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNextLine()) {
			String line = in.nextLine();

			Scanner listScanner = new Scanner(line);

			int n;
			
			if (listScanner.hasNextInt()) n = listScanner.nextInt();
			else return;
			
			List<Integer> numbers = new ArrayList<>();
			while(listScanner.hasNextInt()) 
				numbers.add(listScanner.nextInt());

			binarySearch(numbers, n);

			listScanner.close();
		}

		in.close();
	}

	private static void binarySearch(List<Integer> numbers, int n) {
		int i = 0, j = numbers.size() - 1;
		int m = (i + j)/2;

		int comparison = 0;
		while (i <= j) {
			if (n == numbers.get(m)) {
				System.out.println(m);
				System.out.println("Comparisons: " + comparison);
			}
			else if (n < numbers.get(m)) j = m - 1; 
			else i = m + 1;

			m = (i + j)/2;
			comparison++;
		}

		System.out.println(-1);
		System.out.println("Comparisons: " + comparison);
	}
}
