import java.util.*;
public class Anti_FibonacciPermutation {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--!=0)
		{
			int test = sc.nextInt();
			
			int[] arr = new int[test];
			int count = test;
			for(int i =0;i<arr.length;i++)
			{
				arr[i]=count--;
			}
			
			for(int i : arr)
			{
				System.out.print(i+" ");
			} // first pattern
			System.out.println();
			
			int remaining = test - 1;
			int index = 0;
			
			while(remaining!=0)
			{
				int temp[] = arr.clone();
				swap(index,index+1,temp);
				remaining--;
				index++;
			}
		}
	}
	
	public static void swap(int si,int ei,int arr[])
	{
		int temp = arr[si];
		arr[si] = arr[ei];
		arr[ei]=temp;
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
	
	

}
