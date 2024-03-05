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
            System.out.println(ob.nextHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int confirmHappy(int N){
        if(N==1 || N==7) return 1;
        int sum=N;
        int current=N;
        while(sum>9){
            sum=0;
            while(current>0){
                int d=current%10;
                sum+=d*d;
                current/=10;
            }
            if(sum==1) return 1;
            current=sum;
        }
        if(sum==7) return 1;
        return 0;
    }
    static int nextHappy(int N){
        // code here
        int next=N+1;
        while(true){
            if(confirmHappy(next)==1) return next;
            next++;
        }
    }
}