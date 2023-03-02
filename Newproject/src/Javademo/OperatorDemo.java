package Javademo;

public class OperatorDemo {

	public static void main(String[] args) {
		int a=2;
		int b=2;
		
		
		int x=++a + b++;
		System.out.println(x+" "+a+" "+b);
		
		x= --b + a++ + a;
		System.out.println(x+" "+a+" "+b);
		
		x=a-- - --b;
		System.out.println(x+" "+a+" "+b);
		
		x=a++ + ++b + a;
		System.out.println(x+" "+a+" "+b);
		 
		x=a-- - --b - --a;
		System.out.println(x+" "+a+" "+b);
		
			
		// TODO Auto-generated method stub

	}

}
