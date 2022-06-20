import java.util.Scanner;
public class Student
{
	private int id;
	private String name;
	private int std;

	public void scan()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter I'd : ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name=sc.nextLine();
		System.out.println("Enter Std : ");
		std=sc.nextInt();
	}
	public void disp()
	{
		System.out.println(id + "  " + name + " - " + std);
	}
	
}