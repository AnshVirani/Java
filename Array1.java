import java.util.*;
public class Array1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("a int Array Object : "+a);	
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter A["+i+"] : ");
			a[i] = sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("A["+i+"] : "+ a[i]);
		}
		sc.close();
	} 	
}