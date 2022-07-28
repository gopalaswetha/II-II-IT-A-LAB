import java.util.Scanner;
import java.util.Arrays;
public class sort
{
   public static void main(String[] args)
   {
     String str;
     Scanner scan = new Scanner(System.in);
     str = scan.nextLine();
     char ch[] = str.toCharArray();
     Arrays.sort(ch);
     System.out.println(new String(ch));
   }
}
  