import java.util.*;
public class pr5
{
 	public static void main(String args[])
	{
  	int i=0,n,temp,temp1=1;
	Scanner sc = new Scanner(System.in);
 	System.out.println("print prime number to given range");
 	n=sc.nextInt();
 	System.out.println("print prime number");
 	while(temp1<=n)
 		{
   		temp=0;
 		for(i=2;i<=(temp1/2);i++)
 			{
   			if(temp%i==0)
				{
				temp=1;
				break;
				}
			}
		if(temp==0)
		{
		System.out.println(temp1);
		}
		temp1++;
		}
	}
}  