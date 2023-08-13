package patternProgramimg;

public class Pattern14 {
	public static void main(String[] args) {
		int n =5;
		for(int i = 1 ; i<=n ; i++)
		{
			for(int j= 1 ;j<=i ; j++)
			{
				System.out.print(i%2);
			}System.out.println();
		}
	}
}

/*
OUTPUT:-
		1
		00
		111
		0000
		11111
	
				*/
