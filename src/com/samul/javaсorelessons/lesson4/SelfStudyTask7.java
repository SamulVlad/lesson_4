package com.samul.javaсorelessons.lesson4;

//7. Найти произведение цифр заданного четырехзначного числа.

public class SelfStudyTask7 {

	public static void main(String[] args) {
		int number = 12312412, tempNumber;
		int product = 1;

		int dgt;

		tempNumber = number;
		while (tempNumber >= 1) {
			dgt = (int) Math.round((tempNumber / 10.0 - tempNumber / 10) * 10);
			tempNumber /= 10;
			product *= dgt;
		}

		System.out.println("The product of digits is " + product);
	}

}
