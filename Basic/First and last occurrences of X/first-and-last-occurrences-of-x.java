//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            String inputLine[] = br.readLine().trim().split(" "); 
            int n = Integer.parseInt(inputLine[0]); 
            int x = Integer.parseInt(inputLine[1]);
            
            int arr[] = new int[(int)(n)];
            
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(arr, n, x); 
            
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    } 
} 
            



// } Driver Code Ends


//User function Template for Java
class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        int first=-1,last=-1;
        ArrayList<Integer> ar=new ArrayList<>();
         //Linear Search Approach
        // for(int i=0;i<n;i++){
        //     if(arr[i]==x){
        //         if(first==-1) first=i;
        //         last=i;
        //     }
        // }
        int l=0,r=n-1;
        while(l<=r){
            if(arr[l]==x && arr[r]==x){
                ar.add(0,l);
                ar.add(1,r);
                break;
            }
            if(arr[l]!=x) l++;
            if(arr[r]!=x) r--;
        }
        if(ar.isEmpty()){
            ar.add(-1);
            return ar;
        }
        return ar;
    }
}
