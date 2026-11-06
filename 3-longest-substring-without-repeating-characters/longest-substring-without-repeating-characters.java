class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[] arr = new int[128];
        int l = 0;
        int max_l=0;
        
        for(int i =0; i<s.length();i++){
            char currchar = s.charAt(i);

            l=Math.max(l, arr[currchar]);
            max_l= Math.max(max_l,i-l+1);
            arr[currchar] = i+1;
        }
        return max_l;
    }
}