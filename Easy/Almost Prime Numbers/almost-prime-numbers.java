//{ Driver Code Starts
import java.util.*;
import java.lang.Math;



class Almost_K_Prime_Numbers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t > 0)
		{
			int k = sc.nextInt();
			int N = sc.nextInt();
			
			GfG g = new GfG();
			g.printKAlmostPrimes(k, N);
			System.out.println();
			t--;
		}
	}
	
}
// } Driver Code Ends


class GfG
{
    void printKAlmostPrimes(int k, int N)
    {
	// Your code here
	int count=0;
	    for(int i=2;true;i++){
	        if(countPrimeFactors(i)==k) {
	            count++;
	            System.out.print(i+" ");
	        }
	        if(count==N) break;
	    }
    }
    static int countPrimeFactors(int n){
        if(n<=1) return -1;
        int count=0;
        while(n%2==0){
            count++;
            n/=2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            while(n%i==0){
                count++;
                n/=i;
            }
        }
        if(n>2) count++;
        return count;
    }
}