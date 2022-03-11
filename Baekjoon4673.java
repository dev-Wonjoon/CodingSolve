package solve;

public class Baekjoon4673 {
	public static void main(String[] args) {
		boolean arr[] = new boolean[10001];
		
		for(int i=1; i<=10000; i++) {
			int idx = d(i);
			
			if(idx < 10000) {
				arr[idx] = true;
			}
		}
		
		for(int i=1; i<10000; i++) {
			if(arr[i] == false) {
				System.out.println(i);
			}
		}
	}

	static int d(int n) {
		int sum = n;
		while(n != 0) {
			sum += n % 10;
			n /= 10;
		}


		return sum;
	}
}
