public class perfectPair
{
  public static void main(String[]args)
  {
    int[]array = {1,4,2,3,0,5};
    System.out.println(pairwise(array,7));
  }
  
  public static int pairwise(int[] a, int N) {
    int r = 0; 
    
    for(int i = 0; i < a.length; i++)
    {
      for(int j = i + 1; j < a.length; j++)
      {
        if(a[i] + a[j] == N)
        {
          r+= i + j;
          a[i] = a[j] = -1;
        }
      }
    }
    return r;
    
  }
  
}