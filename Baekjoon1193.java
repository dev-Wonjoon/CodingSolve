package solve;

import java.util.*;

public class Baekjoon1193 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int sum = 0;
		int denominator = 0, numerator = 0;
		
		for(int i=0; i<4472; i++) {
			sum += (i+1);
			
			if(sum >= n) {
				int sum_befo = sum - (i - 1);
				denominator = n - sum_befo; // 입력값 - 전 sum값 (입력값이 몇번째 위치인지 확인용)
				
			}
		}
	}
}
