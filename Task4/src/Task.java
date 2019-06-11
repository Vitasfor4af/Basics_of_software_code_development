import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the number in nnn.ddd format");
        float number = scn.nextFloat();
        String numberAsString = String.valueOf(number);
        int indexOfDecimal = numberAsString.indexOf(".");
        String integerPart = numberAsString.substring(0, indexOfDecimal);
        String decimalPart = numberAsString.substring(indexOfDecimal + 1);
        String result = new String(decimalPart + "." + integerPart);
        System.out.println(result);
    }
}
