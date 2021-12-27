//http://codeforces.com/problemset/problem/139/A
//Time Complexity: O(n)
//Author: Varun Gollapalli

import java.util.Scanner;
public class PetrAndBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int days[] = new int[7];
		for(int i =0;i<days.length;i++)
		{
			days[i]=sc.nextInt();
		}
		
		int i =0;
		while(n>0)
		{
			n = n - days[i];
			i++;
			
			if(i==7 && n>0)
			{
				i=0;
			}
		}
		
		System.out.println(i);

	}

}
