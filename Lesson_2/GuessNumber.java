import java.util.Random;

public class GuessNumber {

	private int inputNumber;
	private int leftInterval = 1;
	private int rightInterval = 100;
	Random random = new Random();
	private int hiddenNumber = random.nextInt(rightInterval - leftInterval + 1) + leftInterval;

	public int getLeftInterval() {
		return leftInterval;
	}

	public int getRightInterval() {
		return rightInterval;
	}

	public boolean game(int inputNumber) {
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