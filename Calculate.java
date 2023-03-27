import java.util.Scanner;
class Calculate
{
static int cube(int x)
{
return x*x*x*x;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int result=Calculate.cube(n);
System.out.println(result);
}
}