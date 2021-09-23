class Flower
{
String name;
String color;
int noOfPetals;
void bloom()
{
System.out.println(color+" "+name+" is bloomimg");
}
public static void main(String[] args)
{
Flower f=new Flower();
f.name="Rose";
f.color="Red";
f.noOfPetals=15;

f.bloom();
}
}