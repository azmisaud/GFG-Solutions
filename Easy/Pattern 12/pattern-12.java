//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++){
            int num=1;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            for(int k=1;k<=2*n-2*i;k++){
                System.out.print("  ");
            }
            num--;
            for(int c=1;c<=i;c++){
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }
}