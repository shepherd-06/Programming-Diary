import java.math.*;
public class lastSum
{
  /*You have to return the last digit of the sum 1^1+2^2+3^3 + ... +N^N.
   * 
   * https://codefights.com/challenge/BNLZseQgvXBRPPBFr
   * 
   * ibtehaz shawon
   * ibtehaz.shawon@gmail.com
   */
  public static void main(String[]args)
  {
//    System.out.println(last("2"));
//    System.out.println(last("5"));
//    System.out.println(last("8"));
//    System.out.println(last("10"));
    System.out.println(last2("200"));
    System.out.println(last2("2000"));
  }
  
  static int last2(String N)
  {
    BigInteger number = new BigInteger(N);
    BigInteger result = new BigInteger("0");
    BigInteger i = new BigInteger("1");
    System.out.println("number >> "+number);
    
    while(i.compareTo(number) <= 0 ) //while i is less than or equal to number
    {
      BigInteger pow = power(i);
      result = result.add(pow);
      i = i.add(BigInteger.ONE);
    }
    N = result+"";
    N = N.charAt(N.length()-1) + "";
    int newNumber = Integer.parseInt(N);
    System.out.println("final result >> "+N);
    return newNumber;
  }
  
  static BigInteger power(BigInteger number)
  {
    /*
     * Assistant function to get the power of a biginteger number
     */
    BigInteger i = BigInteger.ONE;
    BigInteger result = BigInteger.ONE;
    
    while(i.compareTo(number) <= 0)
    {
      result = result.multiply(number);
    }
    return result;
    
  }
  
  static int last(String N)  //method works for long numbers only.
  {
    long number = Long.parseLong(N);
    long result = 0;
    
    System.out.println("number >> "+number);
    
    for(long i = 1; i <= number; i++)
    {
      result += (long)Math.pow(i,i);
      //System.out.println("i >> "+result);
    }
    N = result+"";
    N = N.charAt(N.length()-1) + "";
    int newNumber = Integer.parseInt(N);
    System.out.println("final result >> "+N);
    return newNumber;
  }
  
}