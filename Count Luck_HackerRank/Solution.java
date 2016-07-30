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
    private static int number_of_guesses;

    public static void BFS(String [][]forest, int startX, int startY, int guess)
    {
        queue = new ArrayList<Integer>();
		X = new ArrayList<Integer>();
		Y = new ArrayList<Integer>();
        
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
        int totalGuess = 0;
        while(!queue.isEmpty())   
        {
            int chances = 0; //to trigger how many chances are there
            int index = queue.get(0); //get the head of the queue
            //System.out.println("counter >> " + counter + " Current queue >> " + queue.get(0));
            queue.remove(0); //cut the top of the head in each phase
            
            int currentX = X.get(index);
            int currentY = Y.get(index);
            System.out.println("Current Co - X >> "+currentX + " Y >> "+currentY);
            
            //left check ONLY
            if(currentY > 0)
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
                       System.out.println("ADDING X >> "+newX + " Y >> "+newY);
                       X.add(newX);
                       Y.add(newY);
                       queue.add(counter);
                       counter++;
                       chances++;
                       System.out.println("Bingo Bango Bongo");
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
                        System.out.println("ADDING X >> "+newX + " Y >> "+newY);
                        //add them to queue
                        X.add(newX);
                        Y.add(newY);
                        queue.add(counter);
                        counter++;
                        chances++; // increase the number of chances
                    }
                }
            }
            //RIGHT CHECK
            if(currentY < maze[0].length - 1)
            {
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
                       System.out.println("ADDING X >> "+newX + " Y >> "+newY);
                       //add them to queue
                       X.add(newX);
                       Y.add(newY);
                       queue.add(counter);
                       counter++;
                       chances++; //increase the number of chances
                       System.out.println("Bingo Bango Bongo");
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
                        System.out.println("ADDING X >> "+newX + " Y >> "+newY);
                        //add them to queue
                        X.add(newX);
                        Y.add(newY);
                        queue.add(counter);
                        counter++;
                        chances++;
                        //increase the number of chances
                    }
                }
            }
            
            //done with left and right check
            //check UP ONLY
            if(currentX > 0)
            {
                // UP first{row --, column fix}
                 // star
                System.out.println("status for 1 - 9 "+currentX);
                if(maze[currentX - 1][currentY].equals("*"))
                {
                   int newX = currentX - 1;
                   int newY = currentY;
                    //duplicate check
                   boolean flag = duplicate(newX, newY);
                   
                   if(flag)
                   {
                       System.out.println("ADDING X >> "+newX + " Y >> "+newY);
                       //add them to queue
                       X.add(newX);
                       Y.add(newY);
                       queue.add(counter);
                       counter++;
                       chances++;
                       System.out.println("Bingo Bango Bongo");
                       break;
                   }
                   
                }
                else if(maze[currentX - 1][currentY].equals("."))
                {
                    int newX = currentX - 1;
                    int newY = currentY;
                    //duplicate check
                    boolean flag = duplicate(newX, newY);
                    System.out.println("Status Duplicate UP : <true means NO> "+flag);
                   
                    if(flag)
                    {
                        System.out.println("ADDING X >> "+newX + " Y >> "+newY);
                        //add them to queue
                        X.add(newX);
                        Y.add(newY);
                        queue.add(counter);
                        counter++;
                        chances++;
                        //not a dead End. add current to old
                    }
                }
            }
            if(currentX < maze.length - 1)
            {
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
                       System.out.println("ADDING X >> "+newX + " Y >> "+newY);
                       //add them to queue
                       X.add(newX);
                       Y.add(newY);
                       queue.add(counter);
                       counter++;
                       chances++;
                       System.out.println("Bingo Bango Bongo");
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
                        System.out.println("ADDING X >> "+newX + " Y >> "+newY);
                        //add them to queue
                        X.add(newX);
                        Y.add(newY);
                        queue.add(counter);
                        counter++;
                        chances++;
                    }
                }
            }
            
            if(chances > 1)
            {
                totalGuess++;
            }
            
            //System.out.println("-----------------------------------");
            //for(int i = 0; i < X.size(); i++)
           // {
            //    System.out.println("X >> "+X.get(i) + " Y >> "+Y.get(i));
            //}
            //System.out.println("Current Queue index >> "+index);
            //System.out.println("----------------$$$$-------------------");
        }
        
        System.out.println("-----------------------------------");
        System.out.println("Printing the Current Co-Ordinates");
        for(int i = 0; i < X.size(); i++)
        {
            System.out.println("X -> "+X.get(i) + " Y -> "+Y.get(i));
        }
        System.out.println("Total Guess : "+totalGuess);
        System.out.println("----------------$$$$-------------------");
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
