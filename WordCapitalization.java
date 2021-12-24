//https://codeforces.com/problemset/problem/281/A
//Time Complexity: O(1)
//Space Complexity: O(N)

import java.util.Scanner;
public class WordCapitalization {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String input = sc.next();
		if(Character.isUpperCase(input.charAt(0)))
		{
			System.out.println(input);
		}
		else
		{
			char c = input.charAt(0);
			StringBuffer sb = new StringBuffer();
			c = Character.toUpperCase(c);
			sb.append(c);
			sb.append(input.substring(1));
			System.out.println(sb.toString());
		}

	}

}
