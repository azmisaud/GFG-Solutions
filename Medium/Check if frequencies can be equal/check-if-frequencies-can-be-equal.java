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
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean sameFreq(String s) {
        // code here
        int maximum=0;
        int minimum=Integer.MAX_VALUE;
        int maximumCounter=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char t : map.keySet()){
            if(map.get(t)==maximum){
                maximumCounter++;
            }
            if(map.get(t)>maximum){
                maximum=map.get(t);
                maximumCounter=1;
            }
            if(map.get(t)<minimum){
                minimum=map.get(t);
            }
        }
        if((maximum-minimum)==0) return true;
        else if ((maximum-minimum)==1){
            if(maximumCounter==1) return true;
            else return false;
        } else return false;
    }
}