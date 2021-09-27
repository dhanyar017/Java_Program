class ShiftOperator
{
public static void main(String[] args)
{
int x=10;
int y=8;
int z=5;
System.out.println("......LEFT SHIFT OPERATION......");
System.out.println("Left shift x<<2 is : "+(x<<2));
System.out.println("Left shift y<<2 is : "+(y<<2));
System.out.println("Left shift z<<2 is : "+(z<<2));

System.out.println("......RIGHT SHIFT OPERATION.....");
System.out.println("Left shift x>>2 is : "+(x>>2));
System.out.println("Left shift y>>2 is : "+(y>>2));
System.out.println("Left shift z>>2 is : "+(z>>2));

System.out.println("...... ZERO FILL RIGHT SHIFT OPERATION.....");
System.out.println("Left shift x>>>2 is : "+(x>>>2));
System.out.println("Left shift y>>>2 is : "+(y>>>2));
System.out.println("Left shift z>>>2 is : "+(z>>>2));
}
}