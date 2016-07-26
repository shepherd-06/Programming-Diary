import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        
        for(int t = 0; t < testCase; t++)
        {
            int row = sc.nextInt();
            int column = sc.nextInt();
            
            String [][]forest = new String[row][column];
            
            int X_co = 0, Y_co = 0;
            
            //populating the forst;
            for(int x = 0; x < row; x++)
            {
                String line = sc.next();
                
                for(int y = 0; y < column; y++)
                {
                    char c = line.charAt(y);
                    
                    forest[x][y] = c + "";
                    
                    if(c == 'M')
                    {
                        X_co = x;
                        Y_co = y;
                    }
                }
            }
            
            
            int guess = sc.nextInt(); //RON's guess
            //INPUT DONE
            
            BFS(forest, X_co, Y_co, guess);
        }
        
    }
        
    private static String [][]maze;
    private static ArrayList<Integer> queue; //to hold the index of current traverse
    private static ArrayList<Integer> X, Y; //to hold the co-ordinates to traverse
    private static ArrayList<Integer> oldX, oldY;
    private static int number_of_guesses;
    private static int row, column;

    public static void BFS(String [][]forest, int startX, int startY, int guess)
    {
        queue = new ArrayList<Integer>();
		X = new ArrayList<Integer>();
		Y = new ArrayList<Integer>();
        oldX = new ArrayList<Integer>();
        oldY = new ArrayList<Integer>();
        
        maze = forest;
        number_of_guesses = guess;
        X.add(startX);
        Y.add(startY);
        queue.add(0); //the first index;
        //nothing has been traversed yet.
        traverse(); //LET THE traverse begin
    }
    
    //so left first, right second, up thrid and down fourth. 
    //check duplicate before input
    
    
    public static void traverse()
    {
        int counter = 1; // insert this index in queue which will point which index to check NEXT    
        while(!queue.isEmpty())   
        {
            int deadFlag = 0; //to mark the four dead flag;
            int index = queue.get(0); //get the head of the queue
            System.out.println("counter >> " + counter + " Current queue >> " + queue.get(0));
            queue.remove(0); //cut the top of the head in each phase
            int currentX = X.get(index);
            int currentY = Y.get(index);
            
            //left right check
            if(currentY >= 0 && currentY < maze[0].length - 1)
            {
                // LEFT first{row fix, column --}
                 // star
                if(maze[currentX][currentY - 1].equals("*"))
                {
                   int newX = currentX;
                   int newY = currentY - 1;
                    //duplicate check
                   boolean flag = duplicate(newX, newY);
                   
                   if(flag)
                   {
                       //add them to queue
                       X.add(newX);
                       Y.add(newY);
                       counter++;
                       queue.add(counter);
                       //not a dead End. add current to old
                       break;
                   }
                   
                }
                else if(maze[currentX][currentY - 1].equals("."))
                {
                    int newX = currentX;
                    int newY = currentY - 1;
                    //duplicate check
                    boolean flag = duplicate(newX, newY);
                   
                    if(flag)
                    {
                        //add them to queue
                        X.add(newX);
                        Y.add(newY);
                        counter++;
                        queue.add(counter);
                        //not a dead End. add current to old
                    }
                }
                else if(maze[currentX][currentY - 1].equals("X") || maze[currentX][currentY - 1].equals("M"))
                {
                    //does not matter, left is a dud
                    //X is a tree and M is starting point.
                    deadFlag++;
                }
                
                //----------------------------------------
                //right check [row same][column ++]
                if(maze[currentX][currentY + 1].equals("*"))
                {
                   int newX = currentX;
                   int newY = currentY + 1;
                    //duplicate check
                   boolean flag = duplicate(newX, newY);
                   
                   if(flag)
                   {
                       //add them to queue
                       X.add(newX);
                       Y.add(newY);
                       counter++;
                       queue.add(counter);
                       //not a dead End. add current to old
                       break;
                   }
                   
                }
                else if(maze[currentX][currentY + 1].equals("."))
                {
                    int newX = currentX;
                    int newY = currentY + 1;
                    //duplicate check
                    boolean flag = duplicate(newX, newY);
                   
                    if(flag)
                    {
                        //add them to queue
                        X.add(newX);
                        Y.add(newY);
                        counter++;
                        queue.add(counter);
                        //not a dead End. add current to old
                    }
                }
                else if(maze[currentX][currentY + 1].equals("X") || maze[currentX][currentY + 1].equals("M"))
                {
                    //does not matter, left is a dud
                    //X is a tree and M is starting point.
                    deadFlag++;
                }
            }
            //done with left and right check
            //check UP and DOWN
            else if(currentX - 1>= 0 && currentX < maze.length - 1)
            {
                // UP first{row --, column fix}
                 // star
                if(maze[currentX - 1][currentY].equals("*"))
                {
                   int newX = currentX - 1;
                   int newY = currentY;
                    //duplicate check
                   boolean flag = duplicate(newX, newY);
                   
                   if(flag)
                   {
                       //add them to queue
                       X.add(newX);
                       Y.add(newY);
                       counter++;
                       queue.add(counter);
                       //not a dead End. add current to old
                       break;
                   }
                   
                }
                else if(maze[currentX - 1][currentY].equals("."))
                {
                    int newX = currentX - 1;
                    int newY = currentY;
                    //duplicate check
                    boolean flag = duplicate(newX, newY);
                   
                    if(flag)
                    {
                        //add them to queue
                        X.add(newX);
                        Y.add(newY);
                        counter++;
                        queue.add(counter);
                        //not a dead End. add current to old
                    }
                }
                else if(maze[currentX - 1][currentY].equals("X") || maze[currentX - 1][currentY].equals("M"))
                {
                    //does not matter, left is a dud
                    //X is a tree and M is starting point.
                    deadFlag++;
                }
                
                //----------------------------------------
                //DOWN check [row + 1][column SAME]
                if(maze[currentX + 1][currentY].equals("*"))
                {
                   int newX = currentX + 1;
                   int newY = currentY;
                    //duplicate check
                   boolean flag = duplicate(newX, newY);
                   
                   if(flag)
                   {
                       //add them to queue
                       X.add(newX);
                       Y.add(newY);
                       counter++;
                       queue.add(counter);
                       //not a dead End. add current to old
                       break;
                   }
                   
                }
                else if(maze[currentX + 1][currentY].equals("."))
                {
                    int newX = currentX + 1;
                    int newY = currentY;
                    //duplicate check
                    boolean flag = duplicate(newX, newY);
                   
                    if(flag)
                    {
                        //add them to queue
                        X.add(newX);
                        Y.add(newY);
                        counter++;
                        queue.add(counter);
                        //not a dead End. add current to old
                    }
                }
                else if(maze[currentX + 1][currentY].equals("X") || maze[currentX + 1][currentY].equals("M"))
                {
                    //does not matter, left is a dud
                    //X is a tree and M is starting point.
                    deadFlag++;
                }
            }
            //when all the current co-ordinate is NOT Found dud, (check all four), add it to OLDX or else DON'T
            if(deadFlag != 4)
            {
                //current co-ordinate is not a dud.
                oldX.add(currentX);
                oldY.add(currentY);
            }
        }
        
        System.out.println("Printing the Current Co-Ordinates");
        for(int i = 0; i < oldX.size(); i++)
        {
            System.out.println("X -> "+oldX.get(i) + " Y -> "+oldY.get(i));
        }
    }
    
    public static boolean duplicate(int newX, int newY)
    {
        for(int i = 0; i < X.size(); i++)
        {
            if(X.get(i) == newX && Y.get(i) == newY)
            {
                //duplicate - co-ordinate already traveresed or will be
                return false;
            }
        }
        //unique co-ordinate
        return true;
    }
}
