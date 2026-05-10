class Solution {
    int thirdLargest(int arr[]) {
        // code here
        if(arr.length<3)
        return -1;
        int p[] = new int[3];
         p[0] = arr[0];
         p[1] = arr[1];
         p[2] = arr[2];
         if(p[0]==p[1] && p[1]==p[0])
         return p[0];
         Arrays.sort(p);
       for(int i=3;i<arr.length;i++)
       {
           if(p[0]<arr[i])
           {
               p[0]=arr[i];
               Arrays.sort(p);
           }
       }
        return p[0];
    }
}