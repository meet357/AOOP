class rectagle
{
 int hight;
 int width;
 public rectagle(int h,int w)
{
 hight=h;
 width=w;
}
public void disp()
{
System.out.println("hight="+hight);
System.out.println("width="+width);
}
}
public class demo
{
public static void main(String args[])
{
rectagle r=new rectagle(500,100);
r.disp();
}
}