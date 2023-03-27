class Animal1
{
	void eat()
	{
	System.out.println("eating");
	}
}//Animal1
class Dog extends Animal1
{
	void bark()
	{
	System.out.println("barking");
	}
}//Dog
class BabyDog extends Dog
{
	void weep()
	{
	System.out.println("weeping");
	}
}//BabyDog

class TestInheritance2
{
public  static void main(String args[])
{
BabyDog d=new BabyDog();
d.weep();
d.bark();
d.eat();
}
}
