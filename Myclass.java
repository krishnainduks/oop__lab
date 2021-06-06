
import java.util.*;
class overload{
    Scanner sc=new Scanner(System.in);
    int length,breath;
    void get()
    {
        System.out.println("Enter Length,Breadth and Height for rectangle and triangle:");
        length=sc.nextInt();
        breath=sc.nextInt();
    }
    void area(){
        System.out.println("Area of rectangle:"+(length*breath));
    }
    void area(double pi,int breath,int height){
        System.out.println("Area of triangle:"+(pi*breath*height));
    }
}
public class Myclass {
    public static void main(String ...a) {
        overload ar = new overload();
        ar.get();
        ar.area();
        ar.area(0.5, 4, 5);
    }

}
               OUTPUT
C:\Users\l\Desktop\java>javac Myclass.java

C:\Users\l\Desktop\java>java Myclass
Enter Length,Breadth and Height for rectangle and triangle:
3 4 5
Area of rectangle:12
Area of triangle:10.0

