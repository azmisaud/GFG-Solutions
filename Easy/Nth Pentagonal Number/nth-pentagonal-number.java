//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long n = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.getNthPentagonalNum(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long getNthPentagonalNum(Long n) {
        // code here
        return (3L*n*n-n)/2L;
    }
};