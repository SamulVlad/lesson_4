package com.samul.javaсorelessons.lesson4;

//3. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).

public class SelfStudyTask3 {

	public static void main(String[] args) {
		int x1 = 0, y1 = 0, x2 = 10, y2 = 10;
		double dist;
		
		dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.println("The distance is = " + dist);

	}

}
