package solve;

import java.util.*;

public class Baekjoon2675 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int testCase = input.nextInt();
		for(int i=0; i<testCase; i++) {
			int repeat = input.nextInt();
			String str = input.next();
			
			for(int j=0; j<str.length(); j++) {
				for(int tt=0; tt<repeat; tt++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
		
	}
}
