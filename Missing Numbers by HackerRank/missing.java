import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/*
* Problem Link : https://www.hackerrank.com/challenges/missing-numbers
* Ibtehaz Shawon 
* http://www.ibtehaz.ninja
* 
* {Wrong Answer : Time out Error (2), Wrong Answer (1) out of 5
*/

public class missing {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String []array1;
        String []array2;
        int length1;
        int length2;
        
        Scanner sc = new Scanner(System.in);
        
        length1 = sc.nextInt();
        array1 = new String[length1];
        
        //take input for array1
        for(int i = 0; i < length1; i++)
        {
            array1[i] = "" + sc.nextInt();
        }
        
        length2 = sc.nextInt();
        array2 = new String[length2];
        
        //take input for array2
        for(int i = 0; i < length2; i++)
        {
            array2[i] = "" + sc.nextInt();
        }
        
        //delete the numbers equal
        for(int i = 0; i < length2; i++)
        {
            for(int j = 0; j < length1; j++)
            {
                if(array2[i].equals(array1[j]) && !array2[i].equals("--"))
                {
                    array2[i] = "--";
                    array1[j] = "--";
                    j = length1;
                }
            }
        }
        
        
        //find the remaining numbers
        int []result = new int[length2 - length1];
        int counter = 0;
        
        for(int i = 0; i < length2; i++)
        {
            if(!array2[i].equals("--"))
            {
               int temp = Integer.parseInt(array2[i]);
               boolean flag = false;
                
               //sorting out duplicate multiple numbers
               for(int j = 0; j < counter; j++)
               {
                   if(temp == result[j])
                   {
                       j = counter;
                       flag = true;
                   }
               }
                
               if(!flag)
               {
                   result[counter] = temp;
                   counter++;
               }
            }
        }
        
        //sort
        for(int i = 0; i < result.length; i++)
        {
            for(int j = i + 1; j < result.length; j++)
            {
                if(result[i] > result[j])
                {
                    int temp = result[i];//the larger number;
                    result[i] = result[j]; //swap the smaller number;
                    result[j] = temp; //put the larger one;
                }
            }
        }
        
        //print
        for(int i = 0; i < result.length; i++)
        {
            //hangle zero
            String print = "";
            if(result[i] != 0)
            {
                print += result[i];    
            }
            
            if(i != result.length - 1)
            {
                print+= " ";
            }
            System.out.print(print);
        }
        
        
        //possible time out error
        //got duplicate numbers as well
    }
}
