import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input the value of T = ");  int T = scn.nextInt();
        int hours = T / 3600;
        int minutes = (T - hours * 3600)/60;
        int seconds = T - (hours * 3600 + minutes * 60);
        System.out.printf("%02d:%02d:%02d",hours,minutes,seconds);

    }

}
