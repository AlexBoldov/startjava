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
			GuessNumber guessNumber = new GuessNumber();
			System.out.println("Компьютер загадал число. Попробуйте отгадать. Удачи!");
			System.out.println();
			while (true) {
				System.out.print(player1.getName() + ", ваша очередь. ");
				if (guessNumber.play()) break;
				System.out.println();
				System.out.print(player2.getName() + ", ваша очередь. ");
				if (guessNumber.play()) break;
				System.out.println();
			}
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				isRepeat = scanner.next();
			} while (!isRepeat.equals("да") && !isRepeat.equals("нет"));
		} while (!isRepeat.equals("нет"));
	}
}