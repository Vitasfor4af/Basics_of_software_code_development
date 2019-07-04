package by.epam.branching.Task4;

import java.util.Scanner;

/* Заданы размеры А, В прямоугольного отверстия и
 размеры х, у, z кирпича.
  Определить, пройдет ли кирпич через отверстие. */

public class Task {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the dimension of the rectangular hole A = ");
		float a = scanner.nextFloat();
		System.out.print("Enter the dimension of the rectangular hole B = ");
		float b = scanner.nextFloat();
		System.out.print("Enter the dimension of the brick x(length) = ");
		float x = scanner.nextFloat();
		System.out.print("Enter the dimension of the brick y(width) = ");
		float y = scanner.nextFloat();
		System.out.print("Enter the dimension of the brick z(height) = ");
		float z = scanner.nextFloat();
		scanner.close();
		if ((y < b && z < a) || (x < b && z < a) || (z < b && y < a) || (x < b && y < a) || (z < b && x < a)
				|| (y < b && x < a))
			System.out.println(true);
		else
			System.out.println(false);
	}
}
