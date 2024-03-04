//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().checkTriplet(arr, n);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        int maximum=0;
        for (int j : arr) maximum = Math.max(maximum, j);
        int[] hash=new int[maximum+1];
        for (int j : arr) hash[j]++;
        for(int i=1;i<maximum+1;i++){
            if(hash[i]==0) continue;
            for(int j=1;j<maximum+1;j++){
                if((i==j && hash[i]==1) || hash[j]==0) continue;
                int val=(int) Math.sqrt(i*i+j*j);
                if((val*val)!=(i*i+j*j)) continue;
                if(val>maximum) continue;
                if(hash[val]>=1) return true;
            }
        }
        return false;
    }
}