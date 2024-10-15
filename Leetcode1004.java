package slidingwindow;

public class Leetcode1004 {

	public static void main(String[] args) {
		Leetcode1004 Object = new Leetcode1004();
		
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		
		System.out.print(Object.longestOnes(nums, k));
	}
	public int longestOnes(int[] nums, int k) {
        int zeorscount =0;
        int start =0;
        int maxcount =0;	
        
        for(int end= 0; end<nums.length;end++) {
        	if(nums[end] == 0) {
        		zeorscount++;
        	}
        	
        	while(zeorscount > k) {
        		if(nums[start] == 0) {
        			zeorscount--;
        		}
        			start++;
        		}
        		maxcount = Math.max(maxcount, end-start+1);
        	}
        return maxcount;
    }
	

}
