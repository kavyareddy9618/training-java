import java.util.Scanner;
class Prog
{
public static int countDigit(int n)
{
int count=0;
while(n>0)
{
n=n/10;
count++;
}
return count;
}
public static boolean checkArmstrong(int n)
{
int sum=0;
int len=Prog.countDigit(n);
int num=n;
while(num>0)
{
sum=sum+(int)Math.pow(num%10,len);
num=num/10;
}//while
if(sum==n)return true;
else return false;
}
public static void main(String args[])
{
for(int i=0;i<9999;i++)
if(Prog.checkArmstrong(i))System.out.print(i +" ");
}
}

