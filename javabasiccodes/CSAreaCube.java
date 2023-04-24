//Curved surface area of cube

import java.util.*;
class CSAreaCube
{
public static void main(String args[])
{
double s,csarea;
Scanner sc=new Scanner(System.in);
System.out.println("Enter side:");
s=sc.nextDouble();
csarea=6*s*s;
System.out.println("Curved surface area of cube="+csarea);
}
}