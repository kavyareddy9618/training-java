import java .util.Scanner;
class Day4Program6
{
public static void fun1(int a, int b)
{
int res=a+b;
System.out.println(res);
}
public static void cr(){
System.out.println("Enter two integers:");
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
cr();
int num1=sc.nextInt();//11
int num2=sc.nextInt();//22
fun1(num1,num2);//function/method call
}//main()
}//Day4Program6