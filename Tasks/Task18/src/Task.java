import java.util.Scanner;

/* Для каждого натурального числа в промежутке от m до n
 вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры. */

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the boundaries of the interval (m,n), correspondingly");
        int m = scn.nextInt();
        int n = scn.nextInt();
        for (;m < n; m++){
            System.out.print("Dividers for number " + m + ":");
            for (int i = 2; i < m; i++){
                if(m % i == 0) System.out.print(i + "\t");
            }
            System.out.println();
        }


    }
}
