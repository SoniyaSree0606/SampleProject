package SampleCalc;

import java.util.*;
class Solution{
	//int c;
	static int B,H;
	static boolean flag= true;
	
   
    	 public static void main(String[] args) {
    	        Scanner sc = new Scanner(System.in);
    	        B = sc.nextInt();
    	        H = sc.nextInt();
    	        if(B<=0 || H<=0) {
    	        	System.out.println("");
    	        	flag = false;
    	        }
    	        else {
    	        	int area = B*H;
    	        	System.out.println(area);
    	        }
    	        
    	       



    }


}