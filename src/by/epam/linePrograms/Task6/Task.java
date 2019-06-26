package by.epam.linePrograms.Task6;

import java.util.Scanner;

/* Для данной области составить линейную программу,
 которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the coordinate of x = ");
		int x = scanner.nextInt();
		System.out.print("Input the coordinate of y = ");
		int y = scanner.nextInt();
		scanner.close();
		boolean result = ((x >= -4 && x <= 4) && (y >= -3 && y <= 0) || ((x >= -2 && x <= 2) && (y >= 0 && y <= 4)));
		System.out.println(result);
	}

}
