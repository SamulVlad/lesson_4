package com.samul.javaсorelessons.lesson4;

//5. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.

public class SelfStudyTask5 {

	public static void main(String[] args) {
		int r = 10;
		double l, s;
		
		l = 2 * r * Math.PI;
		s = Math.PI * r * r;
		
		System.out.println("L = " + l + "\nS = " + s);

	}

}
