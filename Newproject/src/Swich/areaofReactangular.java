package Swich;

import java.util.*;

public class areaofReactangular {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("First volue");
		int num1=sc.nextInt();
		System.out.println("Secound volue");
		int num2=sc.nextInt();
		System.out.println("Enter the Operation form floowoing menu");
		System.out.println("+.Ractangular \t  -.Circle \t *.Triagle \t  /.Square ");
        char obj=sc.next().charAt(0);
        
       switch (obj) {
       case '+':System.out.println("Area of ractangular is ="+num1*num2);
       break;
       case '-':System.out.println("Area of circle is ="+3.14*num1*num1);
       break;
       case '*':System.out.println("Area of triangle is ="+0.5*(num1*num2));
       break;
       case '/':System.out.println("Area of square is ="+(num1*num1));
       break;
       default :System.out.println("Invalid operation");
      
       }
	
	
	}
	

}
