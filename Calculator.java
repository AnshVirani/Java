import java.util.*;
class Calculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char choice;
		int no1, no2, ans;
		System.out.println("Enter Number 1 : ");
		no1=sc.nextInt();
		System.out.println("Enter Number 2 : ");
		no2=sc.nextInt();
		System.out.println("Choose an Operator : ");
		choice=sc.next().charAt(0);
		sc.close();
		switch (choice)
		{
			case '+':
				ans = no1 + no2;
				System.out.println(no1+ "+" +no2+ "=" +ans);
				break;
			case '-':
				ans = no1 - no2;
				System.out.println(no1+ "-" +no2+ "=" +ans);
				break;
			case '*':
				ans = no1 * no2;
				System.out.println(no1+ "*" +no2+ "=" +ans);
				break;
			case '/':
				ans = no1 / no2;
				System.out.println(no1+ "/" +no2+ "=" +ans);
				break;
			default:
				System.out.println("Invalid Operator!!!");
				break;
		}
	}
}

