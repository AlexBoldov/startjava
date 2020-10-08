public class Calculator {
	public static void main(String[] args) {
		int a = 7, b = 5;
		char operation = '%';

		if (operation == '+') {
			System.out.println(a + b);
		} else if (operation == '-') {
			System.out.println(a - b);
		} else if (operation == '*') {
			System.out.println(a * b);
		} else if (operation == '/') {
			System.out.println(a / b);
		} else if (operation == '^') {
			int result = a;
			for (int i = 2; i <= b; i++) {
				result *= a;
			}
			System.out.println(result);
		} else if (operation == '%') {
			System.out.println(a % b);
		}
	}
}