public class MultipleCatchBlock1
{
public static void main(String [] args)
{
try
{
int a[]=new int[5];
}
catch(ArithmeticException e)
{
System.out.println("Arithmetic Exception occurs");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOfBounds Exception occurs");
}
System.out.println("rest of the code");
}
} 