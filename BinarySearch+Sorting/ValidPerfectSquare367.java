class Solution {
    public boolean isPerfectSquare(int num) {
        //brute force
        int l = 1;
        int r = num;
        while(l <= r){
            int m = l + (r - l)/2;
            if(m*m == num){
                return true;
            }
            else if(m > num/m){
                r = m - 1;
            }
            else{
                l = m + 1;
            }
        }
        return false;
    }
}
// Time: O(log n)
// Space: O(1)