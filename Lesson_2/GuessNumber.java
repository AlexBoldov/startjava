import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	private int inputNumber;
	private int leftInterval = 1;
	private int rightInterval = 100;
	Random random = new Random();
	private int hiddenNumber = random.nextInt(rightInterval + leftInterval);
	Scanner scanner = new Scanner(System.in, "Cp866");

	public boolean play() {
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