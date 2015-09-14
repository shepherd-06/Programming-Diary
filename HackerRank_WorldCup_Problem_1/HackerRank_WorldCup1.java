import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRank_WorldCup1 {

    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      int testCase = 10;
      int []array = new int[10];
      
      for(int i = 0; i < testCase; i++)
      {
        array[i] = sc.nextInt();
      }
      
      Arrays.sort(array);
      
      int sum = 0;
      sum = array[array.length - 1] + array[array.length - 3] + array[array.length - 5];
      System.out.println(sum);
    }
}