import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class compare {

/*
* Algorithms HackerRank
* https://www.hackerrank.com/challenges/compare-the-triplets
*
* iBtehaz sHawon - ibtehaz.shawon@gmail.com
*
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int []alice = new int[3];
        int []bob = new int[3];
        
        int []result = new int[2]; // 0 is for alice, 1 is for bob
        
        
        for(int i = 0; i < 3; i++)            
        {
            alice[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 3; i++)            
        {
            bob[i] = sc.nextInt();
        }
        
        
        for(int i = 0; i < 3; i++)
        {
            if(alice[i] > bob[i]) //alice is greater
            {
                result[0]++;
            }
            else if(alice[i] < bob[i])//bob is greater
            {
                result[1]++;
            }
        }
        
        System.out.println(result[0] + " " + result[1]);
    }
}

