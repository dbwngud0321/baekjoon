package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fizzBuzz(15);
	}

	public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for(int i=1; i<=n; i++){
        	if(i%3==0 && i%5!=0){
        		list.add("Fizz");
        	} else if(i%5==0 && i%3!=0){
        		list.add("Buzz");
        	} else if(i%3==0 && i%5==0){
        		list.add("FizzBuzz");
        	} else {
        		list.add(String.valueOf(i));	
        	}
        }
        
        for(String i: list){
        	System.out.println(i);
        }
        return list;
    }
}
