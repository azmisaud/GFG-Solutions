//{ Driver Code Starts
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Solution ss = new Solution();
            boolean result = ss.isAdditiveSequence(s);
            System.out.println((result == true ? 1 : 0));
        }
        sc.close();
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public boolean isAdditiveSequence(String n) {
        // code here
        int size=n.length();
        for(int i=0;i<Math.min(10,size-2);i++){
            long first=Long.parseLong(n.substring(0,i+1));
            for(int j=i+1;j<Math.min(10,size-1);j++){
                long second=Long.parseLong(n.substring(i+1,j+1));
                int bool=0;
                for(int k=j+1;k<size;){
                    long sum=first+second;
                    int sumSize=String.valueOf(sum).length();
                    if(k+sumSize-1>=size){
                        bool=1;
                        break;
                    }
                    long num=Long.parseLong(n.substring(k,k+sumSize));
                    if(num!=sum){
                        bool=1;
                        break;
                    }
                    first=second;
                    second=num;
                    k+=sumSize;
                }
                if(bool==0) return true;
            }
        }
        return false;
    }
}
