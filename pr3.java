public class pr3
{
 public static void main(String args[])
	{
		int num=987654321, rev=0;
	System.out.println("NUMBER is: "+num);
		while(num !=0)
		{
			int rem=num % 10;
			rev=rev*10+rem;
			num=num/10;
		}
	
	System.out.println("REVERSE is: "+rev);

}}




