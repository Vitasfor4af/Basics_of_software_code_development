package by.epam.branching.task2;

import java.util.Scanner;
import static java.lang.Math.max;
import static java.lang.Math.min;

/* Найти max{min(a, b), min(c, d)}. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the value of a = ");
		double a = scanner.nextDouble();
		System.out.print("Input the value of b = ");
		double b = scanner.nextDouble();
		System.out.print("Input the value of c = ");
		double c = scanner.nextDouble();
		System.out.print("Input the value of d = ");
		double d = scanner.nextDouble();
		scanner.close();
		
		double result = max((min(a, b)), (min(c, d)));
		System.out.println("max = " + result);
	}
}
