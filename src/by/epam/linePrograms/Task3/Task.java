package by.epam.linePrograms.Task3;

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
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		scanner.close();
		float z = 0;
		z = (float) (((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(x * y));
		System.out.println("result = " + z);
	}
}
