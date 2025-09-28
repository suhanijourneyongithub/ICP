import java.util.PriorityQueue;
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : nums) {
            minHeap.offer(i);   
            if (minHeap.size() > k) {
                minHeap.poll();  
            }
        }
        return minHeap.peek();
    }
} 
// Time: O(n log k)
// Space: O(k)