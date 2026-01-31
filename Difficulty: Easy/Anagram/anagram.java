class Solution {
    public static boolean areAnagrams(String s, String t) {
        if(s.length()!=t.length())
        return false;
        int freq1[] = new int[27];
        int freq2[] = new int[27];
        for(int i=0;i<s.length();i++)
        {
            freq1[((int)'z'-s.charAt(i))]++;
            freq2[((int)'z'-t.charAt(i))]++;
        }
        for(int i=0;i<freq1.length;i++)
        {
            if(freq1[i]!=freq2[i])
            return false;
        }
        return true;
    }
}