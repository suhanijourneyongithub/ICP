class Solution {
    public int[] searchRange(int[] nums, int target) {
        //binary search
        int arr[] = {-1, -1};
        if(nums.length == 0){
            return arr;
        }
        int s = 0; 
        int e = nums.length-1;
        while(s <= e){
            int m = s + (e - s)/2;
            if(nums[m] == target){
                arr[0]  = m;
                e = m - 1;
            }
            else if(nums[m] < target){
                s = m + 1;
            }
            else{
                e = m - 1;
            }
        }
        s = 0; 
        e = nums.length-1;
        while(s <= e){
            int m = s + (e - s)/2;
            if(nums[m] == target){
                arr[1]  = m;
                s = m + 1;
            }
            else if(nums[m] > target){
                e = m - 1;
            }
            else{
                s = m + 1;
            }
        }
        return arr;
    }
}