package by.epam.linePrograms.Task1;

import java.util.Scanner;

/* Найдите значение функции: z = ( (a – 3 ) * b / 2) + c. */

public class Task {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the values of a, b and c, correspondingly");
        float a = scn.nextFloat();
        float b = scn.nextFloat();
        float c = scn.nextFloat();
        System.out.println("result = " + compute(a, b, c));
    }

    public static float compute(float a, float b, float c){
        float result = ((a - 3) * b / 2) + c;
    return result;
    }
}
