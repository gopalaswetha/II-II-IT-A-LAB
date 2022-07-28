import java.util.Scanner;
public class reverse
{
   public static void main(String[] args)
   {
       int num,rem,rev=0;
       
       Scanner scan = new Scanner(System.in);
       num = scan.nextInt();
       int a[] = new int[num];
       for(int i=0;i<num;i++)
       {
          a[i] = scan.nextInt();
          while(a[i]>0)
          {
             rem = a[i]%10;
             rev = rev*10+rem;
             a[i] = a[i]/10;
          }
          
         System.out.println(+rev);
         rev=0;
       }
    }
}