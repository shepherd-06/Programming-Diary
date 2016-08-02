import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
* problem -> https://www.hackerrank.com/challenges/count-luck
* 
* iBtehaz sHawon
* ( http://www.ibtehaz.ninja/count-luck-hackerrank/ )
*
*/

public class SolutionB {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int list_size1 = sc.nextInt();
        int []arrayA = new int[list_size1];
        
        for(int i = 0; i < list_size1; i++)
        {
            arrayA[i] = sc.nextInt();
        }
        
        int list_size2 = sc.nextInt();
        int []arrayB = new int[list_size2];
        int []quantityB = new int[10000];//to hold how many item of B are there
        
        for(int i = 0; i < list_size2; i++)
        {
            arrayB[i] = sc.nextInt();
            quantityB[arrayB[i]]++;
        }
        
        for(int i = 0; i < list_size1; i++)
        {
            quantityB[arrayA[i]]--;
        }
        
        boolean flag = false;
        for(int i = 0; i < quantityB.length; i++)
        {
            if(quantityB[i] != 0)
            {
                if(flag)
                {
                    System.out.print(" ");
                }
                System.out.print(i);
                flag = true;
            }
        }
        
    }
}
