//https://codeforces.com/problemset/problem/224/A
//Time Complexity: O(1)
//Author: Varun Gollapalli

import java.util.Scanner;
public class Parallelepiped {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int a  = (int) Math.sqrt((x*y)/z);
		int b  = (int) Math.sqrt((x*z)/y);
		int c  = (int) Math.sqrt((z*y)/x);
		
		int value = (a+b+c)*4;
		System.out.println(value);
	}

}
