import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	private int leftInterval = 1;
	private int rightInterval = 100;
	Random random = new Random();
	private int hiddenNumber = random.nextInt(rightInterval + leftInterval);
	Scanner scanner = new Scanner(System.in);
	Player player1, player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play() {
		System.out.println("Компьютер загадал число. Попробуйте отгадать. Удачи!\n");
		while (true) {
			System.out.print(player1.getName() + ", введите число: ");
			player1.setNumber(scanner.nextInt());
			if (checkNumber(player1.getNumber())) {
				System.out.println("Выиграл " + player1.getName() + "!!!");
				break;
			}
			System.out.print(player2.getName() + ", введите число: ");
			player2.setNumber(scanner.nextInt());
			if (checkNumber(player2.getNumber())) {
				System.out.println("Выиграл " + player2.getName() + "!!!");
				break;
			}
		}
	}

	private boolean checkNumber(int number) {
		if (number == hiddenNumber) {
			System.out.println("Вы угадали!\n");
			return true;
		} else {
			if (number < hiddenNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер\n");
			} else {
				System.out.println("Введенное вами число больше того, что загадал компьютер\n");
			}
			return false;
		}
	}
}