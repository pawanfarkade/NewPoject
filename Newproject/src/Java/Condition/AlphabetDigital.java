package Java.Condition;


import java.util.*;

public class AlphabetDigital {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		 System.out.println("Enter Number");
		 char ch= obj.next().charAt(0);
		 
		 
		 if(ch>='a'&& ch<='z'){
			 System.out.println("Char is Alphabet");
			 
		 }else if (ch>0 ||ch<0) {
			 System.out.println("Char is Number");
			 
		 } else {
			 System.out.println("invalid Char");
		 }
		 
		 
		 
		 
		
		 
		 
		 
	
	}
	
}