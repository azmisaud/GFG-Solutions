//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int grid[][] = new int[9][9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                grid[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            if(ob.SolveSudoku(grid) == true)
                ob.printGrid(grid);
            else
                System.out.print("NO solution exists");
            System.out.println();
            
        }
    }
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    static boolean canWePutTheNumber(int[][] grid, int row, int column, int number){
        for(int i=0;i<grid.length;i++){
            if(grid[i][column]==number){
                return false;
            }
            if(grid[row][i]==number){
                return false;
            }
        }
        int gridRow=(row/3)*3;
        int gridColumn=(column/3)*3;
        for(int i=gridRow;i<gridRow+3;i++){
            for(int j=gridColumn;j<gridColumn+3;j++){
                if(grid[i][j]==number){
                    return false;
                }
            }
        }
        return true;
    }
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(grid[i][j]==0){
                    for(int m=1;m<=9;m++){
                        if(canWePutTheNumber(grid,i,j,m)){
                            grid[i][j]=m;
                            if(SolveSudoku(grid)) return true;
                            grid[i][j]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(grid[i][j]+" ");
            }
        }
    }
    
}