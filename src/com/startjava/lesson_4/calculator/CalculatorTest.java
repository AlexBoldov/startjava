package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		String isRepeat;

		do {
			System.out.print("Введите математическое выражение: ");
			Scanner scanner = new Scanner(System.in);
			calc.setInputString(scanner.nextLine());

			System.out.println("Результат вычисления: " + calc.calculate() + "\n");

			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				isRepeat = scanner.next();
			} while (!isRepeat.equals("да") && !isRepeat.equals("нет"));
		} while (!isRepeat.equals("нет"));
	}
}