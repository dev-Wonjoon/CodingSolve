package solve;

import java.util.*;

public class Baekjoon2480 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int first = input.nextInt();
		int second = input.nextInt();
		int third = input.nextInt();
		
		if(first == second && first == third) {
			System.out.println((10000+first*1000));
		}
		else if(first == second || first == third) {
			System.out.println(1000+first*100);
		}
		else if(second == third) {
			System.out.println(1000+second*100);
		}
		else {
			System.out.println(Math.max(first, Math.max(third, second))*100);
		}
	}
}
