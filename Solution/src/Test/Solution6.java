package Test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution6 {

    // Complete the staircase function below.
    static void staircase(int n) {
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			if(i<(n-1)-j){
    				System.out.print(" ");
    			}else{
    				System.out.print("#");
    			}
    		}
    		System.out.println("");
    	}
    }

   // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       // int n = scanner.nextInt();
     //   scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(10);

        //scanner.close();
    }
}