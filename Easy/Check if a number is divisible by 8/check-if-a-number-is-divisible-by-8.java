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
            String S=read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.DivisibleByEight(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int DivisibleByEight(String s){
        //code here
        if(s.length()>3){
                String m=s.substring(s.length()-3);
                int i=Integer.parseInt(m);
                if(i%8==0) return 1;
                else return -1;
            }
            else{
                int g=Integer.parseInt(s);
                if(g%8==0) return 1;
                else return -1;
            }
    }
}