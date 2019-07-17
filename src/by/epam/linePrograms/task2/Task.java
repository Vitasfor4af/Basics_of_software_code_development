package by.epam.linePrograms.task2;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/* Вычислить значение выражения по формуле
 (все переменные принимают действительные значения) */

public class Task {

	public static void main(String[] args) {
		System.out.println("Input the values of a, b and c, correspondingly");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		scanner.close();
		double result = 0;
		double squareRoot = sqrt(pow(b, 2) + 4 * a * c);
		result = ((b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a)) - pow(a, 3) * c + pow(b, -2);
		System.out.println("result = " + result);
	}
}
