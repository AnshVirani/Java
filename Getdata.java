import java.util.*;
class Employee
{
    Scanner sc=new Scanner(System.in);
    String name,des;
    int id,salary;
    
    void get()
    {
        System.out.print("Enter Employee name : ");
        name=sc.nextLine();
        System.out.print("Enter id : ");
        id=sc.nextInt();
        System.out.print("Enter Designation : ");
        des=sc.next();
        System.out.print("Enter Salary : ");
        salary=sc.nextInt();
    }
    
    
    void display()
    {
        System.out.println("\nEmployee name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Designation : "+des);
        System.out.println("Salary : "+salary);
    }
}
public class Getdata
{
	public static void main(String[] args) 
	{
	   Employee obj=new Employee();
	   obj.get();
	   obj.display();
	}
}