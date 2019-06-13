import java.util.Scanner;

/* Заданы размеры А, В прямоугольного отверстия и
 размеры х, у, z кирпича.
  Определить, пройдет ли кирпич через отверстие. */

public class Task {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the dimension of the rectangular hole A = "); float a = scn.nextFloat();
        System.out.print("Enter the dimension of the rectangular hole B = "); float b = scn.nextFloat();
        System.out.print("Enter the dimension of the brick x(length) = "); float x = scn.nextFloat();
        System.out.print("Enter the dimension of the brick y(width) = "); float y = scn.nextFloat();
        System.out.print("Enter the dimension of the brick z(height) = "); float z = scn.nextFloat();
        if ((y < b && z < a) || (z < b && y < a) || (x < b && z < a))
             System.out.println(true);
        else System.out.println(false);
    }
}
