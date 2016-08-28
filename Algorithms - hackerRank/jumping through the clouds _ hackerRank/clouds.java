import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class clouds {

/*
* <--------------incomplete----------------->
* Algorithms HackerRank
* https://www.hackerrank.com/challenges/jumping-on-the-clouds
*
* iBtehaz sHawon - ibtehaz.shawon@gmail.com
*
*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int clouds[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            clouds[c_i] = in.nextInt();
        }
        
        int step = 0;
        int current = 0;
        
        while(current != (n - 1))
        {
            if(clouds[current + 1] == 0)
            {
                //check if one step ahead is thunderCloud
                if(current + 2 >= (n - 1) && current + 1 == n)
                {
                    step++;
                    current++; //game over;
                }
                else //no, 
                {
                    if(current + 2 <= (n-1))
                    {
                        if(clouds[current + 2] == 0)//okay clouds
                        {
                            //jump 2
                            current += 2;
                            step++;
                        }
                    }
                    else
                    {
                        current++;
                        step++;
                    }
                }
            }
            else
            {
                current+=2;
                step++;
            }
        }
        
        System.out.println(step);
    }
}

