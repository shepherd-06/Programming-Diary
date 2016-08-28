import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class camelCase {

/*
* HackerRank algorithm 
* https://www.hackerrank.com/challenges/camelcase
*
* iBtehaz sHawon - ibtehaz.shawon@gmail.com
*
*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int counter = 0; //to count the number of words
        String temp = "";
            
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            
            if(i == 0)
            {
                temp += c;
            }
            else
            {
                int ascii = (int)c;
                
                if(c >= 65 && c <= 90)
                {
                    //camelCase new word\
                    counter++;// new word found. increment
                    temp = "";
                    temp += c;
                }
                else
                {
                    temp += c;
                }
            }
        }
        
        //add the last word
        counter++;
        System.out.println(counter);
    }
}

