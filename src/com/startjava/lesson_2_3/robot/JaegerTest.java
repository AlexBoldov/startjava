package com.startjava.lesson_2_3.robot;

public class JaegerTest {

	public static void main(String[] args) {
		Jaeger coyoteTango = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.4f, 2.4f, 5, 7, 4, "Nauthlus-4 Zirca Sync", 2);
		Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.9f, 10, 10, 9, "Arbiter Tac-Conn 12", 11);
		Jaeger diabloIntercept = new Jaeger("Diablo Intercept", "Mark-2", "Chile");

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