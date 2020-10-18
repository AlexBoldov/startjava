package com.startjava.lesson_4.calculator;

public class Calculator {
	private String inputString;

	public void setInputString(String inputString) {
		this.inputString = inputString;
	}

	public int calculate() {
		String[] mathArgs = inputString.split(" ", 3);
		switch (mathArgs[1]) {
			case "+" :
				return Integer.parseInt(mathArgs[0]) + Integer.parseInt(mathArgs[2]);
			case "-" :
				return Integer.parseInt(mathArgs[0]) - Integer.parseInt(mathArgs[2]);
			case "*" :
				return Integer.parseInt(mathArgs[0]) * Integer.parseInt(mathArgs[2]);
			case "/" :
				return Integer.parseInt(mathArgs[0]) / Integer.parseInt(mathArgs[2]);
			case "^" :
				return (int) Math.pow(Integer.parseInt(mathArgs[0]), Integer.parseInt(mathArgs[2]));
			case "%" :
				return Integer.parseInt(mathArgs[0]) % Integer.parseInt(mathArgs[2]);
			default : {
				System.out.println("Ошибка! Недопустимый знак математической операции. Операция не выполнена.");
				return 0;
			}
		}
	}
}