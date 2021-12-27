//http://codeforces.com/problemset/problem/318/A
//Time Complexity: O(1)
//Author: Varun Gollapalli

import java.util.Scanner;
public class EvenOdds {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		long n = Long.parseLong(a);
		long k = Long.parseLong(b);
		
		long odd = (n+1)/2;
		long even = n/2;
		
		if(k<=odd)
		{
			System.out.println(k*2-1);
		}
		else
		{
			System.out.println((k-odd)*2);
		}
		

	}

}
