// **********Area of circle**********
import java.util.Scanner;
public class test1{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Radius of circle");

       double radius=sc.nextDouble();
       double area=Math.PI*radius*radius;
       System.out.println(area);

    }
}