package by.epam.loops.task2;

import java.util.Scanner;

/* Вычислить значения функции на отрезке [а,b] c шагом h */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the value of a = ");
		int a = scanner.nextInt();
		System.out.print("Input the value of b = ");
		int b = scanner.nextInt();
		System.out.print("Input the value of h = ");
		int h = scanner.nextInt();
		scanner.close();

		int x;
		int result = 0;
		for (; a < b; a += h) {
			x = a;
			if (x > 2) {
				result = x;
			} else if (x <= 2) {
				result = -x;
			}
			System.out.print(result + " ");
		}
	}
}
