package by.epam.linePrograms.Task1;

import java.util.Scanner;

/* Найдите значение функции: z = ( (a – 3 ) * b / 2) + c. */

public class Task {
	public static void main(String[] args) {
		System.out.println("Input the values of a, b and c, correspondingly");
		Scanner scanner = new Scanner(System.in);
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		float c = scanner.nextFloat();
		scanner.close();
		float result = ((a - 3) * b / 2) + c;
		System.out.println("result = " + result);
	}
}
