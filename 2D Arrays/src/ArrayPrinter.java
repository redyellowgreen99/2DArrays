public class ArrayPrinter {
	public static void main(String[] args) {
		int array[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		String letter[][] = { { "the", "when", "how", "zoo" }, { "other" } };
		printingPress(array);
		lastLetter(letter);
		firstLetter(letter);
	}

	public static void printingPress(int Array[][]) {
		System.out.println("It's dangerous to code alone. Compile this.");
		for (int row = 0; row < Array.length; row++) {
			for (int column = 0; column < Array[row].length; column++) {
				System.out.println(Array[row][column] + "\t");
			}
		}

	}

	public static String lastLetter(String[][] array) {
		String winner = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j].compareTo(winner) > 0) {
					winner = array[i][j];
				}
			}
		}
		System.out.println(winner);
		return winner;
	}

	public static String firstLetter(String[][] array) {
		String winner = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j].compareTo(winner) < 0) {
					winner = array[i][j];
				}
			}
		}
		System.out.println(winner);
		return winner;
	}
}
