import java.util.Scanner;
public class YoungPhysicist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int[][] coord = new int[test][3];
		int sum[] = new int[3];
		
		for(int i = 0;i<test;i++)
		{
			for(int j = 0;j<3;j++)
			{
				coord[i][j]=sc.nextInt();
				sum[j]+=coord[i][j];
			}
		}
		
		if(sum[0]==0 && sum[1]==0 && sum[2]==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		sc.close();
	}

}
