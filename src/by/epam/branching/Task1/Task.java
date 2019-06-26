package by.epam.branching.Task1;

import java.util.Scanner;

/* Даны два угла треугольника (в градусах).
 Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным. */

public class Task {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the two corners(A,B) of the triangle, correspondingly:");
        int cornerA = scn.nextInt();
        int cornerB = scn.nextInt();
        if(cornerA + cornerB < 180)
        {
            System.out.println("Exists");
            if(cornerA + cornerB == 90 || cornerA == 90 || cornerB == 90)
                 System.out.println("the triangle is rectangular.");
            else System.out.println("the triangle is not rectangular.");
        }
        else System.out.println("Does not exist");
    }
}
