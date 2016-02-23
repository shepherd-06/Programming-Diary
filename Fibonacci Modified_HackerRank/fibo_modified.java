import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class fibo_modified {

	/*
	*https://www.hackerrank.com/challenges/fibonacci-modified
	*
	*ibtehaz shawon 
	*ibtehaz.shawon@gmail.com
	*/

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Soluton. */
        
        Scanner sc = new Scanner(System.in);
        String one = sc.next();
        String two = sc.next();
        int limit = sc.nextInt();
       
        BigInteger first, second, sum;
        
        first = new BigInteger(one);
        second = new BigInteger(two);
        sum = new BigInteger("0");
        
        
        for(int i = 2; i < limit; i++)
        {
            sum = second.multiply(second);
            sum = sum.add(first);
            
            first = second;
            second = sum;
        }
        System.out.println(second);
    }
}