package by.epam.branching.Task2;

import java.util.Scanner;
import static java.lang.Math.max;
import static java.lang.Math.min;

/* Найти max{min(a, b), min(c, d)}. */

public class Task {
	public static void main(String[] args) {
		System.out.println("Input the value of a,b,c,d, correspondingly");
		Scanner scanner = new Scanner(System.in);
		int b = scanner.nextInt();
		int a = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		scanner.close();
		int result = max((min(a, b)), (min(c, d)));
		System.out.println("max = " + result);
	}
}
