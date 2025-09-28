class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m;
        int j = 0;
        for(int i = 0; i < nums1.length; i++){
            if(j < n && nums1[i] >= nums2[j]){
                while(k > i){
                    nums1[k] = nums1[k-1];
                    k--;
                }
                nums1[i] = nums2[j];
                j++;
                if(j >= n){
                    return;
                }
                m++;
                k = m;
            }
        }
        while(j < n){
            nums1[m++] = nums2[j++];
        }
        return;
    }
}