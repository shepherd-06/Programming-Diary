public class nineDupe
{
  /*
   * A magician is to perform a magic trick. 
   * The audience should pick a favorite digit in range from 1 to 9, 
   * and she will return a number that consists of that digit written 9 times.
   * Your task is to write the shortest program that duplicates the given digit 9 times.
   * 
   * https://codefights.com/challenge/ck98S8KBPaaxYugnZ
   * 
   * ibtehaz shawon
   * ibtehaz.shawon@gmail.com
   */
  public static void main(String[]args)
  {
    System.out.println(nineDupe(1));
    System.out.println(nineDupe(9));
  }
  
  static int nineDupe(int n) 
  {
    int result = 0;
    for(int i = 1; i <= 9; i++)
      result=result * 10 + n;
    return result;
    
  }
  
}