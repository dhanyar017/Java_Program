class TernaryOperationAssignment
{
public static void main(String[] args)
{
int i=50;
int j=100;
int k=150;
int result = i > (j > k ? j: k)? i : ((j > k)? j : k);
System.out.println("Largest of "+i+" & "+j+" & "+k+" is : "+result);

int result1 = i < (j < k ? j: k)? i : ((j < k)? j : k);
System.out.println("Smallest of "+i+" & "+j+" & "+k+" is : "+result1);
}
}