package by.epam.linePrograms.task1;

import java.util.Scanner;

/* Найдите значение функции: z = ( (a – 3 ) * b / 2) + c. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the value of a = ");
		double a = scanner.nextDouble();
		System.out.print("Input the value of b = ");
		double b = scanner.nextDouble();
		System.out.print("Input the value of c = ");
		double c = scanner.nextDouble();
		scanner.close();
		
		double result = ((a - 3) * b / 2) + c;
		System.out.println("result = " + result);
	}
}
