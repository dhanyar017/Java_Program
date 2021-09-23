class DecrementOperation
{
public static void main(String[] args)
{
System.out.println("***** Pre-Decrement Operation *****");
int p=100;
int q=--p;
System.out.println("p:"+p);
System.out.println("q:"+q);

System.out.println("***** Post-Decrement Operation *****");
int x=60;
int y=x--;
System.out.println("x:"+x);
System.out.println("y:"+y);
}
}