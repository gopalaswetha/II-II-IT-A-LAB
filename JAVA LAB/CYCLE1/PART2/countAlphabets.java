import java.util.Scanner;
public class countAlphabets
{
  public static void main(String[] args)
  {
     String str;
     Scanner scan = new Scanner(System.in);
     str = scan.nextLine();
     
     
     int count1=0,count2=0;
     for(int i=0;i<str.length();i++)
     {
        if((str.charAt(i) =='a')||(str.charAt(i)=='A')||(str.charAt(i)=='e')||(str.charAt(i)=='E')||(str.charAt(i)=='i')||(str.charAt(i)=='I')||(str.charAt(i)=='o')||(str.charAt(i)=='O')||(str.charAt(i)=='u')||(str.charAt(i)=='U'))
        {
           count1++;
        }
        else
        {
           count2++;
        }
         
     }
     System.out.println("Number of vowels ="+count1);
     System.out.println("Number of consonants ="+count2);
   }
}