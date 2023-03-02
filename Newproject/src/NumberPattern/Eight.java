package NumberPattern;

public class Eight {

	public static void main(String[] args) {
		
		
		for(char i='A';i<='D';i++) 
		{
			for(char j='A';j<='D';j++) 
			{
				if(i=='A'||j=='A' ||j=='D' ||i=='D') {
				
					System.out.print(j);
			}else {
				System.out.print(" ");
			}
			
			}
		System.out.println();
		}
		
		
		}
	}


