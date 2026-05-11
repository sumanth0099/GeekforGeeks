class Solution {
    public void sort012(int[] nums) {
        // code here
         int freq[] = new int[3];
        for(int i:nums)
        freq[i]++;
        int i = 0;
        while(i<freq[0])
        nums[i++]=0;
            while(i<freq[1]+freq[0])
        nums[i++]=1;
                while(i<nums.length)
        nums[i++]=2;
    }
}

