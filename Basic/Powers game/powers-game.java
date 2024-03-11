//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int x = Integer.parseInt(inputLine[0]);
            int n = Integer.parseInt(inputLine[1]);

            int[] ans = new Solve().getFreq(x, n);
            for (int sec : ans) {
                System.out.print(sec + " ");
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java






class Solve {
    int[] getFreq(int x, int n) {
        // code here
        int[] result=new int[10];
        long power=1;
        for(int i=1;i<=n;i++){
            power*=x;
            long number=power;
            while(number>0){
            long digits=number%10;
            result[(int) digits]++;
            number/=10;
            }
        }
        return result;
    }
}
