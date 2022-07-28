import java.util.Scanner;
public class evenorodd
{
   public static void main(String[] args)
   {
     int num;
     Scanner scan = new Scanner(System.in);
     num = scan.nextInt();
     if(num % 2 ==0)
        System.out.println("Number is even");
     else
        System.out.println("Number is odd");
    }
}

     
