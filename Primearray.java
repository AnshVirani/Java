import java.util.*;
public class Primearray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		boolean flag = true;
		System.out.println("a int Array Object : "+a);	
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter A["+i+"] : ");
			a[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0;i<10;i++)
		{
			flag = true;
			for(int j=2;j<a[i];j++)
            		{
                		if(a[i]%j==0)
                		{
                    		flag=false;
                    		break;
                		}
            		}//end of for loop
            		if(flag==true)
            		{
                		System.out.println("a["+i+"] ="+a[i]);
            		}
		}
	} 	
}