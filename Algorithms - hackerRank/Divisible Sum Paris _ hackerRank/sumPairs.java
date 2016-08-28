import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sumPairs {

/*
* Algorithms HackerRank
* https://www.hackerrank.com/challenges/divisible-sum-pairs
* iBtehaz sHawon - ibtehaz.shawon@gmail.com
*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int numbers[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            numbers[a_i] = in.nextInt();
        }
        
        int result = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = i + 1; j < numbers.length; j++)
            {
                int sum = numbers[i] + numbers[j];
                if( sum % k == 0)
                {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}

