public class decimalToHexa
{
  /*
   *Given a number, convert it into a Hexa-Decimal number.
   * 
   * https://codefights.com/challenge/RzXAJabE24xeGQP5N
   * 
   * Ibtehaz Shawon
   * ibtehaz.shawon@gmail.com
   */
  public static void main(String[]args)
  {
    System.out.println(hexa(29));
    System.out.println(hexa(12));
    System.out.println(hexa((int)Math.pow(10,6)));
  }
  
  static String hexa(int h) 
  {
    String []value = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
    String result = "";
    while(h != 0)
    {
      result = value[h % 16]+result;
      h = h / 16;
    }
    return result;
  }
  
  
}