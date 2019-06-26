import java.util.Scanner;
import static java.lang.Math.*;

/* Дано действительное число R вида nnn.ddd
 (три цифровых разряда в дробной и целой частях).
  Поменять местами дробную и целую части числа и вывести полученное значение числа. */

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the number in nnn.ddd format");
        float number = scn.nextFloat();
        float unit = (int)number;
        float remainder = (int)(round((number - unit) * 1000));
        float result = remainder + (unit / 1000);
        System.out.println(result);
    }
}