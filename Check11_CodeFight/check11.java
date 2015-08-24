public class check11
{
  public static void main(String[]args)
  {
    System.out.println(Check("11"));
    System.out.println(Check("12"));
    System.out.println(Check("0"));
  }
  
  static boolean Check(String N) 
  {
    int number = 0;
    for(int i = 0; i < N.length(); i++)
    {
      number = number * 10 + Integer.parseInt(N.charAt(i)+"");
    }
    if(number % 11 == 0)
      return true;
    return false;
  }
  
}