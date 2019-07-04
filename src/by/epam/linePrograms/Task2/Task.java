package by.epam.linePrograms.Task2;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/* Вычислить значение выражения по формуле
 (все переменные принимают действительные значения) */

public class Task {
	public static void main(String[] args) {
		System.out.println("Input the values of a, b and c, correspondingly");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		float result = 0;
		double squareRoot = sqrt(pow(b, 2) + 4 * a * c);
		result = (float) (((b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a)) - pow(a, 3) * c + pow(b, -2));
		System.out.println("result = " + result);
	}
}
