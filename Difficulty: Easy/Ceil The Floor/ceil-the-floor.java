//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int k, int[] arr) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        int element=-1;
        while (left<=right) 
        {
              int mid = (left+right)/2;
              if(arr[mid]<=k){
              element=Math.max(mid,element);
              left=mid+1;
              }
              else if(arr[mid]>k)
              right = mid-1;
        }
        int p[] = new int[2];
        if(element<0)
        {
            p[0]=-1;
            p[1]=arr[0];
        }
        else if(arr[element]==k)
        {
            p[0]=p[1]=k;
        }
        else if(element==arr.length-1)
        {
             p[1]=-1;
            p[0]=arr[arr.length-1];
        }
        else
        {
            p[0]=arr[element];
            p[1]=arr[element+1];
        }
        return p;
    }
}



