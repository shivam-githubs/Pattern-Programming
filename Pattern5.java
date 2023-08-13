package patternProgramimg;

public class Pattern5 {
	public static void main(String[] args) {
		int n = 5; int k=1; 
		for(int i =1;i<=n; i++)
		{
			
			for(int j=1; j<=n; j++)
			{
				if(k%2==0) {
					System.out.print("0");
					
				}
				else
					System.out.print("1");
				k++;	
			}System.out.println();
		}
	}
}
/*
OUTPUT:-
		10101
		01010
		10101
		01010
		10101
				*/

