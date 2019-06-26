package by.epam.linePrograms.Task3;

import static java.lang.Math.*;
import java.util.Scanner;

/* Вычислить значение выражения по формуле
 (все переменные принимают действительные значения) */

public class Task3 {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the values of x and y, correspondingly");
        int  x = scn.nextInt();
        int  y = scn.nextInt();
        System.out.println("result = " + compute(x, y));
    }

    public static float compute(int x, int y){
    float z = 0;
        if ((cos(x) - sin(y)) == 0) System.out.println("invalid data");
        else z = (float)(((sin(x) + cos(y))/(cos(x) - sin(y))) * tan(x * y));
    return z;
    }

}
