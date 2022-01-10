import java.util.*;
public class MakeAP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i =0;i<t;i++)
		{
			int a  = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if((a+c)%(2*b)==0 &&(a+c)/(2*b)>0 || (2*b-c)%a==0 && (2*b-c)/a>0 || ((2*b-a)%c==0 && (2*b-a)/c>0))
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
