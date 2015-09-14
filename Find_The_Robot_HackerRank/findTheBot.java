import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * https://www.hackerrank.com/contests/w17/challenges/find-the-robot
 *
 * Ibtehaz Shawon
 * ibtehaz.shawon@gmail.com
 */

public class findTheBot {

    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int test = sc.nextInt();

      for(int t = 0; t < test; t++)
      {
        int turn = sc.nextInt();

        int iX = 0, iY = 0; //initial position
        //1 = right, 2 = up, 3 = left, 4 = down

        for(int n = 1; n <= turn; n++)
        {
          int value = n % 4;

          if(value == 1) iX += n;
          else if(value == 2) iY += n;
          else if(value == 3) iX -= n;
          else if(value == 0) iY -= n;
        }

        //System.out.println("final co-ordinate >> X >> "+iX + " <>< Y >> "+iY);
        System.out.println(iX + " "+iY);
      }

    }
}
