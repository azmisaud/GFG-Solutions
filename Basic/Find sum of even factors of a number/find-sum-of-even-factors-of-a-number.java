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
            System.out.println(ob.evenFactors(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int evenFactors(int N) 
    { 
        int sum=0;
        // code here
        for(int i=2;i<=N;i=i+2){
            if(N%i==0) sum+=i;
        }
        return sum;
    }
}