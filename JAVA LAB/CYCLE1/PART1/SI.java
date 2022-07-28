import java.util.Scanner;
public class SI
{
   public static void main(String[] args)
   {
      int p,r,t;
      double a;
      Scanner scan = new Scanner(System.in);
      p = scan.nextInt();
      r = scan.nextInt();
      t = scan.nextInt();
      a = (p*r*t)/100;
       System.out.println("simple interest is" +a);
    }
}

