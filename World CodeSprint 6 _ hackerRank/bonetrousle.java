import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bonetrousle {
/*
* World CodeSprint 6
* https://www.hackerrank.com/contests/world-codesprint-6/challenges/bonetrousle
*
* iBtehaz sHawon - ibtehaz.shawon@gmail.com
*
*/

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int trip = sc.nextInt();
        
        for(int t = 0; t < trip; t++)
        {
            int sticks = sc.nextInt(); //the total number of sticks to buy
            int store_box = sc.nextInt(); //amount of box store has
            int limit = sc.nextInt(); //amount of boxes I want to buy
            
            int total = 0;
            int []result = new int[limit];
            int tempLimit = limit;
            int []value = new int[store_box];
            
            for(int i = 0; i < value.length; i++)
            {
                value[i] = i + 1;
            }
            
            while(tempLimit > 0)
            {
                double temp = (store_box / tempLimit) * 1.0;
                
                int temp2 = (int)Math.ceil(temp);
                
                while(true)
                {
                    if(temp2 == value.length)
                    {
                        temp2 = 0;
                    }
                    
                    if(value[temp2] != -1)
                    {
                        value[temp2] = -1;
                        break;
                    }
                    else
                    {
                        temp2++;
                    }
                }
                
                total += temp2;
                tempLimit--;
                result[tempLimit] = temp2;
            }
            
            if(total == sticks)
            {
                for(int i = 0; i < limit; i++)
                {        
                    System.out.print(result[i]);
                    if(i != limit - 1)
                    {
                        System.out.print(" ");
                    }
                }
            }
            else
            {
                System.out.println(-1);
            }
            
            
                
        }
    }
}
