//http://codeforces.com/problemset/problem/205/A
//Time Complexity:O(n)
//Author: Varun Gollapalli

import java.util.Scanner;
import java.util.HashSet;
public class LittleElephantAndRozdil {
	
	public static void helper()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		int index =0;
		int count = 0;
		for(int i =0;i<n;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
				index = i;
			}
		}
		
		for(int i =0;i<n;i++)
		{
			if(arr[i]==min)
			{
				count++;
			}
		}
		
		if(count==1)
		{
			System.out.println(index+1);
		}
		else
		{
			System.out.println("Still Rozdil");
		}
		
	}

	public static void main(String[] args) {
		
		helper();
	}

}
