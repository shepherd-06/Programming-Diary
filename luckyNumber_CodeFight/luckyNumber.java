public class luckyNumber
{
  /*
   *A number is called lucky if it consists only of digits 4 and 7. 
   * For example, 44, 747, 4 are lucky numbers, and 745, 423, 111 are not. 
   * Your task is to find the smallest lucky number in range [L, R] , 
   * and if there is none you should return -1.
   * 
   * https://codefights.com/challenge/5EXaBBd9sCbKeyzbo 
   * 
   * ibtehaz shawon
   * ibtehaz.shawon@gmail.com
   */
  public static void main(String[]args)
  {
    System.out.println(LuckyNum2(4,7));
    System.out.println(LuckyNum2(1,3));
  }
  
  static int LuckyNum2(int L, int R)
  {
    //basic 
    if(L == R)
      return -1;
    
    boolean flag = true;
    for(int i = L; i != 0; i /= 10)
    {
      int rem = i % 10; 
      if(rem == 4 || rem == 7)
      {}
      else
      {
        flag = !flag;
        break;
      }
    }
    if(flag) return L;
    else
      LuckyNum2(++L, R);
    return -1;
  }
  
  static int LuckyNum(int L, int R) 
  {
    for(; L <= R; L++)
    {
      boolean flag = true;
      int i = L;
      
      while( i != 0)
      {
        
        int rem = i % 10; 
        i /= 10;
        if(rem == 4 || rem == 7)
        {}
        else
        {
          flag = false;
          break;
        }
      }
      if(flag)
        return L;
    }
    return -1;
  
  }

}