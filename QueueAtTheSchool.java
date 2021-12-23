//http://codeforces.com/problemset/problem/266/B
//author: Varun Gollapalli
//Time Complexity: O(n*t) Where n = is the number of children in the line and T is the time after which the queue will transform

import java.util.Scanner;
public class QueueAtTheSchool {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int t = sc.nextInt();
		String input = sc.next();
		
		char[] arr = input.toCharArray();
		
		int i=1;
		
		while(i<arr.length && t!=0)
		{
			boolean swap = false;
			if(arr[i]=='G' && arr[i-1]=='B')
			{
				char temp = arr[i];
				arr[i]=arr[i-1];
				arr[i-1]= temp;
				swap = true;
			}
			if(swap == true)
			{
				i+=2;
			}
			else if(swap == false)
			{
				i++;
			}
			
			if(i>=arr.length)
			{
				i=1;
				t--;
			}
		}
		
		String ans = String.valueOf(arr);
		System.out.println(ans);
		

	}

}
