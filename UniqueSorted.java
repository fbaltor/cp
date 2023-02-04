import java.io.IOException;
import java.util.*;

public class UniqueSorted {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		while (in.hasNextLine()) {
			String line = in.nextLine(); 

			Scanner listScanner = new Scanner(line);

			List<Integer> numbers = new ArrayList<>();
			while (listScanner.hasNextInt())
				numbers.add(listScanner.nextInt());

			System.out.println(sortUnique(numbers));

			listScanner.close();
		}

		in.close();
	}

	private static List<Integer> sortUnique(List<Integer> numbers) {
		List<Integer> unique = new ArrayList<>();

		Map<Integer, Integer> map = new HashMap<>();

		for (Integer number : numbers) {
			if (!map.containsKey(number))
				map.put(number, 1);
			else
				map.put(number, map.get(number) + 1);
		}

		for (Integer number: numbers)
			if (map.get(number) == 1) unique.add(number);

		Collections.sort(unique);

		return unique;
	}
}
