package solve;

import java.util.*;

public class Baekjoon1003 {
	static long arr[];
	static int getNum[] = new int[2];
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		arr = new long[N+1];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		if(N == 0) arr[0] = 0;
		else {
			arr[0] = 0;
			arr[1] = 1;
		}
		
		if(Fib(N) == 0) getNum[0]++;
		if(Fib(N) == 1) getNum[1]++;
		
		System.out.println(getNum[0]+" "+getNum[1]);
		
	}
	static long Fib(int n) {
		if(arr[n] == -1) {
			arr[n] = Fib(n-1) + Fib(n-2);
		}
		
		return arr[n];
	}
	
}
