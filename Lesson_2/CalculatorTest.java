import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "Cp866");
		Calculator calculator = new Calculator();
		String isRepeat;

		while (true) {
			System.out.print("Введите первое число: ");
			calculator.setFirstNumber(scanner.nextInt());
			System.out.print("Введите знак математической операции: ");
			calculator.setOperation(scanner.next().charAt(0));
			System.out.print("Введите второе число: ");
			calculator.setSecondNumber(scanner.nextInt());

			calculator.calculation();

			System.out.println();
			while (true) {
				System.out.print("Хотите продолжить? [да/нет]: ");
				isRepeat = scanner.next();
				if (isRepeat.equals("да") || isRepeat.equals("нет")) {
					break;
				}
			}
			if (isRepeat.equals("нет")) {
				break;
			}
		}
	}
}