import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class combination_lock {
/*
* World CodeSprint 6
* https://www.hackerrank.com/contests/world-codesprint-6/challenges/combination-lock
*
* iBtehaz sHawon - ibtehaz.shawon@gmail.com
*
*/

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int [] initial_combination = new int[5];
        int [] final_combination = new int[5];
        
        for(int i = 0; i < 5; i++)
        {
            initial_combination[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 5; i++)
        {
            final_combination[i] = sc.nextInt();
        }
        
        int total = 0;
        for(int i = 0; i < 5; i++)
        {
            int init = initial_combination[i];
            int end = final_combination[i];
            
            if(init == end)
            {
                continue;
            }
            else
            {
                //there might be two roads.. either going backward or forward
                //determine which one is faster
                //first backward - decrease one by one.
                int step1 = 0;
                int tempInit = init;
                boolean flag = true;
                
                while(flag)
                {
                    tempInit--;
                    step1++;
                    
                    if(tempInit == -1)
                    {
                        tempInit = 9;
                    }
                    if(tempInit == end)
                    {
                        flag = false;
                    }
                }
                
                //second forward - increase by one
                int step2 = 0; 
                tempInit = init;
                flag = true;
                
                while(flag)
                {
                    tempInit++;
                    step2++;
                    
                    tempInit = tempInit % 10;
                    
                    if(tempInit == end)
                    {
                        flag = false;
                    }
                }
                //match
                if(step1 <= step2)
                {
                    total += step1;
                }
                else
                {
                    total += step2;
                }
            }
                
        }
        System.out.println(total);
        
    }
}
