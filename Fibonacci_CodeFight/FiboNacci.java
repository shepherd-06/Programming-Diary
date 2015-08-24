public class FiboNacci
{
  public static void main(String[]args)
  {
    System.out.println(isFibonacci(34));
    System.out.println(isFibonacci(0));
    System.out.println(isFibonacci(1));
    System.out.println(isFibonacci(33));
  }
  
  static boolean isFibonacci(int N) 
  {
    int index1 = 0, index2 = 1;
    
    if(N == 0)return true; // corner case.
    
    while((index1 + index2) <= N)
    {
      if(index1 + index2 == N)return true;
      else
      {
        int temp = index1 + index2;
        index1 = index2;
        index2 = temp;
      }
    }
    return false;
  }
}