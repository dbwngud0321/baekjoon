package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IF_Else {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//    	1 <= N <=100
        int N = scanner.nextInt();
        String result = "";
        if(N%2!=0){
        	result = "Weird";
        } else if(N%2==0 && N>=2 && N<=5){
        	result = "Not Weird";
        } else if(N%2==0 && N>=6 && N<=20) {
        	result = "Weird";
        } else if(N%2==0 && N>20) {
        	result = "Not Weird";
        }
        
        System.out.println(result);
        scanner.close();
    }
}
