import java.util.Scanner;
public class count
{
  public static void main(String[] args)
  {
     String str;
     Scanner scan = new Scanner(System.in);
     str = scan.nextLine();
     char search;
     search = scan.next().charAt(0);
     int count=0;
     for(int i=0;i<str.length();i++)
     {
        if(str.charAt(i) == search)
        count++;
     }
     System.out.println(+count);
   }
}