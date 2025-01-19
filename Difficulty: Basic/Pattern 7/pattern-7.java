//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {
   public static void Gaps(int size)
     {
        for(int i=0;i<size;i++)
        System.out.print(" ");
     }
    void printTriangle(int n) {
        String arr = "*";
        String bh=arr;
        for(int i=0;i<n;i++)
        {
            Solution.Gaps(n-1-i);
            System.out.println(arr);
            arr+="**";
            bh="*";
        }
    }
}




