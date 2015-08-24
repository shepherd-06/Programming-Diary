public class digital_sum
{
  /*The digital sum of any number is defined as the end result of repeatedly 
   * computing the sum of the digits until a single digit is obtained.
   * Find the digital sum of the given number.
   * 
   * https://codefights.com/challenge/hmnrz6mxXZWNRAkZu
   * 
   * ibtehaz shawon
   * ibtehaz.shawon@gmail.com
   */
  public static void main(String[]args)
  {
    System.out.println(Digital_sum(48484));
    System.out.println(Digital_sum2(48484));
    System.out.println(Digital_sum3(48484));
  }
  
  static int Digital_sum3(int arg1)
  {
     while(true)
     {
       int sum = 0;
       while (arg1 != 0) 
       {
         sum += arg1 % 10;
         arg1 /= 10;
       }
       if(String.valueOf(sum).length() == 1) return sum;
       arg1 = sum;
     }
  }
  
  static int Digital_sum2(int arg1)
  {
    int sum = 0; 
    while(true)
    {
      for(int i = 0; i < (arg1+"").length();i++)
        sum = sum + Integer.parseInt((arg1+"").charAt(i)+"");
      
      if(String.valueOf(sum).length() == 1) return sum;
      
      arg1 = sum;
      sum = 0;
    }
  }
  
  static int Digital_sum(int arg1) 
  {
    String input = arg1+"";
    int sum = 0; 
    
    while(true)
    {
      for(int i = 0; i < input.length(); i++)
      {
        sum = sum + Integer.parseInt(input.charAt(i)+"");
      }
      if((sum+"").length() == 1)
      {
        return sum;
      }
      else
      {
        input = sum+"";
        sum = 0;
      }
    }
  }

}