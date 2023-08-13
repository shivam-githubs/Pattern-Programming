package patternProgramimg;

public class Pattern20 {
	public static void main(String[] args) {
		int n =5;
		for(int i=1;i<=n; i++)
		{
			for(int j=1 ;j<=i; j++)
			{
				if(i==1 || j==1 || j==i || i==5)
				{
					System.out.print("*");
				}
				else
					System.out.print("#");
			}System.out.println();
		}
	}
	
}

/*
OUTPUT:-
		e
		ed
		edc
		edcb
		edcba
 				*/