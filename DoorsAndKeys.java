import java.util.*;
public class DoorsAndKeys {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--!=0)
		{
			String inp = sc.next();
			
			
			boolean r = false,g=false,b = false,flag = true;
			
			for(int i =0;i<inp.length();i++)
			{
				if(inp.charAt(i)=='r')
				{
					r= true;
				}
				else if(inp.charAt(i)=='g')
				{
					g= true;
				}
				else if(inp.charAt(i)=='b')
				{
					b= true;
				}
				
				else if(inp.charAt(i)=='R' && r==true)
				{
					continue;
				}
				else if(inp.charAt(i)=='G' && g==true)
				{
					continue;
				}
				else if(inp.charAt(i)=='B' && b==true)
				{
					continue;
				}
				else
				{
					flag = false;
					break;
				}
			}
			
			if(flag)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}

	}

}

