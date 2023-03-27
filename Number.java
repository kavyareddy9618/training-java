import  java.util.Scanner;
class Number
{
public int add(int a,int b)
{
int c=a+b;
return c;
}//add()
public int sub(int a,int b)
{
int c=a-b;
return c;
}//sub()
public int mul(int a,int b)
{
int c=a*b;
return c;
}//mul()
public int div(int a,int b)
{
int c=a*b;
return c;
}//div()
public int moddiv(int a,int b)
{
int c=a*b;
return c;
}//moddiv()
}//Number
class Test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
int n1=sc.nextInt();//5
int n2=sc.nextInt();//7
int res=0;
Number ob=new Number();
res=ob.add(n1,n2);//12
System.out.println(n1+"+"+n2+"="+res);
res=ob.sub(n1,n2);//-2
System.out.println(n1+"-"+n2+"="+res);
res=ob.mul(n1,n2);//35
System.out.println(n1+"*"+n2+"="+res);
res=ob.div(n1,n2);//35
System.out.println(n1+"/"+n2+"="+res);
res=ob.moddiv(n1,n2);//35
System.out.println(n1+"%"+n2+"="+res);
System.out.println(n1+"*"+n2+"="+res);
}//main()
}//Test