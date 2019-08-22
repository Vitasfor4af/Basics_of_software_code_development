package by.epam.loops.task7;

import java.util.Scanner;

/* Для каждого натурального числа в промежутке от m до n
 вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the boundary of the interval m = ");
		int m = scanner.nextInt();
		System.out.print("Enter the boundary of the interval n = ");
		int n = scanner.nextInt();
		scanner.close();

		for (; m < n; m++) {
			System.out.print("Dividers for number " + m + ":");
			for (int i = 2; i < m; i++) {
				if (m % i == 0) {
					System.out.print(i + "\t");
				}
			}
			System.out.println();
		}
	}
}
