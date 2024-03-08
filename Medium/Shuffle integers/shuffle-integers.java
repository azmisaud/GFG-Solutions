//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java





class  Solution
{
    void shuffleArray(long arr[], int n)
    {
        // Your code goes here
    
     //Brute Force Approach
        // int[] m=new int[arr.length/2];
        // int[] n=new int[arr.length/2];
        // System.arraycopy(arr, 0, m, 0, arr.length / 2);
        // System.arraycopy(arr, arr.length / 2, n, 0, arr.length / 2);
        // int j=0,k=0;
        
        //Use this 
//        for(int i=0;i<arr.length;i++){
//            if(i%2==0){
//                arr[i]=m[j];
//                j++;
//            } else {
//                arr[i]=n[k];
//                k++;
//            }
//        }
//      Or Use this to assign
        // for(int i=0;i< arr.length/2;i++){
        //     arr[2*i]=m[i];
        //     arr[2*i+1]=n[i];
        // }
        int index=1;
        for(int i=n/2;i<n;i++){
            int y=i;
            while(y>index){
                long temp=arr[y];
                arr[y]=arr[y-1];
                arr[y-1]=temp;
                y--;
            }
            index=index+2;
        }
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] q = line.trim().split("\\s+");
//            int n =Integer.parseInt(q[0]);
//            int k =Integer.parseInt(q[1]);
            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[n];
//            for (int i = 0; i < m; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
             Solution ob = new  Solution();
            //ArrayList<Long> ans=
            ob.shuffleArray(a,n);
           // System.out.println(ob.shuffleArray(a,n));
            for (int i = 0; i < n; i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
    }
}


// } Driver Code Ends