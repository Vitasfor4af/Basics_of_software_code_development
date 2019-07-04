package by.epam.loops.Task8;

import java.util.Scanner;
import static java.lang.Math.abs;

/* Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. */

public class Task {
	public static void main(String[] args) {
		System.out.println("Input the values for num1 and num2");
		Scanner scanner = new Scanner(System.in);
		int num1 = abs(scanner.nextInt());
		int num2 = abs(scanner.nextInt());
		scanner.close();
		for (int num1Copy = num1, digit = num1Copy % 10; num1Copy != 0; num1Copy /= 10, digit = num1Copy % 10) {
			boolean isPresence = false;
			int presenceNumberCopy = num2;

			while (presenceNumberCopy != 0) {
				if (digit == presenceNumberCopy % 10) {
					isPresence = true;
					break;
				}
				presenceNumberCopy /= 10;
			}

			int firstNumberDigitCounter = 0;
			int digitCountFirstNumberCopy = num1;

			while (digitCountFirstNumberCopy != 0) {
				if (digit == digitCountFirstNumberCopy % 10) {
					firstNumberDigitCounter++;
				}
				digitCountFirstNumberCopy /= 10;
			}

			int secondNumberDigitCounter = 0;
			int digitCountSecondNumberCopy = num1Copy;

			while (digitCountSecondNumberCopy != 0) {
				if (digit == digitCountSecondNumberCopy % 10) {
					secondNumberDigitCounter++;
				}
				digitCountSecondNumberCopy /= 10;
			}

			if (isPresence && (firstNumberDigitCounter == secondNumberDigitCounter)) {
				System.out.println(digit + "\t");
			}
		}
	}
}
