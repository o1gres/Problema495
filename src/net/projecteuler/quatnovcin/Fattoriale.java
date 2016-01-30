package net.projecteuler.quatnovcin;

import java.math.BigInteger;

public class Fattoriale {
	
	public static BigInteger factorial(BigInteger value) {
	    BigInteger total = BigInteger.ONE;
	    for (int i = 0; value.compareTo(BigInteger.ONE) == 1; i++) {
	        total = total.multiply(value);
	        value = value.subtract(BigInteger.ONE);
	    }
	    return total;
	}
}
