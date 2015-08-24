public class search_codeFight
{
  /*Given an array of positive integers and a search element x. 
   * Return the first index of x in the array (as a string). 
   * if x is in not in the array, return "Not found"
   * 
   * https://codefights.com/challenge/xmeXBNxaCBS3Cqp3i
   * 
   * Ibtehaz Shawon
   * ibtehaz.shawon@gmail.com
   */
  public static void main(String[]args)
  {
    int [] a = {1,2,3,4,5};
    System.out.println(search(a,6));
    System.out.println(search(a,2));
  }
  static String search(int[] array, int find) 
  {
    int counter = 0;
    for(int arrayValue:array)
    {
      if(arrayValue == find)
        return counter+"";
      else 
        counter++;
    }
    return "Not found";
  }

}