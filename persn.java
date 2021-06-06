
import java.util.Scanner;
class person{
    Scanner sc=new Scanner(System.in);
    String gend,addres,name;
    int age;
    person()
    {
        System.out.println("Person Details:");
        System.out.println("Name:");
        name=sc.next();
        System.out.println("Address:");
        addres=sc.next();
        System.out.println("Gender:");
        gend=sc.next();
        System.out.println("Age:");
        age= sc.nextInt();
    }
}

class emplye extends person{
    int emplid,salry;
    String cmpny_name,qualification;
    Scanner sc=new Scanner(System.in);
    emplye()
    {
        System.out.println("Empolyee Details");
        System.out.println("Company Name:");
        cmpny_name=sc.next();
        System.out.println("Employee ID:");
        emplid=sc.nextInt();
        System.out.println("Qualification:");
        qualification=sc.next();
        System.out.println("Salary:");
        salry=sc.nextInt();
    }
}
class tcher extends emplye{
    Scanner sc=new Scanner(System.in);
    String dept,subj;
    int techrID;
    tcher(){
        System.out.println("Teacher Details:");
        System.out.println("Department name:");
        dept=sc.next();
        System.out.println("Subject:");
        subj= sc.next();
        System.out.println("Teahcer ID:");
        techrID= sc.nextInt();
    }
    void disp()
    {
        System.out.println("Details are:");
        System.out.println(name);
        System.out.println(gend);
        System.out.println(age);
        System.out.println(cmpny_name);
        System.out.println(emplid);
        System.out.println(qualification);
        System.out.println(techrID);
        System.out.println(addres);
        System.out.println(subj);
        System.out.println(dept);
        System.out.println(salry);
    }
}
public class persn {
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        tcher tr[]=new tcher[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new tcher();
            tr[i].disp();
        }
    }
}
      OUTPUT
C:\Users\l\Desktop\java>java persn
Enter the limit:
2
Person Details:
Name:
Binsa
Address:
kuttida
Gender:
female
Age:
25
Empolyee Details
Company Name:
aaa
Employee ID:
2
Qualification:
degree
Salary:
25000
Teacher Details:
Department name:
IT
Subject:
Java
Teahcer ID:
1
Details are:
Binsa
female
25
aaa
2
degree
1
kuttida
Java
IT
25000
Person Details:
Name:
sujatha
Address:
www
Gender:
female
Age:
23
Empolyee Details
Company Name:
sss
Employee ID:
3
Qualification:
degree
Salary:
30000
Teacher Details:
Department name:
IT
Subject:
Java
Teahcer ID:
5
Details are:
sujatha
female
23
sss
3
degree
5
www
Java
IT
30000

C:\Users\l\Desktop\java>
