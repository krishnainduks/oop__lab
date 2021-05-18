
import java.util.Scanner;
class employee
{
 int empno,empsalary;
 String empname;
 public static void main(String args[]) 
 {
  Scanner sc=new Scanner(System.in);
  employee[] emp=new employee[100];
  System.out.println("Enter the limit");
  int n=sc.nextInt();
  for(int i=0;i<n;i++)
   {
     System.out.println("\n\tEnter the details:-\n");
     emp[i]=new employee();
     System.out.println("Enter the employee number:");
     emp[i].empno=sc.nextInt();
     System.out.println("Enter the employee name:");
     emp[i].empname=sc.next();
     System.out.println("Enter the employee salary:");
     emp[i].empsalary=sc.nextInt();
    
     }
   System.out.println("\nEnter the employee number to search:");
   int empnoo=sc.nextInt();
     for(int i=0;i<n;i++)
       {
	if(emp[i].empno==empnoo)
	{
	 System.out.println("\n\t\tEmployee details:");
         System.out.println("\t\t----------------");
	 System.out.println("Name:"+emp[i].empname+"\nEmployee number:"+emp[i].empno+"\nEmployee salary:"+emp[i].empsalary);
	  break;
	 }
	if(i==n-1)
	{
	  System.out.println("Employee not found:");
	 }
    }
 }
}
 
                              OUTPUT
C:\Users\l\Desktop\java>javac employee.java

C:\Users\l\Desktop\java>java employee
Enter the limit
3

        Enter the details:-

Enter the employee number:
1
Enter the employee name:
Anandhu
Enter the employee salary:
25000

        Enter the details:-

Enter the employee number:
2
Enter the employee name:
Ameesh
Enter the employee salary:
20000

        Enter the details:-

Enter the employee number:
3
Enter the employee name:
Thumbi
Enter the employee salary:
3000

Enter the employee number to search:
1

                Employee details:
                ----------------
Name:Anandhu
Employee number:1
Employee salary:25000

