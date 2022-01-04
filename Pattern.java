// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.printMinNumberForPattern(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    static String printMinNumberForPattern(String S){
        // int largestInPattern=S.length()+1,smallestInPattern=1;
        String result="";
        // for(int i=0;i<S.length();i++){
        //     if(S.charAt(i)=='I')
        //         result+=(smallestInPattern++);
        //     else
        //         result+=(largestInPattern--);
        // }
        // if(S.charAt(S.length()-1)=='I')
        //     result+=(smallestInPattern++);
        // else
        //     result+=(largestInPattern--);
        int minimum=1;
        Stack<Integer> ptrnString = new Stack<Integer>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='I'){
                ptrnString.push(minimum++);
                while(!ptrnString.empty()){
                    result+=ptrnString.pop();
                }
            }
            else
                ptrnString.push(minimum++);
        }
        ptrnString.push(minimum);
        while(!ptrnString.empty()){
                    result+=ptrnString.pop();
                }
        return result;
    }
}