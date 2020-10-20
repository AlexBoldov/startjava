package com.startjava.lesson_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	private final static int LEFT_INTERVAL = 1;
	private final static int RIGHT_INTERVAL = 100;
	private final static int MAX_ATTEMPTS = 10;
	private final Scanner scanner = new Scanner(System.in);
	private final Random random = new Random();
	private final Player player1;
	private final Player player2;
	private final int hiddenNum = random.nextInt(LEFT_INTERVAL + RIGHT_INTERVAL);

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play() {
		System.out.println("Компьютер загадал число. Попробуйте отгадать. Удачи!");
		System.out.println("У вас " + MAX_ATTEMPTS + " попыток\n");
		player1.setPlayerAttempts(0);
		player2.setPlayerAttempts(0);
		int attempts = 1;

		while (attempts <= MAX_ATTEMPTS) {
			inputNum(player1);
			if (checkNum(player1.getLastEnteredNum())) break;
			inputNum(player2);
			if (checkNum(player2.getLastEnteredNum())) break;
			attempts++;
		}

		showEnteredNums(player1);
		showEnteredNums(player2);
		checkWinner(player1);
		checkWinner(player2);
	}

	private void inputNum(Player player) {
		System.out.print(player.getName() + ", введите число: ");
		player.setPlayerAttempts(player.getPlayerAttempts() + 1);
		player.setEnteredNum(scanner.nextInt());
	}

	private boolean checkNum(int num) {
		if (num == hiddenNum) {
			System.out.println("Вы угадали!\n");
			return true;
		} else
			System.out.println("Введенное вами число "
					+ (num < hiddenNum ? "меньше" : "больше")
					+ " того, что загадал компьютер\n");
			return false;
	}

	private void showEnteredNums(Player player) {
		if (player.getPlayerAttempts() != 0) {
			System.out.print("Игрок " + player.getName() + " ввел числа: ");
			for (int num : player.getEnteredNums()) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	private void checkWinner(Player player) {
		if (player.getPlayerAttempts() != 0 && player.getLastEnteredNum() == hiddenNum) {
			System.out.println("Игрок " + player.getName() + " угадал число "
					+ hiddenNum + " с " + player.getPlayerAttempts() + " попытки");
		} else if (player.getPlayerAttempts() == MAX_ATTEMPTS) {
			System.out.println("У игрока " + player.getName() + " закончились попытки");
		}
	}
}