public class MyFirstGame {
	public static void main(String[] args) {
		int hiddenNumber = 41; 
		int inputNumber = 87;
		int leftInterval = 1;
		int rightInterval = 100;

		while (hiddenNumber != inputNumber) {
			System.out.print("Это число " + inputNumber + "? ");
			if (inputNumber > hiddenNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				rightInterval = inputNumber - 1;
			} else {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				leftInterval = inputNumber + 1;
			}
			inputNumber = (leftInterval + rightInterval) / 2;
		}

		System.out.print("Это число " + inputNumber + "? ");
		System.out.println("Вы угадали!");
	}
}