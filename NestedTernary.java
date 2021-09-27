class NestedTernary
{
public static void main(String[] args)
{
int a=2;
int b=9;
int c=-11;
int largest = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);
System.out.println("Largest number is : "+largest);
}
}