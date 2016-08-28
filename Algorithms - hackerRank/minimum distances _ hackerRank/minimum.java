import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class minimum {

/*
*
* Algorithms HackerRank
* https://www.hackerrank.com/challenges/minimum-distances
*
* iBtehaz sHawon - ibtehaz.shawon@gmail.com
*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int array[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            array[A_i] = in.nextInt();
        }
        
        int result = 0;
        
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i + 1; j < array.length; j++)
            {
                if(array[i] == array[j] && i != j)
                {
                    int temp = i - j;
                    temp = Math.abs(temp);
                    
                    if(result == 0)
                        result = temp;
                    else
                    {
                        if(result > temp)
                            result = temp;
                    }
                }
            }
        }
        
        if(result == 0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(result);
        }
    }
}

