import java.util.Scanner;
public class average
{
   public static void main(String[] args)
   {
       int num,sum=0;
       float avg;
       Scanner scan = new Scanner(System.in);
       num = scan.nextInt();
       int a[] = new int[num];
       for(int i=0;i<num;i++)
       {
          a[i] = scan.nextInt();
          sum = sum+a[i];
       }
       System.out.println("sum="+sum);
       avg = (float)sum/num;
       System.out.println("Average:"+avg);
    }
}