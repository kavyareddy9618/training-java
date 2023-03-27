import java.util.Scanner;
class Point1
{
private double x;
private double y;
public void setX(double x){this.x=x;}
public void setY(double y){this.y=y;}
public double getX(){ return this.x;}
public double getY(){ return this.y;}
}
class Test1
{
public static void main(String args[])
{
Point1 p=new Point1();
System.out.println(p.getX() +" " +p.getY());
Scanner sc=new Scanner(System.in);
System.out.println("Enter x-coordinate and y-coordinate:");
double a=sc.nextDouble();
double b=sc.nextDouble();
p.setX(a);
p.setY(b);
System.out.println(p.getX() +" "+p.getY());
}//main()
}//Test
