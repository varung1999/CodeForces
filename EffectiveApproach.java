import java.util.Scanner;
import java.util.ArrayList;
public class EffectiveApproach {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long pos[] = new long[(int)(n+1)];
		
		for(long i =0;i<n;i++)
		{
			long num = sc.nextLong();
			pos[(int)num]=i+1;
		}
		
		long vasya =0,petya=0;
		
		long m = sc.nextLong();
		for(long i =0;i<m;i++)
		{
			long k = sc.nextLong();
			vasya += pos[(int)k];
			petya += n - pos[(int)k]+1;
		}
		
		System.out.println(vasya+" "+petya);
	}

}
