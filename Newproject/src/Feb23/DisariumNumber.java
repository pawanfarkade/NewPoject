package Feb23;
import java.util.*;

public class DisariumNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();

		int sum=0;
		int p=0;
		for(int i=0;i<=n;i++) {
			
			int digit=n%10;
			
			int power=1;
			for(int j=1;j<=digit;j++) {
				power=power*j;
			
				sum=sum+power;
			}
		  
			System.out.println(sum);
			}
	  
		
		
	}

}
