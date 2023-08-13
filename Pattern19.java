package patternProgramimg;

public class Pattern19 {
	public static void main(String[] args) {
		int n =5;
		for(int i=n;i>=1; i--)
		{
			for(int j=n ;j>=i; j--)
			{
				System.out.print((char)(96+j)+"");
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