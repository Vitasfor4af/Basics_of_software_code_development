package by.epam.linePrograms.Task5;

import java.util.Scanner;

/* Дано натуральное число Т,
 которое представляет длительность прошедшего времени в секундах.
  Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc. */

public class Task {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the value of T = ");
		int T = scanner.nextInt();
		scanner.close();
		int hours = T / 3600;
		int minutes = (T - hours * 3600) / 60;
		int seconds = T - (hours * 3600 + minutes * 60);
		System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);

	}

}
