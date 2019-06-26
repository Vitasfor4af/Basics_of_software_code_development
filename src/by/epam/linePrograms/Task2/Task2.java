package by.epam.linePrograms.task2;

import static java.lang.Math.*;

import java.util.Scanner;

/* Вычислить значение выражения по формуле
 (все переменные принимают действительные значения) */

public class Task2 {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the values of a, b and c, correspondingly");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        float result = 0;
        double squareRoot = sqrt(pow(b, 2) + 4 * a * c);
        if (a == 0 && squareRoot < 0) {
            System.out.println("invalid data");
        } else {
            result = (float) (((b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a)) - pow(a, 3) * c + pow(b, -2));
        }
        System.out.println("result = " + result);
    }
}
