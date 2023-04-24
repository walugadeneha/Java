//Total surface area of cylinder

import java.util.*;
class TSACylinder
{
public static void main(String args[])
{
double r,h,Tarea;
Scanner sc=new Scanner(System.in);
System.out.println("Enter radius:");
r=sc.nextDouble();
System.out.println("Enter height:");
h=sc.nextDouble();
Tarea=2*3.14*r*h+2*3.14*r*r;
System.out.println("Total surface area of cylinder="+Tarea);
}
}