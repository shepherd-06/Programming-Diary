public class ATM
{
  /*An ATM ran out of 10 dollar bills and only has 100, 50 and 20 dollar bills. 
   * Given an amount between 40 and 1000 dollars (inclusive) and assuming 
   * that the ATM wants to use as few bills as possible, 
   * determinate the minimal number of 100, 50 and 20 dollar bills
   * the ATM needs to dispense (in that order).
   */
  
  /*Corner Case: 110, 130, 160
   */
  
  /*
   * Ibtehaz Shawon - ibtehaz.shawon@gmail.com
   */
  public static void main(String[]args)
  {
    int [] array = withdraw(110);
    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);
  }
  
  static int[] withdraw(int N) 
  {
    int [] result = new int[3];
    int a = 100, b = 50, c = 20, value = 0;
    // value stands for valuealue of the divalueisor. 
    while(true)
    {
      if((N - value * c) % b == 0 
           || (N - value * c) % a == 0 
           && N % a != 0 
           && N % b != 0)
      {
        result[2] = value;
        N-=value*c;
        value = 0;
        break;
      }
      else if(N - value * c < 0
                || N % a == 0 
                || N % b == 0)
      {
        break;
      }
      else
      {
        value++;
      }
    }
    
    while(true && N != 0)
    {
      if((N - value * b) % a == 0 
           && N % a != 0)
      {
        result[1] = value;
        N-=value*b;
        value = 0;
        break;
      }
      else if(N - value * b < 0 
                || N % a == 0)
      {
        break;
      }
      else
      {
        value++;
      }
    }
    
    while(true && N != 0)
    {
      if(N - value * a == 0)
      {
        result[0] = value;
        N-=value*a;
        value = 0;
        break;
      }
      else
      {
        value++;
      }
    }
    return result;
    
  }
  
}