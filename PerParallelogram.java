//perimeter of Parallelogram

import java.util.*;
class PerParallelogram
{
public static void main(String args[])
{
double a,b,p;
Scanner sc=new Scanner(System.in);
System.out.println("Enter side:");
a=sc.nextDouble();
System.out.println("Enter base:");
b=sc.nextDouble();
p=2*(a+b);
System.out.println("Perimeter of square="+p);
}
}