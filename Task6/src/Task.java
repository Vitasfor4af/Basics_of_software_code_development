import java.util.Scanner;

public class Task {
    static final int oX = 0;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input the coordinate of x = ");   int x = scn.nextInt();
        System.out.print("Input the coordinate of y = ");   int y = scn.nextInt();
        if((x >= -4 && x <= 4) && (y >= -3) && y < oX) System.out.println(true);
        else
        if((x <= 2 && x >= -2) && (y <= 4) && y > oX) System.out.println(true);
        else System.out.println(false);
    }
}
