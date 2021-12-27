//http://codeforces.com/problemset/problem/34/A
//Time Complexity: O(n)
//Author: Varun Gollapalli


import java.util.Scanner;
public class Reconnaissance2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==2)
		{
			System.out.print(1+" "+2);
		}
		else
		{
			int arr[] = new int[n];
			
			for(int i =0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			int i =0;
			int difference = Math.abs(arr[i]-arr[n-1]);
			int current_index = n;
			int next_index = 1;
			
			for(i=0;i<n-1;i++)
			{
				if(Math.abs(arr[i]-arr[i+1])<difference)
				{
					//System.out.println(arr[i-1]+" "+arr[i]+" "+difference);
					current_index = i+1;
					next_index = i+2;
					difference = Math.abs(arr[i]-arr[i+1]);
				}
			}
			
			int ans[] = new int[2];
			ans[0]=current_index;
			ans[1] = next_index;
			
			System.out.println(ans[0]+" "+ans[1]);
			
		}

	}

}
