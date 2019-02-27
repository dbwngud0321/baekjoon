package codility;

import java.util.Scanner;

public class FrogJmp {

	public static int solution(int X, int Y, int D) {
		/*int jmp = 0;
		while(X < Y) {
			X += D;
			jmp++;
		}
		*/
//		return jmp;
		return (int)Math.ceil((Y-X)/ (double)D);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int D = scan.nextInt();
		
		System.out.println(solution(X,Y,D));
	}

}
