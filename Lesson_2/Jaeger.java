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