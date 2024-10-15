package slidingwindow;

public class Leetcode485 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int tempcount =0;
        
        for(int i=0;i<nums.length;i++) {
        	if(nums[i] == 1) {
        		count++;
        	}
        	if(nums[i] != 1) {
        		tempcount = count;
        		count =0;
        		
        	}
        }
        return Math.max(count, tempcount);
    }

}
