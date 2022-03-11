package solve;

import java.util.*;

public class Baekjoon4344 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int arr[];
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			int student = input.nextInt();
			arr = new int[student];
			double sum = 0;
			
			for(int j=0; j<arr.length; j++) {
				arr[j] = input.nextInt();
				sum += arr[j];
			}
			double mean = (sum / student);
			double cnt = 0;
			
			for(int j=0; j<arr.length; j++) {
				if(arr[j] > mean) {
					cnt++;
				}
			}
			
			
			System.out.printf("%.3f%%\n",(cnt/student)*100);
		}
	}
	
}
