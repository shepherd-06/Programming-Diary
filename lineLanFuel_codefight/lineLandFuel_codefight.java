public class lineLandFuel_codefight
{
  public static void main(String[]args)
  {
    int [] array= {-5,-2,2,7};
    int i = 2;
    array = LineLandFuel(i, array);
    
    for(int a :array)
      System.out.println(a);
  }
  
  static int[] LineLandFuel(int i, int[] city) 
  {
    int max, min;
    if(i == 0)
    {
      max = city[1];
      min = city[1];
    }
    else
    {
      max = city[0];
      min = city[0];
    }
    int index = city[i];
    for(i = 1; i < city.length;i++)
    {
      if(city[i] > max)
        max = city[i];
      else if(city[i] < min)
        min = city[i];
    }
    
    max = Math.abs(index)+Math.abs(max);
    min = Math.abs(index - min);
    
    int[]result ={max,min};
    return result;
    
  }
  
}