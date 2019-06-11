import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int number = scn.nextInt();
        int result = 0;
        for (int i = 1; i < number; i++){
            result += i;
        }
        System.out.println(result);
    }
}
