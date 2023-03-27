import java.util.Scanner;
class Program12
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter your name:");
String sn=scob.next();//sc.nextline();
System.out.println("\nGood Evening" + sn);
System.out.println("\nEnter two numbers:");
int num1=scob.nextInt();
int num2=scob.nextInt();
System.out.println("\n"+num1+"*"+num2+"="+num1*num2);
}//main()
}//program11