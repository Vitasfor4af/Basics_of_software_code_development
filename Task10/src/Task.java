import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the dimensions of the rectangular hole(A,B) and the dimensions of the bricks(x,y,z)");
        float a = scn.nextFloat();
        float b = scn.nextFloat();
        float x = scn.nextFloat();
        float y = scn.nextFloat();
        float z = scn.nextFloat();
        if (((a < x) && (b < y)) || ((a < x) && (b < z)) || ((a < z) && (b < y)))
             System.out.println(true);
        else System.out.println(false);
    }
}
