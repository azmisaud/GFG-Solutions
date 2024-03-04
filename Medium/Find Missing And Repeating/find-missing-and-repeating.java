//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        long n1=(long) n;
        long sum=(n1*(n1+1))/2;
        long sumSquares=(n1*(n1+1)*(2*n1+1))/6;
        long S=0,S2=0;
        for(int j : arr){
            S+= (long) j;
            S2+=(long) j * (long) j;
        }
        long val1=sum-S;
        long val2=sumSquares-S2;
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y =x-val1;
        return new int[]{(int) y, (int) x};
    }
}