package Feb23;

public class First {

	public static void main(String[] args) {
	
		int i=1;
		int sum=0;
		for(;i<=10;i++) {
			boolean isprime=true;
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isprime=false;
					break;
			} 
		}
			if(isprime==true);
			
		} 
		      sum=sum+i;
		
		System.out.println(sum);
		
		
		
		
			
		 
	

	}

}
