import java.math.BigInteger;

/* Составить программу нахождения произведения квадратов первых двухсот чисел. */

public class Task {
    public static void main(String[] args) {
        BigInteger result = new BigInteger("1");
        for (BigInteger i = BigInteger.valueOf(1); !(i.equals(BigInteger.valueOf(200)));i = i.add(BigInteger.valueOf(1))){
            result = result.multiply(func(i));
        }
        System.out.println("mul = " + result);

    }
    public static BigInteger func(BigInteger x)
    {
        return x.multiply(x);
    }
}
