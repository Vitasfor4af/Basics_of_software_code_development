package by.epam.loops.Task4;

import java.math.BigInteger;

/* Составить программу нахождения произведения квадратов первых двухсот чисел. */

public class Task {

	public static void main(String[] args) {
		BigInteger result = new BigInteger("1");
		for (BigInteger i = BigInteger.valueOf(1); !(i.equals(BigInteger.valueOf(200))); i = i
				.add(BigInteger.valueOf(1))) {
			result = result.multiply(i.multiply(i));
		}
		System.out.println("mul = " + result);
	}
}
