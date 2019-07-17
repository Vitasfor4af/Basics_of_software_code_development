package by.epam.branching.task1;

import java.util.Scanner;

/* Даны два угла треугольника (в градусах).
 Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным. */

public class Task {

	public static void main(String[] args) {
		System.out.println("Enter the two corners(A,B) of the triangle, correspondingly:");
		Scanner scanner = new Scanner(System.in);
		int cornerA = scanner.nextInt();
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
