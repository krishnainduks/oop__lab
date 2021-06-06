
import java.util.*;
class employees {
    Scanner sc=new Scanner(System.in);
    int empid,salary;
    String Name,address;;
    employees()
    {
        System.out.println("name:");
        Name= sc.next();
        System.out.println("Employee id:");
        empid= sc.nextInt();
        System.out.println("salary:");
        salary=sc.nextInt();
        System.out.println("address:");
        address=sc.next();
    }
}

class teacher extends employees{
    Scanner sc=new Scanner(System.in);
    String dept,subj;
    teacher(){
        System.out.println("Department name:");
        dept=sc.next();
        System.out.println("Subject:");
        subj= sc.next();
    }
    void display()
    {
        System.out.println("Details are:");
        System.out.println(Name);
        System.out.println(empid);
        System.out.println(address);
        System.out.println(subj);
        System.out.println(dept);
        System.out.println(salary);
    }
}

public class Employe{
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        teacher tr[]=new teacher[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new teacher();
            tr[i].display();
        }
    }
}
         OUTPUT

C:\Users\l\Desktop\java>javac Employe.java

C:\Users\l\Desktop\java>java Employe
Enter the limit:
2
name:
Anandhu
Employee id:
1
salary:
25000
address:
sreevihar
Department name:
IT
Subject:
Java
Details are:
Anandhu
1
sreevihar
Java
IT
25000
name:
Amal
Employee id:
2
salary:
23000
address:
kuttida house
Department name:
CS
Subject:
Android
Details are:
Amal
2
kuttida
Android
CS
23000
