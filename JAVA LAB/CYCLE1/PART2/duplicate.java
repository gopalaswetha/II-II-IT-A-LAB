import java.util.Scanner;
public class duplicate
{
   public static void main(String[] args)
   {
      
      Scanner scan = new Scanner(System.in);
      String str;
      str = scan.nextLine();
      char[] inp = str.toCharArray();
      System.out.println("duplicate  Characters are:");
      for(int i=0; i<str.length(); i++)
      {
         for(int j=i+1;j<str.length();j++)
         {
           if(inp[i] == inp[j])
           {
             System.out.println(inp[j]);
           }
         }
      }
    }
}