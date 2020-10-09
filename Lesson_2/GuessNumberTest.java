import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "Cp866");
		System.out.print("Введите имя первого игрока: ");
		Player player1 = new Player(scanner.next());
		System.out.print("Введите имя второго игрока: ");
		Player player2 = new Player(scanner.next());
		String isRepeat;

		while (true) {
			GuessNumber guessNumber = new GuessNumber();
			System.out.println("Игра началась! Компьютер загадал число в интервале от " + guessNumber.getLeftInterval() + " до " + guessNumber.getRightInterval());
			while (true) {
				System.out.print(player1.getName() + ", ваш шанс! Введите число: ");
				player1.setNumber(scanner.nextInt());
				if (guessNumber.game(player1.getNumber()) == true) {
					System.out.println("Победитель - " + player1.getName() + "!");
					break;
				}
				System.out.println();
				System.out.print(player2.getName() + ", ваш шанс! Введите число: ");
				player2.setNumber(scanner.nextInt());
				if (guessNumber.game(player2.getNumber()) == true) {
					System.out.println("Победитель - " + player2.getName() + "!");
					break;
				}
				System.out.println();
			}

			System.out.println();
			while (true) {
				System.out.print("Хотите продолжить? [да/нет]: ");
				isRepeat = scanner.next();
				if (isRepeat.equals("да") || isRepeat.equals("нет")) {
					break;
				}
			}
			if (isRepeat.equals("нет")) {
				break;
			}
		}
	}
}