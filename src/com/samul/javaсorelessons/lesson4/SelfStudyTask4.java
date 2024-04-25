package com.samul.javaсorelessons.lesson4;

//4. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2),(х3, у3). Найти его периметр и площадь.

public class SelfStudyTask4 {

	public static void main(String[] args) {
		int x1 = 0, y1 = 0, x2 = 10, y2 = 10, x3 = 8, y3 = 5;
		double dist1, dist2, dist3, halfP;
		double p, s;
		
		dist1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		dist2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		dist3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		p = dist1 + dist2 + dist3;
		
		halfP = p / 2;
		
		s = Math.sqrt(halfP * (p - dist1) * (p - dist2) * (p - dist3));
		
		System.out.println("P = " + p + "\nS = " + s);

	}

}
