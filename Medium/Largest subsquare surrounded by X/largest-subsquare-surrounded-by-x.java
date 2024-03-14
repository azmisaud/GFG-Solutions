//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            char A[][] = new char[N][N];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().trim().split(" ");
                for (int j = 0; j < N; j++) A[i][j] = S[j].charAt(0);
            }
            Solution ob = new Solution();
            System.out.println(ob.largestSubsquare(N, A));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Mapper{
    int r;
    int c;
    Mapper(int r,int c){
        this.r=r;
        this.c=c;
    }
}
class Solution {
    int largestSubsquare(int n, char a[][]) {
        // code here
        Mapper[][] mp=new Mapper[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Mapper m=new Mapper(0,0);
                if(a[i][j]=='X'){
                    m.r=(j-1>=0)?mp[i][j-1].r+1:1;
                    m.c=(i-1>=0)?mp[i-1][j].c+1:1;
                }
                mp[i][j]=m;
            }
        }
        int size=0;
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int sVar=Math.min(mp[i][j].r,mp[i][j].c);
                while(sVar>size){
                    if(mp[i][j-sVar+1].c>=sVar && mp[i-sVar+1][j].r>=sVar){
                        size=sVar;
                        break;
                    }
                    sVar--;
                }
            }
        }
        return size;
    }
};