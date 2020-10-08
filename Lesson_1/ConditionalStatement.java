public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 25;
		if (age > 20) {
			System.out.println("Вы старше 20 лет");
		}

		boolean isMaleGender = true;
		if (isMaleGender) {
			System.out.println("Ваш пол - мужской");
		}
		if (!isMaleGender) {
			System.out.println("Ваш пол - женский");
		}

		double height = 1.81d;
		if (height < 1.80) {
			System.out.println("Ваш рост до 179 см");
		} else {
			System.out.println("Ваш рост от 180 см");
		}

		char firstLetterOfName = 'A';
		if (firstLetterOfName == 'M') {
			System.out.println("Первая буква вашего имени - M");
		} else if (firstLetterOfName == 'I') {
			System.out.println("Первая буква вашего имени - I");
		} else {
			System.out.println("Первая буква вашего имени - " + firstLetterOfName);
		}
	}
}