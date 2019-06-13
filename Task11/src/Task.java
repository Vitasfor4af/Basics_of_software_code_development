import java.util.Scanner;
import static java.lang.Math.*;

/* Вычислить значение функции */

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the value of x");
        float x = scn.nextFloat();
        System.out.println("result = " + compute(x));
    }
    public static float compute(float x){
        float result = 0;
        if(x <= 3)
            result = (float)(pow(x,2) - 3 * x + 9);
        else
            result = (float) (1 / (pow(x,3) + 6));
        return result;
    }

}

