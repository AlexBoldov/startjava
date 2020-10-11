import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	private int inputNumber;
	private int leftInterval = 1;
	private int rightInterval = 100;
	private String player1, player2;
	Random random = new Random();
	private int hiddenNumber = random.nextInt(rightInterval + leftInterval);
	Scanner scanner = new Scanner(System.in);

	public GuessNumber(String player1, String player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play() {
		System.out.println("Компьютер загадал число. Попробуйте отгадать. Удачи!");
		System.out.println();
		while (true) {
			System.out.print(player1 + ", ваша очередь. ");
			if (checkNumber()) break;
			System.out.println();
			System.out.print(player2 + ", ваша очередь. ");
			if (checkNumber()) break;
			System.out.println();
		}
	}

	private boolean checkNumber() {
		System.out.print("Введите число: ");
		inputNumber = scanner.nextInt();
		if (inputNumber > hiddenNumber) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
			return false;
		} else if (inputNumber < hiddenNumber) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
			return false;
		} else {
			System.out.println("Вы угадали!");
			return true;
		}
	}
}