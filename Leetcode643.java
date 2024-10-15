package slidingwindow;

public class Leetcode643 {

	public static void main(String[] args) {
		
		Leetcode643 Object = new Leetcode643();
		
		int[] nums = {1,12,-5,-6,50,3};
		
		int k = 4;
		
		System.out.println(Object.findMaxAverage(nums, k));
	}
	public double findMaxAverage(int[] nums, int k) {
		int sum = 0;
		
		for(int i=0;i<k;i++) {
			sum = sum + nums[i];
		}
		
		int Maxsum = sum;
		
		int startindex = 0;
		int endindex = k;
		
		while(endindex < nums.length) {
			
			sum = sum - nums[startindex];
			startindex++;
			
			sum = sum + nums[endindex];
			endindex++;
			
			Maxsum = Math.max(Maxsum, sum);
		}
		return (double) Maxsum/k;
		
        
    }

}
