package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "Cp866");
		System.out.println("Игра \"Угадай число\"!");
		System.out.print("Введите имя первого игрока: ");
		Player player1 = new Player(scanner.nextLine());
		System.out.print("Введите имя второго игрока: ");
		Player player2 = new Player(scanner.nextLine());
		String isRepeat;
		
		do {
			GuessNumber game = new GuessNumber(player1, player2);
			game.play();
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				isRepeat = scanner.next();
			} while (!isRepeat.equals("да") && !isRepeat.equals("нет"));
		} while (!isRepeat.equals("нет"));
	}
}