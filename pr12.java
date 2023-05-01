class pr12{
private int x;
private int y;
public pr12()
{
x=0;
y=0;
}
public pr12(int x)
{
this.x=x;
y=0;
}
public pr12(int x,int y){
this.x=x;
this.y=y;	
}
public static void main(String a[])
{
pr12 ex1 = new pr12();
System.out.println("\nx ="+ex1.x+",y="+ex1.y);
pr12 ex2 = new pr12(5);
System.out.println("\nx ="+ex2.x+",y="+ex2.y);
pr12 ex3 = new pr12(6,7);
System.out.println("\nx ="+ex3.x+",y="+ex3.y);
}
}