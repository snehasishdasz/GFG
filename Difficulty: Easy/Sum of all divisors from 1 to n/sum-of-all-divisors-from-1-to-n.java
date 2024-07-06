//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
            Solution ob = new Solution();
            long ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long sumOfDivisors(int N){
        // code here
        //THIS IS THE BRUTE FORCE METHOD
        // int g_sum = 0;
        // for(int i=1;i<=N;i++){
        //     int l_sum = 0;
        //     for(int j=1;j<=i;j++){
        //         if(i%j==0){
        //             l_sum= l_sum + j;
        //         }
        //     }
        //     g_sum = g_sum + l_sum;
        // }
        //     return g_sum;
        long sum =0;
        for(int i=1;i<=N;i++){
            sum += i*(N/i);
        }
        return sum;
    }
}