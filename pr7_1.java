class student{
int id;
String name;
public student(int i,String n)
{
id =i;
name =n;
}
public void disp()
{
System.out.println("ID: "+id);
System.out.println("NAME: "+name);
}
}
public class pr7_1
{
public static void main(String a[])
{
student r=new student(56,"MEET");
r.disp();
}
}