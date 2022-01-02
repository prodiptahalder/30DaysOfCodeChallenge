// { Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class UglyNumber {
        public static void main(String[] args) throws IOException {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
    
                System.out.println(new Solution().getNthUglyNo(n));
            }
        }
    }// } Driver Code Ends
    
    
    class Solution {
        /* Function to get the nth ugly number*/
        long min(long a, long b, long c){
                if(a<=b && a<=c){
                    return a;
                }else if(b<=a && b<=c){
                    return b;
                }else{
                    return c;
                }
            }
            long getNthUglyNo(int n) {
                int c2=0,c3=0,c5=0,i;
                long ugly[]=new long[n+1];
                ugly[0]=1L;
                for(i=1;i<=n;i++){
                    ugly[i]=min((ugly[c2]*2),(ugly[c3]*3),(ugly[c5]*5));
                    if(ugly[c2]*2==ugly[i]){
                        c2++;
                    }
                    if(ugly[c3]*3==ugly[i]){
                        c3++;
                    }
                    if(ugly[c5]*5==ugly[i]){
                        c5++;
                    }
                }
                return ugly[n-1];
            }
        
    }