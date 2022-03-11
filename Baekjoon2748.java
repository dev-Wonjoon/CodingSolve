package solve;

import java.util.*;



public class Baekjoon2748 {
	
	static long[] arr;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		arr = new long[N+1];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		if(N <= 0) arr[0] = 0;
		else {
			arr[0] = 0;
			arr[1] = 1;
		}
		
		
		System.out.println(Fib(N));
	}
	
	static long Fib(int N) {
		if(arr[N] == -1) {
			arr[N] = Fib(N - 1) + Fib(N - 2);
		}
		
		return arr[N];
	}
}
