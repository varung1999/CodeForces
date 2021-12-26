//https://codeforces.com/problemset/problem/165/A
//Time Complexity: O(n^2)

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Exception;
public class SupercentralPoint {

	
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int n,i,j,count =0;
		n = sc.nextInt();
		int[] x_coord = new int[n];
		int[] y_coord = new int[n];
		
		for( i =0;i<n;i++)
		{
			x_coord[i]=sc.nextInt();
			y_coord[i]=sc.nextInt();
		}
		
		for(i =0;i<n;i++)
		{
			boolean up = false, down = false, left = false,right = false;
			
			for(j = 0;j<n;j++)
			{
				if(x_coord[i]>x_coord[j] && y_coord[i]==y_coord[j])
				{
					right = true;
				}
				if(x_coord[i]<x_coord[j] && y_coord[i]==y_coord[j])
				{
					left = true;
				}
				
				if(x_coord[i]==x_coord[j] && y_coord[i]<y_coord[j])
				{
					down = true;
				}
				if(x_coord[i]==x_coord[j] && y_coord[i]>y_coord[j])
				{
					up = true;
				}
			}
			if(up && down && left && right)
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		
		

	}

}
