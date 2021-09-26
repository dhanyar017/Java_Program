class LogicalOperation
{
public static void main(String[] args)
{
int m=250;
int n=200;
System.out.println(m<n && m>n);
System.out.println(n>m && n<m);
System.out.println(m<=n && m!=n);
System.out.println(m==n && m!=n);

System.out.println(m<n || m>n);
System.out.println(n>m || n<m);
System.out.println(m<=n || m!=n);
System.out.println(m==n || m!=n);
}
}