import java.util.*;
class Solution {    
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        //sort kar diya ascending me 
        //int arrow = 1;
        int arrowAt = points[0][1];
        int arrow = 1;
        for(int i = 1; i < n; i++){
            //System.out.println("->" + points[i][0] + " " + arrowAt + " " + points[i][1]);
            if(arrowAt < points[i][0] || arrowAt > points[i][1]){
                arrow++;
                arrowAt = points[i][1];
            }
        }
        
        return arrow;        
    }
}o