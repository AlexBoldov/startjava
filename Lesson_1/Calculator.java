public class Calculator {
	public static void main(String[] args) {

		int a = 7, b = 8, rezult = 0;
		char operation = '^';

		if (operation == '+') {
			rezult = a + b;
		}
		if (operation == '-') {
			rezult = a - b;
		}
		if (operation == '*') {
			rezult = a * b;
		}
		if (operation == '/') {
			rezult = a / b;
		}
		if (operation == '^') {
			rezult = a;
			for (int i = 2; i <= b; i++) {
				rezult = rezult * a;
			}
		}
		if (operation == '%') {
			rezult = a % b;
		}

		System.out.println(a + " " + operation + " " + b + " = " + rezult);
	}
}