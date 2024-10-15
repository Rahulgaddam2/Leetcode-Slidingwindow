package slidingwindow;

public class Leetcode209 {

	public static void main(String[] args) {
		

	}
	public int minSubArrayLen(int target, int[] nums) {
        int minwindow = Integer.MAX_VALUE;
        int currentsum = 0;
        
        int low = 0;
        int high = 0;
        
        while(high > nums.length) {
        	
        	currentsum = nums[high];
        	high++;
        	
        	while(currentsum >= target) {
        		int currentwindow = low - high;
        		
        		minwindow = Math.min(minwindow, currentwindow);
        		
        		currentsum = currentsum - low;
        		low++;
        	}
        }
        
        return (minwindow == Integer.MAX_VALUE) ? 0 : minwindow;
    }

}
