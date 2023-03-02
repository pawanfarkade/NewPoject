package Java.Condition;

import java.util.*;

public class LessthenGreaterthen {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num =sc.nextInt();
		
		
		String ans=(num<50 )?"Less Then 50":(num>100)?"Greater Than 100":"Invalide";
		System.out.println(ans);

	}

}
