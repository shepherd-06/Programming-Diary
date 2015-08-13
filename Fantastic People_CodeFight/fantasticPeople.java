import java.util.Scanner;
public class fantasticPeople
{
  public static void main(String[]args)
  {
    /*We have a society with npeople and have a table which describes 
     * if people in that society identify themselves with others in that society.
     * A fantastic person is a person who everyone identifies with 
     * and who doesn't identify with anybody else but himself.
     * If we have a Fantastic person in the society return their index 
     * (people are number from 0 to n-1), otherwise return -1.
     * 
     * Note : You can assume that in this society there are no two different people 
     * who both identify with each other. 
     * Thus if a identifies with b then b is guaranteed not to and vice versa.
     * 
     * Example when n=3 and the table looks as follows:
     * 
     *     0    1    2
     * 0[[True,True,True],
     * 1[False,True,True],
     * 2[False,False,True]]
     * 
     * We see that person 0 doesn't identify with anybody (except himself!)
     * person 1 identifies only with person 0. 
     * and person 2 identifies with 0 and 1. 
     * 
     * Hence person 0 is Fantastic.
     */
    
    /* Ibtehaz Shawon
     * 
     * https://codefights.com/challenge/9CnJXsfktk7353gLs
     */
    
    Scanner sc= new Scanner(System.in);
    int n = 3;
    boolean [][]table = new boolean[n][n];
    
    for(int i = 0; i < n; i++)
    {
      for(int j = 0; j < n; j++)
      {
        table[i][j] = sc.nextBoolean();
      }
    }
    sc.close();
    for(int i = 0; i < n; i++)
    {
      for(int j = 0; j < n; j++)
      {
        System.out.print(table[i][j] + " >> ");
      }
      System.out.println();
    }
    System.out.println(fantastic(n, table));
  }
  
  public static int fantastic(int n, boolean [][]table)
  {
    for(int i = 0; i < n; i++)
    {
      int check = 0;
      for(int j = 0; j < n; j++)
      {
        if(table[i][j])
          check++;
        else
          break;
        
      }
      if(check == n)
      {
        return i;
      }
    }
    return -1;
  }
  
  int FantasticPerson2(int n, boolean[][] table) {
  int r = -1;
  
  for(int i = 0; i < n; i++)
  {
    int c = 0;
    for(int j = 0; j < n; j++)
    {
      if(table[i][j])
        c++;
    }
    if(c == n)
    {
      r = i;
      break;
    }
  }
  return r;

}
 
}