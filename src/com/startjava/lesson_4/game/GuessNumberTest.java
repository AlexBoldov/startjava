package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Старт игры \"Угадай число\"!");
		System.out.print("Введите имя первого игрока: ");
		Player player1 = new Player(scanner.nextLine());
		System.out.print("Введите имя второго игрока: ");
		Player player2 = new Player(scanner.nextLine());
		String answer;
		
		do {
			GuessNumber game = new GuessNumber(player1, player2);
			game.play();
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answer = scanner.next();
			} while (!answer.equals("да") && !answer.equals("нет"));
		} while (!answer.equals("нет"));
	}
}