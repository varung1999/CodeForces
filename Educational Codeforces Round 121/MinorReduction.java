import java.io.*;
import java.util.*;
public class MinorReduction {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		 
	      int t = Integer.parseInt(sc.readLine());
		for (int i = 0; i < t; i++)
	      {
	         String x = sc.readLine();
	 
	         String result = "";
	         for (int j = x.length()-1; result.length()==0; j--)
	         {
	            int sum = Integer.parseInt(x.substring(j, j+1)) + Integer.parseInt(x.substring(j-1, j));
	            if (sum >= 10 || j == 1)
	               result = x.substring(0, j-1) + sum + x.substring(j+1);
	         }
	 
	         System.out.println(result);
	      }
	   }
	} 
