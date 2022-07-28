import java.util.Scanner;
public class mul
{
  public static void main(String[] args)
  {
     int a,b,mul;
     Scanner scan = new Scanner(System.in);
     a = scan.nextInt();
     b = scan.nextInt();
     mul=a*b;
     scan.close();
     System.out.println("product of a and b is" +mul);
   }
}

 