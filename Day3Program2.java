import java.util.Scanner;
class Day3Program2
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int num1=scob. nextInt();//96
int num2=scob.nextInt();//4
int num3=scob. nextInt();//2
int res=num1/num2/num3;
//96/4/2=12
//System.out.println(num1,"/",num2,"/",num3,"=",res);
System.out.println(num1+"/"+num2+"/"+num3+"="+res);
}//main()
}//Day3Program2
