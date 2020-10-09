public class WolfTest {

	public static void main(String[] args) {
		Wolf mowgliMother = new Wolf();
		mowgliMother.setName("Ракша");
		mowgliMother.setGender("female");
		mowgliMother.setAge(9);
		mowgliMother.setWeight(23);
		mowgliMother.setColor("white");

		System.out.println("Имя волчицы-матери Маугли: " + mowgliMother.getName());
		System.out.println("Пол волчицы-матери Маугли: " + mowgliMother.getGender());
		System.out.println("Возраст волчицы-матери Маугли: " + mowgliMother.getAge());
		System.out.println("Вес волчицы-матери Маугли: " + mowgliMother.getWeight());
		System.out.println("Окраска волчицы-матери Маугли: " + mowgliMother.getColor());

		mowgliMother.move();
		mowgliMother.sit();
		mowgliMother.run();
		mowgliMother.howl();
		mowgliMother.hunt();
	}
}