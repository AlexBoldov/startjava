class Wolf {

	String name;
	String gender;
	int age;
	int weight;
	String color;

	void move() {
		System.out.println("Волк передвигается");
	}

	void sit() {
		System.out.println("Волк садится");
	}

	void run() {
		System.out.println("Волк бежит");
	}

	String howl() {
		return "Волк воет";
	}

	String hunt() {
		return "Волк охотится";
	}
}