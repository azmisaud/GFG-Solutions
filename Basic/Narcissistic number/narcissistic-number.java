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
            System.out.println(ob.isNarcissistic(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int isNarcissistic(int N){
        // code her
        int temp=N;
        int sum=0;
        while(temp>0){
            int remainder=temp%10;
            sum=sum+(int) Math.pow(remainder,countDigits(N));
            temp/=10;
        }
        if(sum==N) return 1;
        else return 0;
    }
    static int countDigits(int num){
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}