class Animal2
{
	void eat()
	{
	System.out.println("eating");
	}
}//Animal2
class Dog extends Animal2
{
	void bark()
	{
	System.out.println("barking");
	}
}//Dog
class Cat extends Animal2
{
	void meow()
	{
	System.out.println("meowing");
	}
}//Cat
class bird extends Animal2
{
void kuku()
{
System.out.println("kukuing");
}
}

class TestInheritance3
{
public  static void main(String args[])
{
Cat c=new Cat();
c.meow();
c.eat();
Dog d=new Dog();
d.bark();
d.eat();
}
}
