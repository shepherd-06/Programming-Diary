import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class mars {

/*
*
* Algorithms HackerRank
* https://www.hackerrank.com/challenges/mars-exploration
*
* iBtehaz sHawon - ibtehaz.shawon@gmail.com
*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int result = 0;
        
        for(int i = 0; i < S.length(); i = i + 3)
        {
            String sub = S.substring(i, i+3);
            
            if(sub.equalsIgnoreCase("SOS"))
            {
                continue;
            }
            else
            {
                if(sub.charAt(0) != 'S')
                {
                    result++;
                }
                
                if(sub.charAt(1) != 'O')
                {
                    result++;
                }
                
                if(sub.charAt(2) != 'S')
                {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}

