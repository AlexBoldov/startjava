public class Cycle {
	public static void main(String[] args) {

		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}
		System.out.println();

		int i = 6;
		while (i >= -6) {
			System.out.println(i);
			i = i - 2;
		}
		System.out.println();

		int sumOddNumbers = 0;
		i = 10;
		do {
			if (i % 2 != 0) {
				sumOddNumbers = sumOddNumbers + i;
			}
			i++;
		} while (i <= 20);
		System.out.println(sumOddNumbers);
	}
}