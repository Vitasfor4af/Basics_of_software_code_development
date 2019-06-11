
import static java.lang.Math.*;
import java.util.Scanner;

// Найти значение функции

public class Task3 {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the values of x and y");
        double  x = scn.nextDouble();
        double  y = scn.nextDouble();
        double z = ((sin(x) + cos(y))/(cos(x) - sin(y))) * tan(x * y);
        System.out.println("result = " + z);
    }
}
