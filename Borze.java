//http://codeforces.com/problemset/problem/32/B
//Time Complexity: O(n) where n is the length of the string

import java.util.Scanner;
public class Borze {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		StringBuffer output = new StringBuffer();
		int i = 0;
		while(i<input.length())
		{
			if(input.charAt(i)=='.')
			{
				output.append(0);
				i++;
			}
			else if(input.charAt(i)=='-' &&  input.charAt(i+1)=='.')
			{
				output.append(1);
				i+=2;
			}
			else if(input.charAt(i)=='-' && input.charAt(i)=='-')
			{
				output.append(2);
				i+=2;
			}
		}
		
		System.out.println(output.toString());

	}

}
