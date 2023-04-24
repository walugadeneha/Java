//area of a rhombus

import java.util.*;
class ARhombus
{
public static void main(String args[])
{
double d1,d2,a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter values of diagonals d1 and d2");
d1=sc.nextDouble();
d2=sc.nextDouble();
a=0.5*d1*d2;
System.out.println("Area of rhombus="+a);
}
}