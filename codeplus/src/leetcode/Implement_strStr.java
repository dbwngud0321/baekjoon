package leetcode;

public class Implement_strStr {

	public static void main(String[] args) {

	}

	public static int strStr(String haystack, String needle) {
		if(!haystack.contains(needle))
			return -1;
		
       	int result = haystack.indexOf(needle);
        
        return result;
    }
}
