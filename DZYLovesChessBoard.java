//https://codeforces.com/problemset/problem/445/A

import java.util.Scanner;
public class DZYLovesChessboard {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
	
		for(int i=0;i<n;i++)
		{
			String s = sc.next();
			
			for(int j =0;j<m;j++)
			{
				System.out.print(s.charAt(j)== '.' ? ((i+j)%2==0 ? 'B':'W'):'-');
			}
			System.out.println();
		}

	}

}
