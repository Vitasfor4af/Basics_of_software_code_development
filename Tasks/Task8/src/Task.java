import java.util.Scanner;
import static java.lang.Math.*;

/* Найти max{min(a, b), min(c, d)}. */

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the value of a,b,c,d, correspondingly");
        int b = scn.nextInt();
        int a = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();
        int result = max((min(a,b)),(min(c, d)));
        System.out.println("max = " + result);
    }
}
