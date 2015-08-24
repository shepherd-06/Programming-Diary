import java.math.*;
public class SumOfN
{
  /*Find the sum of all N-digit numbers.
   * 
   * https://codefights.com/challenge/sb7yu3kJ8pMX9vDXc
   * 
   * Ibtehaz Shawon
   * ibtehaz.shawon@gmail.com
   */
  
  public static void main(String[]args)
  {
    System.out.println(Sum(1));
    System.out.println(Sum(2));
    System.out.println(Sum(3));
    System.out.println(Sum(10));
    System.out.println(Sum(15));
    System.out.println(Sum(17));
    System.out.println(Sum(20));
    System.out.println(Sum(20));
    System.out.println(Sum(20));
  }
  
  static String Sum(int N) 
  {
    BigInteger result = new BigInteger("0");
    BigInteger i = new BigInteger((int)Math.pow(10, N-1)+"");
    BigInteger length = new BigInteger((int)Math.pow(10, N)+"");
    
    while(!i.equals(length))
    {
      result = result.add(i);
      i = i.add(new BigInteger("1"));
    }
    return result+"";
  }
  
}