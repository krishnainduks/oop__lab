
import java.util.Scanner;
class Product
{
 int productcode,productprice;
 String productname=""; 
void read()
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the product code:");
 productcode=sc.nextInt();
 System.out.println("Enter the product name:");
 productname=sc.next();
 System.out.println("Enter the product price:");
 productprice=sc.nextInt();
}
void display()
{
 System.out.println("\n\t\tPRODUCT DETAILS");
 System.out.println("\t\t---------------\n");
 System.out.println("Product Code"+productcode);
 System.out.println("Product Name:"+productname);
 System.out.println("Product Price:"+productprice);
 }
}
class productdetails
{
 public static void main(String args[])
{
 Product pro1=new Product();
 Product pro2=new Product();
 Product pro3=new Product();
System.out.println("Enter the first product details:\n");
 pro1.read();
System.out.println("Enter the second product details:\n");
 pro2.read();
System.out.println("Enter the third product details:\n");
 pro3.read();
if(pro1.productprice<pro2.productprice && pro1.productprice<pro3.productprice)
{
     System.out.println("\n "+pro1.productprice+" is smallest price");
     pro1.display();
   }
else if(pro2.productprice<pro3.productprice)
{
   System.out.println("\n "+pro2.productprice+" is smallest price");
   pro2.display();
 }
else 
 {
   System.out.println("\n "+pro3.productprice+" is smallest price");
   pro3.display();
  }
 }
}
  
                                               OUTPUT
C:\Users\l\Desktop\java>javac productdetails.java

C:\Users\l\Desktop\java>java productdetails
Enter the first product details:

Enter the product code:
121
Enter the product name:
Diarymilk
Enter the product price:
50
Enter the second product details:

Enter the product code:
122
Enter the product name:
Lays
Enter the product price:
30
Enter the third product details:

Enter the product code:
123
Enter the product name:
Book
Enter the product price:
90

 30 is smallest price

                PRODUCT DETAILS
                ---------------

Product Code122
Product Name:Lays
Product Price:30








