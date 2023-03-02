package Java.Condition;

import java.util.*;

public class DivisionNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		
		int num =sc.nextInt();
		
    String ans=(num%9==0)?"Number is Divisible by 9":(num%3==0)?"Number is Divisible by 3":"Wrong";
   
    System.out.println(ans);
    
    
		
		
		/*String result1 = (num%3==0)?"Number is Divisible By 3":"Not Divisible by3";
		
		System.out.println(result1);
               
		String result2 = (num%9==0)?"Number is Divisiblr By 9":"Not Divisible by 9";
		
		System.out.println(result2);
		
		
		
		if (num%9==0) {
			System.out.println("Number is Divisible by 9");
		}
		else {
			System.out.println("Not Divisible by 9");
		}
		if (num%3==0) {
			
			System.out.println("Number is divisible by 3");
			
		} else {
			System.out.println("Not Didvisible by 3");
		} */
		
	}

}
