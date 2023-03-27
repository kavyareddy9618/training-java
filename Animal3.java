class Animal3
{
	void eat()
	{
	System.out.println("eating");
	}
}//Animal2
class Dog extends Animal3
{
	void bark()
	{
	System.out.println("barking");
	}
}//Dog
class Cat extends Animal3
{
	void meow()
	{
	System.out.println("meowing");
	}
}//Cat
class Bird extends Animal3
{
void chatter()
{
System.out.println("chattering");
}
}

class TestInheritance4
{
public  static void main(String args[])
{
Cat c=new Cat();
c.meow();
c.eat();
Dog d=new Dog();
d.bark();
d.eat();
Bird b=new Bird();
b.chatter();
b.eat();
}
}
