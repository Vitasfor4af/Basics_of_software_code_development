
import static java.lang.Math.*;
import java.util.Scanner;

// Найти значение функции

public class Task {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the values of a, b and c");
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double c = scn.nextDouble();
        double z = ((a - 3) * b / 2) + c;
        System.out.println("result = " + z);
    }
}
