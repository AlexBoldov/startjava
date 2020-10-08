public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 25;
		boolean isMaleGender = true;
		double height = 1.81d;
		char firstLetterOfName = 'A';

		if (age > 20) {
			System.out.println("Вы старше 20 лет");
		}
		if (isMaleGender) {
			System.out.println("Ваш пол - мужской");
		}
		if (!isMaleGender) {
			System.out.println("Ваш пол - женский");
		}
		if (height < 1.80) {
			System.out.println("Ваш рост до 179 см");
		} else {
			System.out.println("Ваш рост от 180 см");
		}
		if (firstLetterOfName == 'M') {
			System.out.println("Первая буква вашего имени - M");
		} else if (firstLetterOfName == 'I') {
			System.out.println("Первая буква вашего имени - I");
		} else {
			System.out.println("Первая буква вашего имени - " + firstLetterOfName);
		}
	}
}