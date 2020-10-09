public class WolfTest {

	public static void main(String[] args) {
		Wolf mowgliMother = new Wolf();
		mowgliMother.name = "Ракша";
		mowgliMother.gender = "female";
		mowgliMother.age = 15;
		mowgliMother.weight = 23;
		mowgliMother.color = "white";

		System.out.println("Имя волчицы-матери Маугли: " + mowgliMother.name);
		System.out.println("Пол волчицы-матери Маугли: " + mowgliMother.gender);
		System.out.println("Возраст волчицы-матери Маугли: " + mowgliMother.age);
		System.out.println("Вес волчицы-матери Маугли: " + mowgliMother.weight);
		System.out.println("Окраска волчицы-матери Маугли: " + mowgliMother.color);

		mowgliMother.move();
		mowgliMother.sit();
		mowgliMother.run();
		mowgliMother.howl();
		mowgliMother.hunt();
	}
}