package by.epam.linePrograms.task4;

import java.util.Scanner;
import static java.lang.Math.round;

/* Дано действительное число R вида nnn.ddd
 (три цифровых разряда в дробной и целой частях).
  Поменять местами дробную и целую части числа и вывести полученное значение числа. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the number in nnn.ddd format");
		double number = scanner.nextDouble();
		scanner.close();
		
		double unit = (int) number;
		double remainder = (int) (round((number - unit) * 1000));
		
		double result = remainder + (unit / 1000);
		System.out.println(result);
	}
}
