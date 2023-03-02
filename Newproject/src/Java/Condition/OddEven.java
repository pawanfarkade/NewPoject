package Java.Condition;

import java.util.*;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		
		
		
		String ans=(num%2==0)?"Number is Even":"Number is Odd";
		System.out.println(ans);
		
		/*if (num%2==0) {
			
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}*/

	}

}
