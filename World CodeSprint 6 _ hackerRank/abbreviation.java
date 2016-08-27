import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class abbreviation {

/*
*  World CodeSprint 6
*  https://www.hackerrank.com/contests/world-codesprint-6/challenges/abbr/copy-from/6786862
*
*  iBtehaz sHawon - ibtehaz.shawon@gmail.com
*
/

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        
        for(int i = 0; i < testCase; i++)
        {
            String first = sc.next();
            String second = sc.next();
            
            //the letters in second must appear chronologically in first.
            //keep a counter for appearance in first, if they are chronological then bingo bango bongo
            //else noope
            
            int []chrono = new int[second.length()];
            int counter = 0;
            int limit = 0;
            boolean flag = true; // true means YES
            
            for(int j = 0; j < second.length(); j++)
            {
                String two = "" + second.charAt(j);
                
                if(limit + 1 == first.length())
                {
                    flag = false; // NOT MATCH
                    j = second.length();
                }
                else if(limit == 0)
                {
                    int k = limit;
                    for(; k < first.length(); k++)
                    {
                        String one = "" + first.charAt(k);
                        
                        if(one.equalsIgnoreCase(two))
                        {
                          chrono[counter] = limit;
                          counter++;
                          limit = k;
                          k = first.length(); //break;
                        }
                    }
                    if(k == first.length())
                    {
                        flag = false; // NOT MATCH
                        j = second.length();
                    }
                    
                }
                else
                {
                    int k = limit + 1;
                    
                    for(; k < first.length(); k++)
                    {
                      String one = "" + first.charAt(k);

                      if(one.equalsIgnoreCase(two))
                      {
                          chrono[counter] = limit;
                          counter++;
                          limit = k;
                          k = first.length(); //break;
                          // I am already in chronological order
                      }
                    }
                    
                    if(k == first.length())
                    {
                        flag = false; // NOT MATCH
                        j = second.length();
                    }
                }
            }
            
            //check for chronological order
            for(int j = 1; j < chrono.length; j++)
            {
                if(chrono[j - 1] > chrono[j])
                {
                    flag = false;
                }
            }
            
            if(flag)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        
    }
}
