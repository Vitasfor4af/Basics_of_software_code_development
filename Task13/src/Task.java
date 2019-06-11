import java.util.Scanner;

public class Task {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the values of a, b and h");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int h = scn.nextInt();
        for (;a < b;a += h){
            System.out.print(func(a) + "\t");
         }
        }
    public static int func(int x){
        int result = -x;
        if(x > 2) result = x;
        return  result;
    }
        }


