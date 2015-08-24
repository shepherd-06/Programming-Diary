public class morseCode_CodeFight
{
  /*Morse code is a method of transmitting text information as a series of . and - 
   * We need a function that given some text returns its representation in morse code.
   * Separate each character of the result with a whitespace 
   * and replace each original whitespace with two whitespaces (
   * to distinguish it from the spaces between morse characters)
   * input="ana" > output=".- -. .- "
   * 
   * https://codefights.com/challenge/tCQbdyJMzENW9z4b9
   * 
   * Ibtehaz Shawon
   * ibtehaz.shawon@gmail.com
   * 
   */
  public static void main(String[]args)
  {
    System.out.println(morse("ana y yo"));
  }
  
  static String morse(String text) 
  {
    String result = "";
    String [] array = {".-","-...","-.-.","-..",".","..-.",
      "--.","....","..",".---","-.-",".-.."
      ,"--","-.","---",".--.",
      "--.-",".-.","...","-","..-","...-"
      ,".--","-..-","-.--","--.."};
    text = text.toUpperCase();
    for(int i = 0; i < text.length(); i++)
    {
      int index = (int)text.charAt(i);
      System.out.println("i >> "+i+" result >> " +result+" index >> "+index);
      if(index == 32)
      {
        result = result + "  ";
      }
      else
      {
        result = result + array[index-65]+" ";
      }
    }
    
    return result;
  }
  
}