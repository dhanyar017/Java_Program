class Refrigerator
{
String name;
int price;
String color;
int temp;
void cool()
{
System.out.println("If tempetature is "+temp+"keep the food in proper condition");
}
void speed()
{
System.out.println(name+" Refrigerator is good for speed chilling");
}
public static void main(String[] args)
{
Refrigerator r=new Refrigerator();
r.name="LG";
r.temp=5;
r.color="grey";

r.cool();
r.speed();
}
}