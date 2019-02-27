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
		// Y-X의 차이만큼 D가 몇번을 더해져야 하는지 구하는 방향
		return (int)Math.ceil((Y-X)/ (double)D); //ceil 값 올림(소수)
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int D = scan.nextInt();
		
		System.out.println(solution(X,Y,D));
	}

}
