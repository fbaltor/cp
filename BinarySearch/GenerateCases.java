import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateCases {
	public static void main(String[] args) throws IOException {
		String outputFile = "test.in";
		int count = 1000000;

		List<Integer> list1 = generateList(1, count);

		FileWriter writer = null;

		try {
			writer = new FileWriter(outputFile);

			writer.write("-10 ");
			for (int element : list1)
				writer.write(String.valueOf(element) + " ");

		} finally {
			if (writer != null) writer.close();
		}
	}

	private static List<Integer> generateList(int jump, int count) {
		List<Integer> list = new ArrayList<>(count);

		for (int i = 0; i < count; i++)
			list.add(1 + jump * i);

		return list;
	}
}
