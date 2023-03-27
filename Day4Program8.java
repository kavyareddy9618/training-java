import java.util.Scanner;
class Rectangle
{
public int calculateArea(int l, int w)
{
int area=l*w;
return area;
}//calculateArea()
public int calculatePerimeter(int l, int  w)
{
int Peri=2*(l+w);
return Peri;
}//calculatePerimeter()
}// Rectangle
class Test{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int length=sc.nextInt();//5
int Width=sc.nextInt();//7
int res;
Rectangle ob=new Rectangle();
res=ob.calculateArea(length,Width);
System.out.println("Area is:"+res);
res=ob.calculatePerimeter(length,Width);
System.out.println("Perimeter is:"+res);
}//main()
}//Test
