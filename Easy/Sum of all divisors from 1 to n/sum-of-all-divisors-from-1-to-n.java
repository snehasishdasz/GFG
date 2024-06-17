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
        long sum =0;
      /*  shows error TC
      
       
        for(int j = N;j>=1;j--){
        for(int i=1;i<=j/2;i++){
            if(j%i==0){
            sum += i;}
        }
         sum+=j ;
        }*/
         for(int i=1;i<=N;i++){
            sum += i*(N/i);
        }
        return sum;
    }
}