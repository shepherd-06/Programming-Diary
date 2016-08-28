import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class kangaroo {

/*
*
* Algorithms HackerRank
* https://www.hackerrank.com/challenges/kangaroo
*
* iBtehaz sHawon - ibtehaz.shawon@gmail.com
*
*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        if(x1 < x2 && v1 < v2)
        {
           //check 100 position to take a decision
            int step = 10000;
            
            int k1 = x1;
            int k2 = x2;
            
            while(step > 0)
            {
                k1 += v1;
                k2 += v2;
                
                if(k1 == k2)
                {
                    System.out.println("YES");
                    break;
                }
                step--;
            }
            
            if(step == 0)
            {
                System.out.println("NO");
            }
        }
        else
        {
            int step = 10000;
            
            int k1 = x1;
            int k2 = x2;
            
            while(step > 0)
            {
                k1 += v1;
                k2 += v2;
                
                if(k1 == k2)
                {
                    System.out.println("YES");
                    break;
                }
                step--;
            }
        }
    }
}

