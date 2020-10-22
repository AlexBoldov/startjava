package com.startjava.lesson_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	private final static int LEFT_INTERVAL = 1;
	private final static int RIGHT_INTERVAL = 100;
	private final static int MAX_ATTEMPTS = 10;
	private final Scanner scanner = new Scanner(System.in);
	private final Player player1;
	private final Player player2;
	private final int hiddenNum;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		Random random = new Random();
		hiddenNum = random.nextInt(LEFT_INTERVAL + RIGHT_INTERVAL);
	}

	public void play() {
		System.out.println("Компьютер загадал число. Попробуйте отгадать. Удачи!");
		System.out.println("У вас " + MAX_ATTEMPTS + " попыток\n");
		player1.setAttempts(0);
		player2.setAttempts(0);

		for (int i = 1; i <= MAX_ATTEMPTS; i++) {
			if (makeMove(player1)) break;
			if (makeMove(player2)) break;
		}
		showEnteredNums(player1);
		showEnteredNums(player2);
	}

	private boolean makeMove(Player player) {
		inputNum(player);
		if (checkNum(player)) return true;
		if (player.getAttempts() == MAX_ATTEMPTS) {
			System.out.println("У игрока " + player.getName() + " закончились попытки\n");
		}
		return false;
	}

	private void inputNum(Player player) {
		System.out.print(player.getName() + ", введите число: ");
		player.setEnteredNum(scanner.nextInt());
	}

	private boolean checkNum(Player player) {
		if (player.getLastEnteredNum() == hiddenNum) {
			System.out.println(player.getName() + ", вы угадали!\n\nИгрок " + player.getName() +
					" угадал число " + hiddenNum + " с " + player.getAttempts() + " попытки");
			return true;
		} else {
			System.out.println(player.getName() + ", введенное вами число "
					+ (player.getLastEnteredNum() < hiddenNum ? "меньше" : "больше")
					+ " того, что загадал компьютер\n");
			return false;
		}
	}

	private void showEnteredNums(Player player) {
		if (player.getAttempts() != 0) {
			System.out.print("Игрок " + player.getName() + " ввел числа: ");
		}
		for (int num : player.getEnteredNums()) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}