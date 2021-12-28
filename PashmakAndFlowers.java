//http://codeforces.com/problemset/problem/459/B
//Time Complexity: O(n)


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PashmakAndFlowers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
			min = Math.min(num[i], min);
			max = Math.max(num[i],max);
		}
		
		int minCount =0,maxCount =0;
		
		for(int i =0;i<n;i++)
		{
			if(num[i]==min)
			{
				minCount++;
			}
			if(num[i]==max)
			{
				maxCount++;
			}
		}
		
		
		long ans = 0;
		
		if(max == min)
		{
			ans = n * 1L * (n-1)/2;
		}
		else
		{
			ans = minCount*1L*maxCount;
		}
		
		System.out.println((max-min)+" "+ans);
	}

}
