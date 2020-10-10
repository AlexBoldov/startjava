public class JaegerTest {

	public static void main(String[] args) {
		Jaeger coyoteTango = new Jaeger();
		Jaeger strikerEureka = new Jaeger();

		System.out.println("Инициализация систем...");
		coyoteTango.setModelName("Coyote Tango");
		strikerEureka.setModelName("Striker Eureka");
		coyoteTango.setOperationSystem("Nauthlus-4 Zirca Sync");
		strikerEureka.setOperationSystem("Arbiter Tac-Conn 12");
		coyoteTango.setStrength(7);
		coyoteTango.setKaijuKilled(2);
		strikerEureka.setKaijuKilled(11);
		System.out.println("Начало боя...");
		System.out.println(strikerEureka.getModelName() + " активирует радары...");
		strikerEureka.scanKaiju();
		System.out.println("Подготовка орудий...");
		System.out.print(coyoteTango.getModelName());
		coyoteTango.drift();
		System.out.print(strikerEureka.getModelName());
		strikerEureka.move();
		coyoteTango.useVortexCannon();
		System.out.println(coyoteTango.getModelName() + " производит залп...");
		System.out.println(coyoteTango.getModelName() + " успешно поразил цель!");
		coyoteTango.setKaijuKilled(coyoteTango.getKaijuKilled() + 1);
		coyoteTango.setModelName("Матерый Coyote Tango");
		System.out.println(coyoteTango.getModelName() + " успешно повысил навыки ведения огня!");
		System.out.print("Навык силы увеличен c " + coyoteTango.getStrength() + " до ");
		coyoteTango.setStrength(coyoteTango.getStrength() + 1);
		System.out.println(coyoteTango.getStrength() + " единиц");
		System.out.println("Бой окончен. Потери отсутствуют.");
	}
}