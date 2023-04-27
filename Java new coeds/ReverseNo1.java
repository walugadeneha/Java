//prg of reverse of a number

import java.util.*;
class ReverseNo1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,d,sum;
sum=0;
System.out.println("Enter a number:");
n=sc.nextInt();

while(n>0)
{
d=n%10;
sum=sum*10+d;
n=n/10;
}
System.out.println("Reverse number="+sum);
}
}