package Swich;

import java.util.*;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();   
        
		  
		
	    int ans=num%2;  
	       
		switch (ans) { 
		case 1:System.out.println("its odd number =");
		break;
		default:System.out.println("Its even number");}
		
		
		

	}

}
