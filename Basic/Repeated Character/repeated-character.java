//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            char res = ob.firstRep(s);
            if (res == '#')
                System.out.println(-1);
            else
                System.out.println(res);
             
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    char firstRep(String S)
    {
        // your code here
        char answer='#';
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            String newString=S.substring(i+1,S.length());
            if(newString.indexOf(c)!=-1){
                answer=c;
                return answer;
            }
        }
        return answer;
    }
}