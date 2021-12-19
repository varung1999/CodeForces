import java.util.Scanner;
public class WayTooLongWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input=null;
		double testCases = sc.nextInt();
		for(int i = 0;i<=testCases;i++)
		{
			input = sc.nextLine();

			if(input.length()>10)
			{
				System.out.print(input.charAt(0));
				System.out.print(input.length()-2);
				System.out.println(input.charAt(input.length()-1));
			}
			else
			{
				System.out.println(input);
			}
		}
	}
}
