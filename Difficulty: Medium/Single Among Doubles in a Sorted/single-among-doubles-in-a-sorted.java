//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String arr[] = br.readLine().split(" ");
            int a[] = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                a[i] = Integer.parseInt(arr[i]);
            }
            Solution obj = new Solution();
            int f = 0;
            int A = obj.findOnce(a);
            System.out.println(A);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findOnce(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<right && left<arr.length)
        {   
            int mid = (left+right)/2;
           if(mid%2==0 && arr[mid]==arr[mid+1])
              left=mid+1;
           else if(mid%2!=0 && arr[mid]!=arr[mid+1])
           left=mid+1;
           else 
           right=mid;
        }
        return arr[left];
    }
}