import java.util.Scanner;
class Test
{
public static void printPattern(char symbol ,int num)
{
for(int row=num;row>0;row--)
{
System.out.print("\n");
for(int col=0;col<row;col++)
System.out.print(symbol);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int n=sc.nextInt();
Test.printPattern(ch,n);
}
} 
