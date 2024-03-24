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
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<String> NBitBinary(int N) {
        ArrayList<String> result=new ArrayList<>();
        int ones=0,zeroes=0;
        String answer="";
        find(result,answer,ones,zeroes,N);
        return result;
        // code here
    }
    void find(ArrayList<String> result, String answer, int ones, int zeroes, int N){
        if(N==0){
            result.add(answer);
            return;
        }
        String temp1=answer;
        temp1+="1";
        find(result,temp1,ones+1,zeroes,N-1);
        if(ones>zeroes){
            String temp2=answer;
            temp2+="0";
            find(result,temp2,ones,zeroes+1,N-1);
        }
        return;
    }
}