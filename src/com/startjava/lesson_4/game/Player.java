package com.startjava.lesson_4.game;

public class Player {

	private final String name;
	private int[] listOfNumbers;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setListOfNumbers(int[] listOfNumbers) {
		this.listOfNumbers = listOfNumbers;
	}

	public int[] getListOfNumbers() {
		return listOfNumbers;
	}
}