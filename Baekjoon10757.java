package solve;

import java.math.*;
import java.util.*;

public class Baekjoon10757 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger bI1;
		BigInteger bI2;
		
		String num1 = input.next();
		String num2 = input.next();
		
		bI1 = new BigInteger(num1);
		bI2 = new BigInteger(num2);
		
		System.out.println(bI1.add(bI2));
	}
}
