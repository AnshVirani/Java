import java.util.Scanner;
class Simpleif
{
	public static void main(String args[])
	{
		int i;
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		i=sc.nextInt();
		sc.close();
		if(i>0)
		{
			System.out.println("Number is positive.");
		}
	}
}