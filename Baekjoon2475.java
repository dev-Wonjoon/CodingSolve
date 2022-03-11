package solve;

import java.util.*;

public class Baekjoon2475 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] verifiNum = new int[6];
		int temp = 0;
		
		for(int i=0; i<verifiNum.length-1; i++) {
			verifiNum[i] = input.nextInt();
			
			verifiNum[i] *= verifiNum[i];
			temp += verifiNum[i];
		}
		verifiNum[verifiNum.length-1] = temp % 10;
		
		System.out.println(verifiNum[5]);
	}
}
