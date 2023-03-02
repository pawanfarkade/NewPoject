package Java.Condition;

import java.util.*;

public class PositiveNegative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter The Number");
		int num =sc.nextInt();
       
	
		String ans=(num>0)?"Number is Positive":(num<0)?"number is negative":"Zero";
		
		System.out.println(ans);
		
	/*if(num>0) {
		
		System.out.println("Numbar is possitive");
	}
	 else if (num<0) {
		 
		System.out.println("Number is negative");
	} 
	 else {
		 
		System.out.println("number is zero");
	}*/
	 
		
	}

}
