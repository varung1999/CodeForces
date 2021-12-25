//https://codeforces.com/problemset/problem/272/A
//Time Complexity: O(N) where N is the number of friends
//Author: Varun Gollapalli

import java.util.Scanner;
public class DimaAndFriends {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num_friends = sc.nextInt();
		int total_fingers =0;
		for(int i =0;i<num_friends;i++)
		{
			total_fingers+=sc.nextInt();
		}

		int possibilities =0;
		for(int i =1;i<=5;i++)
		{
			int sum = total_fingers+i;
			sum=sum%(num_friends+1);
			
			if(sum%(num_friends+1)!=1)
			{
				
				possibilities++;
			}
		}
		System.out.println(possibilities);
	}

}
