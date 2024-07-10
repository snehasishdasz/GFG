//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        //Brute force method
        // Long lcm=1L;
        // Long gcd = 1L ;
        // for(int i=1;i<=Math.min(A,B);i++){
        //     if(A%i==0 && B%i==0){
        //         gcd = i;
        //     }
        //     return gcd;
        // }
        // lcm = (A*B)/gcd;
        // return lcm;
        
        
        //Optimal approach
        
        //GCD
        Long originalA = A;
        Long originalB = B;
        Long gcd=1L;
        Long lcm=1L;
        while(A>0 && B>0){
            if(A>B){
                A = A%B;
            }
            else{
                B = B%A;
            }
        }
        if(A==0){
            gcd = B;
        }
        else{
            gcd = A;
        }
        //LCM
        lcm = (originalA*originalB)/gcd;
        
        return new Long[] {lcm, gcd};
    }
};