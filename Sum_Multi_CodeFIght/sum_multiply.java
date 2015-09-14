public class sum_multiply
{
  /*
   * Find the number of N-digit numbers whose sum of digits equals their product.
   * The result should have 2 numbers: the number of N-digit numbers and 
   * the smallest among them.
   * 
   * https://codefights.com/challenge/edB9wDjgpFCG6BdgR
   * 
   * ibtehaz shawon
   * ibtehaz.shawoN@gmail.com
   */
  
  public static void main(String[]args)
  {
    System.out.println(SumAndMultiply(1));
    System.out.println("_______-----   1  -----__________");
    System.out.println(SumAndMultiply(2));
    System.out.println("_______-----   2  -----__________");
    System.out.println(SumAndMultiply(3));
    System.out.println("_______-----   3   -----__________");
    System.out.println(SumAndMultiply(4));
    System.out.println("_______------        4       ----__________");
    System.out.println(SumAndMultiply(5));
    System.out.println("_______------       5          ----__________");
    System.out.println(SumAndMultiply(6));
    System.out.println("_______-----       6     -----__________");
    System.out.println(SumAndMultiply(7));
    System.out.println("_______------           7        ----__________");
    System.out.println(SumAndMultiply(8));
    System.out.println("_______---- 8        ------__________");
    System.out.println(SumAndMultiply(9));
    System.out.println("_______-----       9        -----__________");
    System.out.println(SumAndMultiply(10));
    System.out.println("_______------         10     ----__________");
  }
  
  static String SumAndMultiply(int N) 
  {
    long one = System.nanoTime();
    int number = 0, low = -1;
    int start = (int)Math.pow(10, N-1);
    if(N == 1) 
    {
      number++;
      low = 0;
    }
    
    int end = (int)Math.pow(10,N);
    
    
    for(; start < end; start++)
    {
      int i = start, sum = 0, pro = 1;
      
      while (i != 0)
      {
        sum += i % 10;
        pro *= i % 10;
        i /= 10;
      }
      
      if(sum == pro)
      {
        if(number == 0) low = start;
        number++;
      }
    }
    long two = System.nanoTime();
    System.out.println("execution time of "+N+" is >> "+(two - one)/1000000000.0);
    return number + " "+low;
  }
  
}