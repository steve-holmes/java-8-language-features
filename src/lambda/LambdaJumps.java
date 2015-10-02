package lambda;

import java.util.function.Consumer;

public class LambdaJumps {
	public static void main(String[] args) {
		Consumer<int[]> printer = ids -> {
			int printedCount = 0;
			for (int id : ids) {
				if (id % 2 != 0) {
					continue;
				}
				
				System.out.println(id);
				printedCount++;
				
				if (printedCount == 3) {
					break;
				}
			}
		};
		
		printer.accept(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
	}
}
