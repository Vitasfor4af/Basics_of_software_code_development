package by.epam.linePrograms.task2;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/* Вычислить значение выражения по формуле
 (все переменные принимают действительные значения) */

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

		double squareRoot = sqrt(pow(b, 2) + 4 * a * c);
		double result = ((b + squareRoot) / (2 * a)) - pow(a, 3) * c + pow(b, -2);
		System.out.println("result = " + result);
	}
}
