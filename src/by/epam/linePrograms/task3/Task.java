package by.epam.linePrograms.task3;

import java.util.Scanner;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;

/* Вычислить значение выражения по формуле
 (все переменные принимают действительные значения) */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the value of x = ");
		double x = scanner.nextDouble();
		System.out.print("Input the value of y = ");
		double y = scanner.nextDouble();
		scanner.close();

		double z = ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y);
		System.out.println("result = " + z);
	}
}
