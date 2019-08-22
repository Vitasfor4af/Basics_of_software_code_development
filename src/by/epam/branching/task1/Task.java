package by.epam.branching.task1;

import java.util.Scanner;

/* Даны два угла треугольника (в градусах).
 Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the corner of the triangle A = ");
		int cornerA = scanner.nextInt();
		System.out.print("Input the corner of the triangle B = ");
		int cornerB = scanner.nextInt();
		scanner.close();

		if (cornerA + cornerB < 180) {
			System.out.println("Exists");
			if (cornerA + cornerB == 90 || cornerA == 90 || cornerB == 90) {
				System.out.println("the triangle is rectangular.");
			} else {
				System.out.println("the triangle is not rectangular.");
			}
		} else {
			System.out.println("Does not exist");
		}
	}
}
