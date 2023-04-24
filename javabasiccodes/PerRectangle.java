//perimeter of rectangle

import java.util.*;
class PerRectangle
{
public static void main(String args[])
{
double l,b,p;
Scanner sc=new Scanner(System.in);
System.out.println("Enter length:");
l=sc.nextDouble();
System.out.println("Enter breadth:");
b=sc.nextDouble();
p=2*l+2*b;
System.out.println("Perimeter of rectangle="+p);
}
}