import java.util.Scanner;
import static java.lang.Math.*;

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the values of e and n, correspondingly");
        int e = scn.nextInt();
        int n = scn.nextInt();
        float a;
        int sum = 0;
    for (int i = 0; i <= n; i++){
             a =(float) (1/pow(2, i) + 1/pow(3, i));
             if(abs(a) >= e)
                 sum += a;
        }
        System.out.println("sum = " + sum);
    }


}
