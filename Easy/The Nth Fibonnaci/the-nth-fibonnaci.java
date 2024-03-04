//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

//User function Template for Java

class Solution{
    static int fib(int N){
        if (N==0) return 0;
        else {
        int[] f=new int[60];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<60;i++){
            f[i]=(f[i-1]+f[i-2])%10;
        }
        int index=(int) (N%60L);
        return f[index];
        }
        //code here
    }
}

//{ Driver Code Starts.
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
            System.out.println(ob.fib(N));
        }
    }
}
// } Driver Code Ends