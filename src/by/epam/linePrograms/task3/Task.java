package by.epam.linePrograms.task3;

import java.util.Scanner;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;

/* Вычислить значение выражения по формуле
 (все переменные принимают действительные значения) */

public class Task {

	public static void main(String[] args) {
		System.out.println("Input the values of x and y, correspondingly");
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		scanner.close();
		double z = 0;
		z = ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y);
		System.out.println("result = " + z);
	}
}
