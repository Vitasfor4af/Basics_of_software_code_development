import java.util.Scanner;
import static java.lang.Math.*;

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the value of x");
        double x = scn.nextDouble();
        double result;
        if(x <= 3)
            result = pow(x,2) - 3 * x + 9;
        else
            result = 1 / (pow(x,3) + 6);
        System.out.println("result = " + result);
    }
}

