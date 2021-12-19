import java.util.Scanner;
public class TheatreSquare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt();
		long a = sc.nextInt();
		
		long n_new = n/a;
		long m_new = m/a;
		
		if(n%a!=0)
		{
			n_new++;
		}
		if(m%a!=0)
		{
			m_new++;
		}
		
		System.out.println(n_new*m_new);

	}

}
