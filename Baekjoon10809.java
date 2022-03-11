package solve;

import java.util.*;

public class Baekjoon10809 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] checkStr = new int[26];
		String Str = input.next();
		
		for(int i=0; i<checkStr.length; i++) {
			checkStr[i] = -1;
		}
		
		for(int i=0; i<Str.length(); i++) {
			char ch = Str.charAt(i);
			if(checkStr[ch-'a'] == -1) {
				checkStr[ch-'a'] = i;
			}
		}
		
		for(int i=0; i<checkStr.length; i++) {
			System.out.print(checkStr[i]+" ");
		}
	}
}
