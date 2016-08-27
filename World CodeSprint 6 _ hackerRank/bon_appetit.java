import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bon_appetit {
/*
* World CodeSprint 6
* https://www.hackerrank.com/contests/world-codesprint-6/challenges/bon-appetit
* iBtehaz sHawon - ibtehaz.shawon@gmail.com
*
/

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int number_of_food = sc.nextInt();
        int not_eaten = sc.nextInt();
        
        int[] food = new int[number_of_food];
        int totalSum = 0;
        for(int i = 0; i < food.length; i++)
        {
            food[i] = sc.nextInt();
            
            if(i != not_eaten)
            {
                totalSum += food[i];    
            }
            
        }
        
        int charged_amount = sc.nextInt();
        int actual_amount = totalSum / 2;
        
        if(charged_amount == actual_amount)
        {
            System.out.println("Bon Appetit");
        }
        else
        {
             System.out.println(charged_amount - actual_amount);
        }
        
        
        
    }
}
