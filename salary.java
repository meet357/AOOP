import java.util.Scanner;
import java.io.*;

class salary
{
int b;
double h;
double d;
double s;

salary(int b,double h,double d)
{
this.b=b;
this.h=h;
this.d=d;

}
salary(int b,double h)
{
this(b,h);
}
salary(int b)
{
this(b);
}

public static void main(String args[])
{
salary e =new salary(5000,0.20,0.10);
e.s=e.b+e.h+e.d;
System.out.println("new salary"+e.s);
}
}
