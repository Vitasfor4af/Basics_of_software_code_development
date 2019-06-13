
/* Найти сумму квадратов первых ста чисел. */

public class Task {
    public static void main(String[] args) {
        int result = 0;
       for (int i = 0; i <= 100; i++){
           result += func(i);
       }
        System.out.println("sum = " + result);

    }
    public static int func(int x)
    {
        return x * x;
    }
}
