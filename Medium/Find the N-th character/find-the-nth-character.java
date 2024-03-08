//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String S = sc.next();
                    int R = sc.nextInt();
                    int N = sc.nextInt();
                    Solution obj = new Solution();
                    System.out.println(obj.nthCharacter(S,R,N));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        //code here
        for(;r>0;n%=1<<r--) s=s.charAt(n/(1<<r))=='0'?"01":"10";
        return s.charAt(n);
        //for(; r > 0; n %= 1 << r--)
        //This for loop runs as long as R is greater than 0.
        //In each iteration, R is decremented by 1 (R--).
        //Also, N is updated by performing the modulo operation with 1 << R.
        //1 << R is a bitwise left shift operation which effectively multiplies 1 by 2^R.
        //This operation ensures that N remains within the bounds of the string S.

        //S = S.charAt(N / (1 << R)) == '0' ? "01" : "10";
        //In each iteration of the loop, the string S is updated.
        //S.charAt(N / (1 << R)) retrieves the character at the index N / (1 << R) from the string S.
       //If the retrieved character is '0', the string S is updated to "01".
       //If the retrieved character is not '0', the string S is updated to "10".
    }
}
