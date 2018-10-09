package codeplus;

import java.util.Scanner;

public class baekjoon_6679 {

	/**
	 * ���� 6679 �̱��� ���ڸ� ����
	 * @param args
	 */
	public static void main(String[] args) {
		int max = 9999;
		int min = 1000;
		
		for(int i=min; i<=max; i++) {
			int num = i;
			
			String binary10 = Integer.toString(num, 10);
			String binary12 = Integer.toString(num, 12);
			String binary16 = Integer.toString(num, 16);
			
			// 10������ �հ� 12������ ���� ���� ��
			if(sum_10(binary10) == sum_12(binary12)) {
				// 12������ �հ� 16������ �յ� ������
				if(sum_12(binary12) == sum_16(binary16)) {
					System.out.println(num);					
				}
			}
		
		}

		
	}
	
	// 10������ ��ȯ�� num �� �޾Ƽ� ��� ���ϱ�
	static int sum_10(String num) {
		String numArr[] = num.split("");
		int sum = 0;
		for(int i=0; i<numArr.length; i++) {
			sum += Integer.parseInt(numArr[i]);
			
		}
		
		return sum;
		
	}

	// 12������ ��ȯ�� num�� �޾Ƽ� ��� ���ϱ� 
	// *���ǻ��� 12������ A,B(10,11) ���� ������ ó���������
	static int sum_12(String num) {
		String numArr[] = num.split("");
		int sum = 0;
		for(int i=0; i<numArr.length; i++) {
			int temp = 0;
			if(numArr[i].equalsIgnoreCase("a")) {
				temp = 10;
			}else if(numArr[i].equalsIgnoreCase("b")) {
				temp = 11;
			}else {
				temp = Integer.parseInt(numArr[i]);
			}
			sum += temp;
		}		
		
		return sum;
	}
	
	// 16������ ��ȯ�� num�� �޾Ƽ� ��� ���ϱ� 
	// *���ǻ��� 16������ A,B,C,D,E,F(10,11,12,13,14,15) ���� ������ ó���������
	static int sum_16(String num) {
		String numArr[] = num.split("");
		int sum = 0;
		for(int i=0; i<numArr.length; i++) {
			int temp = 0;
			if(numArr[i].equalsIgnoreCase("a")) {
				temp = 10;
			}else if(numArr[i].equalsIgnoreCase("b")) {
				temp = 11;
			}else if(numArr[i].equalsIgnoreCase("c")) {
				temp = 12;
			}else if(numArr[i].equalsIgnoreCase("d")) {
				temp = 13;
			}else if(numArr[i].equalsIgnoreCase("e")) {
				temp = 14;
			}else if(numArr[i].equalsIgnoreCase("f")) {
				temp = 15;
			}else {
				temp = Integer.parseInt(numArr[i]);
			}
			
			sum += temp;
		}
		
		return sum;
	}
}
