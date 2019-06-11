import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String terminate = "";
        int number;
        char character;
        while(!(terminate.equals("stop"))){
            System.out.println("Input code of symbol and symbol");
            number = scn.nextInt();
            character = scn.next().charAt(0);
            if(number == character) System.out.println(true);
            else                    System.out.println(false);
            scn.nextLine();
            System.out.println("Do you want to suspend, input \"stop\"");
            terminate = scn.nextLine();
        }
    }

}
