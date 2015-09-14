public class compareSum_of_digits
{
  public static void main(String[]args)
  {
    int number = (int)Math.pow(10,100);
    System.out.println(Math.pow(2,32) - Math.pow(10,100));
    //System.out.println(compareSumOfDigits("012345"));
    System.out.println(compareSumOfDigits(number+""));
  }
  
  static int compareSumOfDigits(String N) 
  {
    long odd = 0, even = 0;
    long number = Long.parseLong(N);
    
    while(number != 0)
    {
      long temp = number % 10;
      number /= 10;
      System.out.println("number >> "+number + " temp >> "+temp );
      if(temp % 2 == 1)odd += temp;
      else even += temp;
      
      System.out.println("odd >> "+odd + " even >> "+even );
      
    }
    
    return (int)(odd - even);
    
  }
  
}