package Oops;

public class Factor {
	
	
	public void solution(int n) {
		for (int i=1;i<=n;i++) 
		{
			if(n%i==0) {
				System.out.println(i+" ");
			}
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		Factor f= new Factor();
		f.solution(60);

	}

}
