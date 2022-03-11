package solve;

import java.util.*;

public class Baekjoon2839 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sugarBag = input.nextInt();
		int cnt = 0;

		if(sugarBag == 4 || sugarBag == 7) {
			cnt = -1;
		}
		
		if(sugarBag % 5 == 0) {
			cnt = sugarBag / 5;
		}
		
		if(sugarBag % 5 == 2) {
			cnt += sugarBag / 5;
			sugarBag /= 5;
		}
		
		System.out.println(cnt);
	}
}

