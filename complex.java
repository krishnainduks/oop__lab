

import java.util.Scanner;
class complex
{
 double i,r;
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  complex com1=new complex();
  complex com2=new complex();
  System.out.println("Enter the complex number a:");
  com1.r=sc.nextDouble();
  com1.i=sc.nextDouble();
  System.out.println("Enter the complex number b:");
  com2.r=sc.nextDouble();
  com2.i=sc.nextDouble();
  double sr=com1.r+com2.r;
  double si=com1.i+com2.i;
  System.out.println("Sum of two complex number is:"+sr+"+"+si+"i");
 }
}
                                   OUTPUT
C:\Users\l\Desktop\java>javac complex.java

C:\Users\l\Desktop\java>java complex
Enter the complex number a:
3
5
Enter the complex number b:
1
5
Sum of two complex number is:4.0+10.0i
