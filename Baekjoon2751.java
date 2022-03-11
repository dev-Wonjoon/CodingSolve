package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon2751 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		String sNum = input.readLine();
		int testNum = Integer.parseInt(sNum);
		int[] inArr = new int[testNum+1];
		
		for(int i=0; i<inArr.length-1; i++) {
			inArr[i] = Integer.parseInt(input.readLine());
		}
		
		
		
		for(int i=0; i<inArr.length-1; i++) {
			int j = i+1;
			if(inArr[i] != inArr[j]) System.out.println(inArr[i]);
		}
	}
	
	static int[] Sorting(int[] arr) {
		
		return arr;
	}
}
