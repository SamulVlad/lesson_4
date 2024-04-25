package com.samul.javaсorelessons.lesson4;

//8. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.

public class SelfStudyTask8 {

	public static void main(String[] args) {
		int a = 10 ,b =  -20;
		double midA, midG;
		
		midA = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		midG = Math.sqrt(Math.abs(a) * Math.abs(b));

		System.out.println("midA = " + midA + "\nmidG = " + midG);

	}

}
