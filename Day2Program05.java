import java.util.Scanner;
class Day2Program05
{
public static void main(String args[])
{
Scanner scob= new Scanner(System.in);
int num1=scob.nextInt();//45
int inc=scob.nextInt();//5
int i;//variable declaration
i=0; //initialization
while(i<=num1)
{
System.out.println(i+",");
i=i+inc;
}//while loop
}//main()
}//Program11
