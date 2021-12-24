//http://codeforces.com/problemset/problem/59/A
//Time Complexity: O(n) where n is the length of the string
//Author: Varun Gollapalli

import java.util.Scanner;
public class Word {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int lc=0,uc=0;
		String input = sc.next();
		
		for(int i =0;i<input.length();i++)
		{
			char current = input.charAt(i);
			if(Character.isUpperCase(current))
			{
				uc++;
			}
			else
			{
				lc++;
			}
		}
		
		if(uc>lc)
		{
			System.out.println(input.toUpperCase());
		}
		else
		{
			System.out.println(input.toLowerCase());
		}

	}

}
