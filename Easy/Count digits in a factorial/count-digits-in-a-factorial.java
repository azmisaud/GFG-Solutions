//{ Driver Code Starts
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
            System.out.println(ob.facDigits(N));
        }
    }
}
// } Driver Code Ends




class Solution{
    static int facDigits(int N){
        if(N<0) return 0;
        else if(N==0) return 1;
        else {
            double m=(1.0/2.0)*(Math.log10(2)+Math.log10(Math.PI))+(1.0/2.0)*Math.log10(N)+N*(Math.log10(N)-Math.log10(Math.E));
            return 1+ (int) Math.floor(m);
        }
        //code here
    }
}
