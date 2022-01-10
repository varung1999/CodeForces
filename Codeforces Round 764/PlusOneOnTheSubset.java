import java.util.*;
public class PlusOneOnTheSubset {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i =0;i<t;i++)
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for(int j =0;j<n;j++)
			{
				arr[j]=sc.nextInt();
				if(arr[j]>max)
				{
					max = arr[j];
				}
				if(arr[j]<min)
				{
					min = arr[j];
				}
				
			}
			
			System.out.println(max-min);
			
			
		}

	}

}
