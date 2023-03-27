class Human
{
void born()
{
System.out.println("borning");
}
}
class Man extends Human 
{
void live()
{
System.out.println("living");
}
}
class TestInheritance
{
public  static void main(String args[])
{
Man d=new Man();
d.live();
d.born();
}
}
