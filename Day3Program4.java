import java.util.Scanner;
class Day3Program4
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int num1=scob.nextInt();//20
int num2=scob.nextInt();//10
int min=0;
if(num1>=num2)min=num1;
if(num2>num1)min=num2;
System.out.print("Largest out of " + num1 +" and "+ num2 +" is" + min);
}//main()
}//Day3Program4