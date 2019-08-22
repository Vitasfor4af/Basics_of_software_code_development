package by.epam.loops.task6;

import java.util.Scanner;

/* Вывести на экран соответствий между символами и их
 численными обозначениями в памяти компьютера. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int terminate = 0;
		int number;
		char character;

		while (terminate != 1) {
			System.out.println("Input code of symbol and symbol");

			number = scanner.nextInt();
			character = scanner.next().charAt(0);

			if (number == character) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}

			System.out.println("If you want to suspend input \"1\", else input \"0\"");

			terminate = scanner.nextInt();

			if (terminate < 0 || terminate > 1) {
				System.out.println("Unsupported key was pressed");
				System.exit(1);
			}
			if (terminate == 1) {
				scanner.close();
			}
		}
	}

}
