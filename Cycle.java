class Cycle
{
String name;
String color;
int cost;
void Name()
{
System.out.println("Cycle name is: "+name);
}
void Color()
{
System.out.println("cycle color is: "+color);
}
void Cost()
{
System.out.println("Cycle cost is: "+cost);
}
public static void main(String[] args)
{
Cycle c=new Cycle();
c.name="HERO";
c.color="black";
c.cost=7000;

c.Name();
c.Color();
c.Cost();
}
}