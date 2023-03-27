class Student1{
int rollno;
String name;
void insertRecord(int r,String n){
rollno=r;
name=n;
}
void displayInformation(){System.out.println(rollno+" "+name);}
}
class TestStudent1{
public static void main (String agrs[]){
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();
s1.insertRecord(111,"tiru");
s2.insertRecord(222,"sailu");
s3.insertRecord(333,"sireesha");
s1.displayInformation();
s2.displayInformation();                      
s3.displayInformation();
}//main()
}//TestStudent1