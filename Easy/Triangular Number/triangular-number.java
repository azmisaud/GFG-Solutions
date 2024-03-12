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
            int N=Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isTriangular(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isTriangular(int N){
        //code here
        int diff=1;
        int number=N;
        while(number>0){
            number-=diff;
            diff++;
        }
        if(number==0) return 1;
        else return 0;
    }
}