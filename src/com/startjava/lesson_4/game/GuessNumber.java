package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	private final int leftInterval = 1;
	private final int rightInterval = 100;
	private final Random random = new Random();
	private final int hiddenNumber = random.nextInt(rightInterval + leftInterval);
	private final int maxCount = 10;
	private int count = 1;
	private final Scanner scanner = new Scanner(System.in);
	private final Player player1;
	private final Player player2;
	private final int[] player1ListOfNumbers = new int[maxCount];
	private final int[] player2ListOfNumbers = new int[maxCount];

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play() {
		player2.setListOfNumbers(null);
		System.out.println("Компьютер загадал число. Попробуйте отгадать. Удачи!");
		System.out.println("У вас " + maxCount + " попыток\n");
		while (count <= maxCount) {
			System.out.print(player1.getName() + ", введите число: ");
			player1ListOfNumbers[count-1] = scanner.nextInt();
			player1.setListOfNumbers(Arrays.copyOf(player1ListOfNumbers, count));
			if (checkNumber(player1.getListOfNumbers()[count-1])) break;

			System.out.print(player2.getName() + ", введите число: ");
			player2ListOfNumbers[count-1] = scanner.nextInt();
			player2.setListOfNumbers(Arrays.copyOf(player2ListOfNumbers, count));
			if (checkNumber(player2.getListOfNumbers()[count-1])) break;

			count += 1;
		}

		listOfNumbersOut(player1.getName(), player1.getListOfNumbers());
		listOfNumbersOut(player2.getName(), player2.getListOfNumbers());
		checkWinner(player1.getName(), player1.getListOfNumbers());
		checkWinner(player2.getName(), player2.getListOfNumbers());
	}

	private boolean checkNumber(int number) {
		if (number == hiddenNumber) {
			System.out.println("Вы угадали!\n");
			return true;
		} else if (number < hiddenNumber) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер\n");
		} else {
			System.out.println("Введенное вами число больше того, что загадал компьютер\n");
		}
		return false;
	}

	private void listOfNumbersOut(String name, int[] numbers) {
		if (numbers != null) {
			System.out.print("Игрок " + name + " ввел числа: ");
			for (int i : numbers) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private void checkWinner(String name, int[] numbers) {
		if (numbers != null && numbers[numbers.length - 1] == hiddenNumber) {
			System.out.println("Игрок " + name + " угадал число "
					+ hiddenNumber + " с " + numbers.length + " попытки");
		} else if (numbers != null && numbers.length == maxCount) {
			System.out.println("У игрока " + name + " закончились попытки");
		}
	}
}