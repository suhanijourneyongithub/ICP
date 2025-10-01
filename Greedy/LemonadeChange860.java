package Greedy;
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5 = 0, count10 = 0, count20 = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                count5++;
            }
            else if(bills[i] == 10){
                count10++; 
                if(count5 == 0){
                    return false;
                }
                count5--;
            }
            else{
                count20++;
                if(count5 == 0){
                    return false;
                }
                else if(count10 != 0){
                    count10--;
                    count5--;
                }
                else if(count5 < 3){
                    return false;
                }
                else{
                    count5 -= 3;
                }
            }
        }
        return true;
    }
}
// Time: O(n)
// Space: O(1)