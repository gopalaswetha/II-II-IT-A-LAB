import java.util.Scanner;
public class reversestr
{  
     public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        String str;
        str = scan.nextLine();
        String[] sub_str = str.split("\s");
        int i;
        for(i=sub_str.length-1;i>=0;i--)
        {
          System.out.print(sub_str[i]+" ");
        }
        scan.close();
       
      }
}
        