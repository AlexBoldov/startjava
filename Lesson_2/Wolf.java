public class Wolf {

	private String name;
	private String gender;
	private int age;
	private int weight;
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void move() {
		System.out.println("Волк передвигается");
	}

	public void sit() {
		System.out.println("Волк садится");
	}

	public void run() {
		System.out.println("Волк бежит");
	}

	public String howl() {
		return "Волк воет";
	}

	public String hunt() {
		return "Волк охотится";
	}
}