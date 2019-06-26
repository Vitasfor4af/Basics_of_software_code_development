package by.epam.loops.Task1;

import java.util.Scanner;

/* Напишите программу,
 где пользователь вводит любое целое положительное число.
  А программа суммирует
все числа от 1 до введенного пользователем числа. */

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int number = scn.nextInt();
        System.out.println(compute(number));
    }

    public static int compute(int num){
        int result = 0;
        for (int i = 1; i < num; i++){
            result += i;
        }
        return result;
    }
}
