import java.util.Scanner;
import java.lang.Math;
public class CI
{
   public static void main(String[] args)
   {
       int p,n,t;
       double d,c;
       float r;
       Scanner scan = new Scanner(System.in);
       p = scan.nextInt();
       r = scan.nextFloat();
       n = scan.nextInt();
       t = scan.nextInt();
       d = p * Math.pow(1 + (r / n),n*t);
       c = d-p;
       System.out.println("compound interest is" +c);
    }
}

