//volume of cone

import java.util.*;
class VolCone
{
public static void main(String args[])
{
double r,h,v;
Scanner sc=new Scanner(System.in);
System.out.println("Enter radius:");
r=sc.nextDouble();
System.out.println("Enter height:");
h=sc.nextDouble();
v=3.14*r*r*h/3;
System.out.println("Volume of cone="+v);
}
}