import java.util.Scanner;
public class alphabets
{
   public static void main(String[] args)
   {
     char ch;
     Scanner scan = new Scanner(System.in);
     ch = scan.next().charAt(0);
     if((ch == 'a') || (ch == 'A') || (ch == 'e') || (ch == 'E') || (ch == 'i') || (ch == 'I') || (ch == 'o') || (ch == 'O') || (ch == 'u') || (ch == 'U'))
     {
        System.out.println("vowel");
     }
     else
     {
        System.out.println("Consonant");
      }
      scan.close();
    }
}
  
