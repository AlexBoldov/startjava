class Person {

	String name = "Alex";
	String gender = "male";
	int age = 37;
	int height = 181;
	int weight = 76;

	void move() {
		System.out.println("Человек идет");
	}

	void sit() {
		System.out.println("Человек садится");
	}

	void run() {
		System.out.println("Человек бежит");
	}

	String speak() {
		return "Человек говорит";
	}

	String learnJava() {
		return "Человек изучает Java";
	}
}