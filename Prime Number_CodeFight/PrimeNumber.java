import java.util.*;
public class PrimeNumber
{
  /*Given two integers a and b find all the prime numbers 
   * between them (including the borders).
   *
   * https://codefights.com/challenge/ZbGabd7jjYHRqePHy
   * 
   * Ibtehaz Shawon
   */
  public static void main(String[]args)
  {
    int c = 0;
    int[] result = primeCheck(1, 1000);
    
    for(int i = 0; i < result.length; i++)
    {
      System.out.println(result[i]);
      c++;
    }
//    
//    List<Integer> list = prime2(1,1000);

//    for(int i : list)
//    {
//      System.out.println(i);
//      c++;
//    }
    System.out.println("Total > "+c);
    
  }
  
  static List<Integer> prime2(int a, int b)
  {
    List<Integer> array = new ArrayList<Integer>();
    
    for(int i = a; i <= b; i++)
    {
      boolean f = false;
      for(int j = 2; j <= i/2; j++)
      {
        if(i % j == 0)
        {
          f = true;
          break;
        }
      }
      
      if(!f && i > 1)
      {
        array.add(i);
      }
    }
    return array;
  }
  
  static boolean isPrime(int a, int index)
  {
    if(a % index == 0)
    {
      System.out.println("a >> "+a+" index => "+index);
      return false;
    }
    else if(index <= a/2)
    {
      System.out.println("a @@ "+a+" index ** "+index);
      isPrime(a, index = index+1);
    }
    
    System.out.println("a $$ "+a+" index ## "+index);
    return true;
  }
  
  static int[] prime(int a, int b)
  {
    int [] result = new int[b - a];//result;
    if(a == 1)
      a+=2;
    result[0] = 2;
    int c = 1;
    
    for(; a <= b; a++)
    {
      //System.out.println("a == "+a+" isPrime(a,2) == "+isPrime(a,2));
      if(isPrime(a,2))
      {
        result[c] = a;
        c++;
      }
    }
    
    int []result2 = new int[c];
    for(int i = 0; i < c; i++)
      result2[i] = result[i];
    return result2;
  }
  
  static int[]primeCheck(int a, int b)
  {
    int []result = new int[b-a];
    if(a == 1)a=3;
    
    result[0] = 2;
    int c =1;
    
    System.out.println(">>> "+a);
    for(; a<=b; a++)
    {
      boolean flag = true;
      for(int i = 2; i < a; i++)
      {
        if(a%i == 0)
        {
          flag = false;
          break;
        }
      }
      if(flag)
      {
        result[c] = a;
        c++;
      }
    }
    
    int []result2 = new int[c];
    for(int i = 0; i < c; i++)
      result2[i] = result[i];
    return result2;
  }
}