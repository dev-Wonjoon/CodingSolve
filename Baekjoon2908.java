package solve;

import java.util.*;

public class Baekjoon2908 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		if(A > B) System.out.println(A);
		else if(B > A) System.out.println(B);
	}
}
