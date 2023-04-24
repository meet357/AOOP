class pr9_2
{
void disp()
{
System.out.println("this is non static method");
}
static void dis()
{
System.out.println("this is static method");
}
public static void main(String a[])
{
pr9_2 obj= new pr9_2();
obj.disp();
pr9_2.dis();
}
}