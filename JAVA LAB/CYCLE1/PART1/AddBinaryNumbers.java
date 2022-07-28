
public class AddBinaryNumbers 
{   
     public static void main(String[] args) 
     {
          long b1 = 10101, b2 = 10001;
          int i = 0 ,carry = 0;
          int[] Sum = new int[10];
          while (b1!= 0 || b2 != 0) 
          {
                Sum[i++] = (int) (carry + (b1% 10 + b2 % 10) % 2);
                carry = (int) ((b1 % 10 + b2 % 10 + carry) / 2);
                 b1 = b1 / 10;
                 b2 = b2 / 10;
          }
          if (carry != 0) 
          {
              Sum[i++] = carry;
          }
          i--;
          while (i >= 0) 
          {
              System.out.print(Sum[i--]);
          }
           System.out.print("\n");
     }

}