package Java.Condition;

import java.util.*;

public class drivingLicence {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Age");
		int age =sc.nextInt();
		
		System.out.println("You Have Adhar Card");
		char ch=sc.next().charAt(0);
		
		
		if (age>18 && (ch>'y'|| ch>'n')) {
				
				System.out.println("Eligible For Driving Licence");
		
		}
		else {
			System.out.println("Not Eligible For Driving Licence");
			
		}
			}
	}

	
