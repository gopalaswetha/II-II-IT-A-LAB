import java.util.Scanner;
import java.lang.Math;
public class power
{
  public static void main(String[] args)
  {
    int a,b;
    double p;
    Scanner scan = new Scanner(System.in);
    a = scan.nextInt();
    b = scan.nextInt();
    p= Math.pow(a,b);
    System.out.println("The power of a,b is "+p);
  }
}