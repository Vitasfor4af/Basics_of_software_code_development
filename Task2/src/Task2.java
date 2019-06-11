
import static java.lang.Math.*;
import java.util.Scanner;

// Найти значение функции

public class Task2 {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the values of a, b and c");
        double  a = scn.nextDouble();
        double  b = scn.nextDouble();
        double  c = scn.nextDouble();
        double z = ((b + sqrt(pow(b,2) + 4 * a * c))/(2 * a)) - pow(a, 3) * c + pow(b, -2);
        System.out.println("result = " + z);

    }
}
