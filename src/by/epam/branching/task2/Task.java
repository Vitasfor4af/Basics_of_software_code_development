package by.epam.branching.task2;

import java.util.Scanner;
import static java.lang.Math.max;
import static java.lang.Math.min;

/* Найти max{min(a, b), min(c, d)}. */

public class Task {

	public static void main(String[] args) {
		System.out.println("Input the value of a,b,c,d, correspondingly");
		Scanner scanner = new Scanner(System.in);
		double b = scanner.nextDouble();
		double a = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		scanner.close();
		double result = max((min(a, b)), (min(c, d)));
		System.out.println("max = " + result);
	}
}
