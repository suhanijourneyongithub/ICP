package SlidingWindows;

class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int lCount = 0, b = 0, maxlen = 0;
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'A']++;
            lCount = Math.max(lCount, arr[s.charAt(i) - 'A']);
            if(i - b + 1 - lCount > k){    
                arr[s.charAt(b) - 'A']--;
                b++;
            }
            maxlen = Math.max(maxlen, i - b + 1);  
        }
        return maxlen;
    }
}

// Time Complexity :  O(n)
// Space Complexity : O(1)