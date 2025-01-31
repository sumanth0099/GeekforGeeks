//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; // Import ArrayList
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            // Get the result as an ArrayList<Integer>
            ArrayList<Integer> ans = new Solution().findTwoElement(arr);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        java.util.Arrays.sort(arr);
        int a = 0;
        int b = 0;
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != j && a==0) {
                a = j;
            }
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                b = arr[i];
                i++; 
            }
            if (a != 0 && b != 0)
                break;
            j++;
        }
        if (a == 0)
            a = arr.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(b);
        list.add(a);
        return list;
    }
}
