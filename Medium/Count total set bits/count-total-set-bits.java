//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        // Your code here
        // int count=0;
        // for(int i=1;i<=n;i++){
        //     int number=i;
        //     while(number>0){
        //         number&=(number-1);
        //         count++;
        //     }
        // }
        // return count;
        int count=0;
        int bCount=0;
        while((1<<bCount)<=n){
            int p=(n+1)/(1<<(bCount+1));
            count+=p*(1<<bCount);
            int r=(n+1)%(1<<(bCount+1));
            count+=Math.max(0,r-(1<<bCount));
            bCount++;
        }
        return count;
    }
}

//{ Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		}
	}
}

// } Driver Code Ends