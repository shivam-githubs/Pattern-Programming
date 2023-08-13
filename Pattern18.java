package patternProgramimg;

public class Pattern18 {
	public static void main(String[] args) {
		int n=5;
		for(int i =1 ;i<=n ; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(j+96)+"");
			}System.out.println();
		}
	}

}

/*
OUTPUT:-
		a
		ab
		abc
		abcd
		abcde
				*/