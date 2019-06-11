import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the coordinates of three points (x,y)");
        int x1 = scn.nextInt();
        int y1 = scn.nextInt();
        int x2 = scn.nextInt();
        int y2 = scn.nextInt();
        int x3 = scn.nextInt();
        int y3 = scn.nextInt();
        if ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0)
            System.out.println("Точки лежат на 1 прямой");
        else
            System.out.println("Точки не лежат на 1 прямой");
    }
}
