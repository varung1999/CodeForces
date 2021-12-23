//http://codeforces.com/problemset/problem/271/A

import java.util.Scanner;
public class BeautifulYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		
		for(int i = 1000;i<=9000;i++)
		{
			inp = String.valueOf(Integer.parseInt(inp)+1);
			 if(inp.charAt(0)!=inp.charAt(1) && inp.charAt(0)!=inp.charAt(2)
		               && inp.charAt(0)!=inp.charAt(3) && inp.charAt(1)!=inp.charAt(2)
		               && inp.charAt(1)!=inp.charAt(3) && inp.charAt(2)!=inp.charAt(3))
		                break;
			
		}
		System.out.println(inp);

	}

}
