import java.util.Scanner;
public class Point
{
double x;
double y;
Point()
{
x=0;     y=0;
}
Point(double x1,  double y1)
{ x=x1;  y=y1;}
public double distance_from_origin()
{
double dist;
dist=Math.sqrt(x*x+y*y);
return dist;
}
public double distance_from_point(Point Q)
{
            double diff_x = x -Q.x;
            double diff_y = y - Q.y;
             return Math.sqrt(diff_x* diff_x + diff_y* diff_y);
}
}
class Test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double x,y;
System.out.println("Enter x and y coordinates of a point:");
x=sc.nextDouble();
y=sc.nextDouble();
Point ob1=new Point(x,y);
System.out.print("Distance of point("+x+","+y+")"+" from origin is");
System.out.println(ob1.distance_from_origin());
System.out.println("Enter x and y coordinates of a point:");
x=sc.nextDouble();
y=sc.nextDouble();
Point p1=new Point(x,y);
System.out.println("Enter x and y coordinates f a point:");
x=sc.nextDouble();
y=sc.nextDouble();
Point p2=new Point(x,y);
System.out.println("Distance between two points is:"+ p1.distance_from_point(p2));
System.out.println("Distance between two points is:"+ p2.distance_from_point(p1));
}//main()
}//Test