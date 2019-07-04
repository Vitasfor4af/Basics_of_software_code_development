package by.epam.loops.Task2;

import java.util.Scanner;

/* Вычислить значения функции на отрезке [а,b] c шагом h */
// -1	3	5	7	9
public class Task {
	public static void main(String[] args) {
		System.out.println("Input the values of a, b and h, correspondingly");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
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
			System.out.print(result + "\t");
		}
	}
}
