package codility;

import java.util.Scanner;

public class BinaryGap {

	public static int solution(int N) {
		int temp = 0;
		int max = 0;
		String str = Integer.toBinaryString(N);
		char[] arr = str.toCharArray();
		for(char i : arr){
			if(i == '1'){
				if(temp >= max) {
					max = temp;
					temp = 0;
				} else {
					temp = 0;
				}
			}else {
				temp +=1;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println(solution(N));
	}

}
