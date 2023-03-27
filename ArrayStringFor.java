class ArrayStringFor
{
 public static void main(String[]  args)
{
//create an array
String[] name={"Kavya","Preethi","mani", "Alekya","Danush"};
int[]marks={80,90,90,100,90};
System.out.println("Accessing Elements of Array:");
for(int i=0;i<marks.length;i++)
{
System.out.println(name[i]+" scored "+marks[i]);
}//for
}
}