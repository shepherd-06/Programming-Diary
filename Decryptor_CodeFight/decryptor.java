public class decryptor
{
  /*Once there was a hacker called Encryptor who used to hack complex things. 
   * One time he got stuck with a simple problem: he was not able to decode a string 
   * (probably because he had been working only on complex problems before). 
   * So he needs your help.
   * Given some sample cases, build an algorithm that decodes the given string.
   * To decode a string you have to reverse each letter in it. 
   * Letter a is replaced with z, b with y , ..., z with a. 
   * Remember that the output will always consist of meaningful English words.
   * A string that can contain capital letters, small letters, numbers and spaces.
   * 
   * https://codefights.com/challenge/Bw9vwy3xHtyDrajyy
   * 
   * Ibtehaz Shawon
   * ibtehaz.shawon@gmail.com
   */
  
  public static void main(String[]args)
  {
    System.out.println(HackIt("XlwvUrtsgh"));
    System.out.println(HackIt("XlwvUrtsgh Lofty and dazy 9222"));
  }
  
  static String HackIt(String str) 
  {
    String result = "";
    
    for(int i = 0; i < str.length(); i++)
    {
      char c= str.charAt(i);
      
      if(c >= 'A' && c <= 'Z')
      {
        result = result + (char)('Z' - c + 'A');
      }
      else if(c >= 'a' && c <= 'z')
      {
        result = result + (char)('z' - c + 'a');
      }
      else 
      {
        result = result + c;
      }
    }
    return result;
    
  }
  
}