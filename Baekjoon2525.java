package solve;

import java.util.Scanner;

public class Baekjoon2525 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int hour = input.nextInt();
		int minute = input.nextInt();
		int res = input.nextInt();
		
		minute += res;
		
		if(minute >= 60) {
			int temp = minute / 60;
			minute %= 60;
			hour += temp;
		}
		
		if(hour >= 24) {
			int temp = hour % 24;
			hour = 0; hour += temp;
		}
		System.out.println(hour+" "+minute);
	}

}
