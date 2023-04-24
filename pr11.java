class pr11
{
void area(int r)
{
System.out.println("the area of circle is: "+(3.14)*(r*r)+"  units");
}
void area(int w, int h)
{
System.out.println("the area of rectangle is: "+w*h+"  units");
}
public static void main(String a[])
{
pr11 p= new pr11();
p.area(10);
p.area(10,15);
}
}