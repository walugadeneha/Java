//area of triangle

import java.util.*;
class ATriangle1
{
public static void main(String args[])
{
double b,h,a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter base:");
b=sc.nextDouble();
System.out.println("Enter height:");
h=sc.nextDouble();
a=0.5*b*h;
System.out.println("Area of triangle="+a);
}
}