package by.epam.loops.task3;

/* Найти сумму квадратов первых ста чисел. */

public class Task {

	public static void main(String[] args) {
		int result = 0;
		for (int i = 0; i <= 100; i++) {
			result += (i * i);
		}

		System.out.println("sum = " + result);
	}
}
