package com.samul.javaсorelessons.lesson4;

/*10. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы
вписанной и описанной окружностей.
*/

public class SelfStudyTask10 {

	public static void main(String[] args) {
		int a = 5;
		double s, h, rr, rR;
		
		h = a * Math.sqrt(3) / 2; 
		s = a * h / 2; 
		rr = a / (2 * Math.sqrt(3));
		rR = a / Math.sqrt(3);
		
		System.out.println("Высота треугольника равна: " + h);
		System.out.println("Площадь треугольника равна: " + s);
		System.out.println("Радиус вписанной окружности " + rr);
		System.out.println("Радиус описанной окружности " + rR);

	}

}
