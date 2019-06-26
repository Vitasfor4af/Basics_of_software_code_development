import java.util.Scanner;
import static java.lang.Math.*;

/* Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. */

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the values for num1 and num2");
       int num1 = abs(scn.nextInt());
       int num2 = abs(scn.nextInt());
        for(int num1Copy = num1,digit = num1Copy % 10; num1Copy != 0; num1Copy /= 10, digit = num1Copy % 10){
            if(getDigitPresence(num2,digit) && (digitCount(num1,digit) == digitCount(num1Copy,digit))){
                System.out.println(digit + "\t");
            }
        }
    }

    public static boolean getDigitPresence(int number,int digit)
    {
        boolean result = false;
        while (number != 0){
            if (digit == number % 10){
                result = true;
                break;
            }
            number /= 10;
        }
        return result;
    }

    public static int digitCount(int number, int digit){
        int count = 0;
        while (number != 0){
            if (digit == number % 10){
                count++;
            }
            number /= 10;
        }

        return count;
    }

}
