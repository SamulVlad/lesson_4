package com.samul.javaсorelessons.lesson4;

//2. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.

public class SelfStudyTask2 {

	public static void main(String[] args) {
		double a = 10, b = 20;
		double s, p;
		
		s = a * b / 2;
		p = a + b + Math.sqrt(a * a + b * b);
		
		System.out.println("S = " + s + "\nP = " + p);
		
	}

}
