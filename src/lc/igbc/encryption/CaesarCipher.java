package lc.igbc.encryption;

import java.util.Scanner;

public class CaesarCipher
{

   static short type;
   static short shift;
   static short again = 1;


   /**
    * @param args
    */
   public static void main(String[] args)
   {
      // TODO Auto-generated method stub

      System.out.println("Caesar Cipher program.");
      while (again == 1)
      {
         setsToContinue();
         setAgain();
      }
      System.out.println("End of Program");
   }


   public static void Continue()
   {
      if (type == 1)
      {
         Encryption.Encrypt();
      }
      else
      {
         Decryption.Decrypt();
      }
   }


   public static void setType()
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter 1 for Encryption; 2 for Decryption.");
      short temp = input.nextShort();
      if (!isValidType(temp))
      {
         System.out.println("Please enter a valid number, 1 or 2.");
         setType();
      }
      else
      {
         type = temp;
      }
      input.close();
   }


   public static short getType()
   {
      return type;
   }


   public static void setShift()
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the shift amount (0 - 25).");
      shift = input.nextShort();
      input.close();
   }


   public static short getShift()
   {
      return shift;
   }


   public static boolean isValidType(short temp)
   {
      if (temp == 1 || temp == 2)
      {
         return true;
      }
      else
      {
         return false;
      }
   }


   public static boolean isValidShift()
   {
      if (shift > 0 && shift < 26)
      {
         return true;
      }
      else
      {
         return false;
      }
   }


   public static void toContinue()
   {
      if (isValidShift() && isValidShift())
      {
         Continue();
      }
      else if (isValidType(type) && !isValidShift())
      {
         System.out.println("Please enter a valid choice.");
         setShift();
      }
      else
      {
         System.out.println("Please enter a valid choice.");
         setType();
      }
   }


   public static void setsToContinue()
   {
      setType();
      setShift();
      toContinue();
   }


   public static void setAgain()
   {
      Scanner input = new Scanner(System.in);
      System.out
            .println("Do you want to do another encryption/decryption?  If yes, enter 1.  If not, enter 0.");
      short temp = input.nextShort();
      if (!isValidAgain(temp))
      {
         System.out.println("Please enter a valid choice.  1 or 0.");
         setAgain();
      }
      else
      {
         again = temp;
      }
      input.close();
   }


   public static short getAgain()
   {
      return again;
   }


   public static boolean isValidAgain(short temp)
   {
      if (temp == 1 || temp == 0)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}
