package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "Cp866");
		Calculator calculator = new Calculator();
		String isRepeat;

		do {
			System.out.print("Введите первое число: ");
			calculator.setFirstNumber(scanner.nextInt());
			System.out.print("Введите знак математической операции: ");
			calculator.setOperation(scanner.next().charAt(0));
			System.out.print("Введите второе число: ");
			calculator.setSecondNumber(scanner.nextInt());

			calculator.calculate();

			System.out.println();
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				isRepeat = scanner.next();
			} while (!isRepeat.equals("да") && !isRepeat.equals("нет"));
		} while (!isRepeat.equals("нет"));
	}
}