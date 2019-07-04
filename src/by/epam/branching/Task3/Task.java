package by.epam.branching.Task3;

import java.util.Scanner;

/* Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
 Определить, будут ли они расположены на одной прямой. */

public class Task {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the coordinate of x1 = ");
		int x1 = scanner.nextInt();
		System.out.print("Input the coordinate of y1 = ");
		int y1 = scanner.nextInt();
		System.out.print("Input the coordinate of x2 = ");
		int x2 = scanner.nextInt();
		System.out.print("Input the coordinate of y2 = ");
		int y2 = scanner.nextInt();
		System.out.print("Input the coordinate of x3 = ");
		int x3 = scanner.nextInt();
		System.out.print("Input the coordinate of y3 = ");
		int y3 = scanner.nextInt();
		scanner.close();
		if ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0)
			System.out.println("The points lie on one straight line.");
		else
			System.out.println("The points do not lie on one straight line.");
	}
}
