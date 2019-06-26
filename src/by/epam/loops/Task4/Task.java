import java.util.Scanner;
import static java.lang.Math.*;

/* Даны числовой ряд и некоторое число е.
 Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид: */

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input the values of e = "); float e = scn.nextFloat();
        System.out.print("Input the values of n = "); float n = scn.nextFloat();
        float a;
        int sum = 0;
    for (int i = 0; i <= n; i++){
             a = computeMember(i);
             if(abs(a) >= e)
                 sum += a;
        }
        System.out.println("sum = " + sum);
    }

    public static float computeMember(int i){
       return (float) (1/pow(2, i) + 1/pow(3, i));
    }


}
