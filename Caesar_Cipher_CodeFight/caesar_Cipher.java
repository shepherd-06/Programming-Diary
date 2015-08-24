public class caesar_Cipher
{
  /*
   * The Caesar Cipher was one of the earliest ciphers ever invented. 
   * In this cipher, you encrypt a message by taking each letter in the message 
   * and replacing it with a “shifted” letter. 
   * If you shift the letter A by one space, you get the letter B.
   * If you shift the letter A by two spaces, you get the letter C. 
   * 
   * In this challenge your task is to decipher an encypted message.
   * Note: spaces, numbers and symbols stay intact, only letters should be shifted.
   * 
   * https://codefights.com/challenge/L3kD5Ep49rXK6TSKH
   * 
   * Ibtehaz Shawon
   * ibtehaz.shawon@gmail.com
   */
  
  public static void main(String[]args)
  {
    System.out.println(Caesar_Cipher("Ymj vznhp gwtbs Ktc ozrux tajw ymj qfed itl.", 
                                     5));
  }
  
  static String Caesar_Cipher(String message, int shift) 
  {
    String result = "";
    for(int i = 0; i < message.length(); i++)
    {
      int value = (int)message.charAt(i);
      
      if( value >= 65 && value <= 90) //capital letter
      {
        if(value - shift < 65) //to circle back from A to Z
        {
          int temp = value - 65;
          temp = shift - temp;
          value = 90 - temp + 1; 
          result = result + (char)value;
        }
        else
        {
          result = result + (char)(value - shift);
        }
      }
      else if(value >= 97 && value <= 122) //small letter
      {
        if(value - shift < 97) //to circle back from A to Z
        {
          int temp = value - 97;
          temp = shift - temp;
          value = 122 - temp + 1; 
          result = result + (char)value;
        }
        else
        {
          result = result + (char)(value - shift);
        }
        
      }
      else //space, numbers or other characters, no Ceaser Ciphers.
      {
        result = result + message.charAt(i);
      }
    }
    return result;
  }
  
}