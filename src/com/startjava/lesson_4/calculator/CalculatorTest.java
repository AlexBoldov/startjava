package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		String answer;

		do {
			System.out.print("Введите математическое выражение: ");
			Scanner scanner = new Scanner(System.in);
			calc.setMathExpression(scanner.nextLine());

			System.out.println("Результат вычисления: " + calc.calculate() + "\n");

			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answer = scanner.next();
			} while (!answer.equals("да") && !answer.equals("нет"));
		} while (!answer.equals("нет"));
	}
}