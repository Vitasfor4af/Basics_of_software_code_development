package by.epam.branching.Task5;

import java.util.Scanner;
import static java.lang.Math.pow;

/* Вычислить значение функции */

public class Task {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the value of x = ");
		float x = scanner.nextFloat();
		scanner.close();
		float result = 0;
		if (x <= 3) {
			result = (float) (pow(x, 2) - 3 * x + 9);
		} else {
			result = (float) (1 / (pow(x, 3) + 6));
		}
		System.out.println("result = " + result);
	}
}
