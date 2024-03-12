//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] mat = new int[n][n];
            String[] S = br.readLine().trim().split(" ");
            int i = 0;
            int j = 0;
            for(int k = 0; k < S.length; k++){
                mat[i][j] = Integer.parseInt(S[k]);
                j++;
                if(j == n){
                    i++;
                    j = 0;
                }
            }
            Solution obj = new Solution();
            int[] ans = obj.matrixDiagonally(mat);
            for(int it = 0; it < ans.length; it++){
                System.out.print(ans[it] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        int n = mat.length;
        int[] result = new int[n * n];
        int index = 0;
        boolean up = true;
        for (int d = 0; d < 2 * n - 1; d++) {
            if (up) {
                for (int i = Math.min(d, n - 1); i >= Math.max(0, d - n + 1); i--) {
                    result[index++] = mat[i][d - i];
                }
            } else {
                for (int i = Math.max(0, d - n + 1); i <= Math.min(d, n - 1); i++) {
                    result[index++] = mat[i][d - i];
                }
            }
            up = !up;
        }
        
        return result;
    }
}