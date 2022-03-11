package solve;

import java.util.*;

public class Baekjoon8958 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int testCase = input.nextInt();
		int sum = 0;
		
		String str[] = new String[testCase];
		int result[] = new int[testCase];
		for(int i=0; i<testCase; i++) {
			str[i] = input.next();
			sum = 0;
			for(int j=0; j<str[i].length(); j++) {
				if(str[i].charAt(j) == 'X') {
					sum = 0;
				} else if(str[i].charAt(j) == 'O'){
					sum += 1;
				}
				result[i] += sum;
			}
		}
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
