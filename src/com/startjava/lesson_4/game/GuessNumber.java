package com.startjava.lesson_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	private final static int LEFT_INTERVAL = 1;
	private final static int RIGHT_INTERVAL = 100;
	private final static int MAX_COUNTS = 10;	//  MAX_COUNTS == Player.ENTERED_NUMS_LENGTH
	private final Scanner scanner = new Scanner(System.in);
	private final Random random = new Random();
	private final Player player1;
	private final Player player2;
	private final int compNumber = random.nextInt(LEFT_INTERVAL + RIGHT_INTERVAL);
	private int player1Counts;
	private int player2Counts;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play() {
		System.out.println("Компьютер загадал число. Попробуйте отгадать. Удачи!");
		System.out.println("У вас " + MAX_COUNTS + " попыток\n");
		while (player1Counts < MAX_COUNTS && player2Counts < MAX_COUNTS) {
			System.out.print(player1.getName() + ", введите число: ");
			player1Counts++;
			player1.setNumber(scanner.nextInt());
			player1.setEnteredNums(player1.getNumber(), player1Counts - 1);
			if (checkNumber(player1.getNumber())) break;

			System.out.print(player2.getName() + ", введите число: ");
			player2Counts++;
			player2.setNumber(scanner.nextInt());
			player2.setEnteredNums(player2.getNumber(), player2Counts - 1);
			if (checkNumber(player2.getNumber())) break;
		}

		enteredNumsOutput(player1.getName(), player1.getEnteredNums(player1Counts));
		if (player2Counts != 0) enteredNumsOutput(player2.getName(), player2.getEnteredNums(player2Counts));
		checkWinner(player1.getName(), player1.getNumber(), player1Counts);
		if (player2Counts != 0) checkWinner(player2.getName(), player2.getNumber(), player2Counts);
	}

	private boolean checkNumber(int number) {
		if (number == compNumber) {
			System.out.println("Вы угадали!\n");
			return true;
		} else if (number < compNumber) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер\n");
		} else {
			System.out.println("Введенное вами число больше того, что загадал компьютер\n");
		}
		return false;
	}

	private void enteredNumsOutput(String name, int[] nums) {
			System.out.print("Игрок " + name + " ввел числа: ");
			for (int i : nums) {
				System.out.print(i + " ");
			}
			System.out.println();
	}

	private void checkWinner(String name, int number, int counts) {
		if (number == compNumber) {
			System.out.println("Игрок " + name + " угадал число " + compNumber + " с " + counts + " попытки");
		} else if (counts == MAX_COUNTS) {
			System.out.println("У игрока " + name + " закончились попытки");
		}
	}
}