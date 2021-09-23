class IncrementOperation
{
public static void main(String[] args)
{
System.out.println("***** Pre-Increment Operation *****");
int a=10;
int b=++a;
System.out.println("a:"+a);
System.out.println("b:"+b);

System.out.println("***** Post-Increment Operation *****");
int i=1;
int j=i++;
System.out.println("i:"+i);
System.out.println("j:"+j);
}
}