//area of parallelogram

import java.util.*;
class AParallelogram
{
public static void main(String args[])
{
double b,h,a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter breadth:");
b=sc.nextDouble();
System.out.println("Enter height:");
h=sc.nextDouble();
a=b*h;
System.out.println("Area of a parallelogram:"+a);
}
}