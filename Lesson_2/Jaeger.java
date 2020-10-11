public class Jaeger {

	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;
	private String operationSystem;
	private int kaijuKilled;

	public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor, String operationSystem, int kaijuKilled) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
		this.operationSystem = operationSystem;
		this.kaijuKilled = kaijuKilled;
	}

	public Jaeger(String modelName, String mark, String origin) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		if (modelName == "") {
			System.out.println("Пустая строка");
		} else {
			this.modelName = modelName;
		}
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}

	public int getKaijuKilled() {
		return kaijuKilled;
	}

	public void setKaijuKilled(int kaijuKilled) {
		this.kaijuKilled = kaijuKilled;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public boolean drift() {
		System.out.println(" вошел в дрифт");
		return true;
	}

	public void move() {
		System.out.println(" прошел 5 шагов");
	}

	public String scanKaiju() {
		return "Обнаружен кайдзю...";
	}

	public void useVortexCannon() {

	}

	public void usePlasmacaster() {

	}
}