package patternProgramimg;

public class Pattern3 {
	public static void main(String[] args) {
		int n = 5;
		for(int i =1;i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(j%2);
			}System.out.println();
		}
	}
}
/*
OUTPUT:-
		10101
		10101
		10101
		10101
		10101	*/