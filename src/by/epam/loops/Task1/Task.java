package by.epam.loops.Task1;

import java.util.Scanner;

/* Напишите программу,
 где пользователь вводит любое целое положительное число.
  А программа суммирует
все числа от 1 до введенного пользователем числа. */

public class Task {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer = ");
		int number = scanner.nextInt();
		scanner.close();
		int result = 0;
		for (int i = 1; i < number; i++) {
			result += i;
		}
		System.out.println(result);
	}
}
