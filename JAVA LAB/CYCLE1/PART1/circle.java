import java.util.Scanner;
import java.lang.Math;
public class circle
{
   public static void main(String[] args)
   {
     float r,a,c;
     Scanner scan = new Scanner(System.in);
     r=scan.nextInt();
     scan.close();
      a=(Math.PI*(r*r));
      c=(Math.PI*(2*r));
     System.out.println("Area of circle is"+a);
     System.out.println("Circumferance of circle is"+c);
    }
}