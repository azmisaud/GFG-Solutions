//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.noOfDigits(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution{
    static long noOfDigits(int N){
        double p=(Math.pow((1.0+Math.sqrt(5))/2.0,N)-Math.pow((1.0-Math.sqrt(5))/2.0,N))/Math.sqrt(5);
        double m=Math.log10(p);
        return 1L+(long) Math.floor(m);
        // code here
    }
}