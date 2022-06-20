import java.util.Scanner;
class Ifelse
{
	public static void main(String args[])
	{
		int i;
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		i=sc.nextInt();
		sc.close();
		if(i%2==0)
		{
			System.out.println("Number is EVEN.");
		}
		else
		{
			System.out.println("Number is ODD.");
		}
	}
}