package by.epam.branching.task5;

import java.util.Scanner;
import static java.lang.Math.pow;

/* Вычислить значение функции */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the value of x = ");
		double x = scanner.nextDouble();
		scanner.close();
		double result = 0;
		if (x <= 3) {
			result = pow(x, 2) - 3 * x + 9;
		} else {
			result = 1 / (pow(x, 3) + 6);
		}
		System.out.println("result = " + result);
	}
}
