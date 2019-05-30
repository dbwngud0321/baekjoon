package leetcode;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
	}
	
	public static void reverseString(char[] s) {
		
		for(int i=0; i<s.length/2; i++){
			char temp = s[i];
			s[i] = s[s.length-i-1];
			s[s.length-i-1] = temp;
		}
		
		for(char i: s){
			System.out.println(i);
		}
    }
}
