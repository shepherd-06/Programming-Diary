import java.util.*;
public class sumGroups
{
  public static void main(String[]args)
  {
  }
  
  static int SumGroups(int[] arr) 
  {
    List list = new ArrayList();
    
    for(int i = 0; i < arr.length-1; i++)
    {
      if(arr[i] % 2 == 0)//even
      {
        if(arr[i + 1] % 2 == 0) //check if the next one is even
        {
        }
        else //if next is odd, add this one up.
        {
          
        }
      }
      else
      {
        if(arr[i+1] % 2 != 0)
        {
          
        }
        else
        {
          
        }
      }
    }
      
    
    return list.size();
  }
  
}