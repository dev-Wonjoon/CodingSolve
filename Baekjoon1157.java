package solve;

import java.util.*;

public class Baekjoon1157 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String str = input.next();
		int[] check = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				check[str.charAt(i)-65]++;
			}
			else if('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
				check[str.charAt(i)-97]++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i=0; i<check.length; i++) {
			if(check[i] > max) {
				max = check[i];
				ch = (char) (i + 65);
			}
			else if(max == check[i]){
				ch = '?';
			}
		}
		
		System.out.println(ch);
	}
}
