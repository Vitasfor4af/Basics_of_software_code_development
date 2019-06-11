import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the boundaries of the gap (m,n)");
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
