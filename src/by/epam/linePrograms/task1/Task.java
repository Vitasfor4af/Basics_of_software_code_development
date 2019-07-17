package by.epam.linePrograms.task1;

import java.util.Scanner;

/* Найдите значение функции: z = ( (a – 3 ) * b / 2) + c. */

public class Task {

	public static void main(String[] args) {
		System.out.println("Input the values of a, b and c, correspondingly");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		scanner.close();
		double result = ((a - 3) * b / 2) + c;
		System.out.println("result = " + result);
	}
}
