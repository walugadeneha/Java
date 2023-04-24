//volume of Prism

import java.util.*;
class VolPrism
{
public static void main(String args[])
{
double b,h,v;
Scanner sc=new Scanner(System.in);
System.out.println("Enter base:");
b=sc.nextDouble();
System.out.println("Enter height:");
h=sc.nextDouble();
v=b*h;
System.out.println("Volume of Prism="+v);
}
}