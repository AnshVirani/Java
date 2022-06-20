import java.util.Scanner;
public class Employee
{
	private int id;
	private String name;
	private String cmp;
	private int sry;
	private String desg;

	public void scan()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter I'd : ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name=sc.nextLine();
		System.out.println("Enter Company Name : ");
		cmp=sc.nextLine();
		System.out.println("Enter Salary : ");
		sry=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Designation : ");
		desg=sc.nextLine();
		sc.close();
	}
	public void disp()
	{
		System.out.println(id + "  " + name + "  -  " + cmp + " - " + sry + "  --  " + desg);
	}
	public static void main(String[] args)
	{
		Employee e[] = new Employee[10];
		System.out.println(e);
		for(int i=0;i<e.length;i++)
		{
			e[i] = new Employee();
			e[i].scan();
		}
		for(int i=0;i<e.length;i++)
		{
			e[i].disp();
		}
	}
	
}