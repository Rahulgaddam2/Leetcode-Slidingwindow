package slidingwindow;

import java.util.*;

public class Leetcode2090 {

	public static void main(String[] args) {
		Leetcode2090 Object = new Leetcode2090();
		
		int[] nums = {7,4,3,9,1,8,5,2,6};
		int k = 3;
		
       //int[] averages = Object.getAverages(nums, k)
        
        
       // System.out.println(Arrays.toString(averages));

	}
		public ArrayList<Integer> getAverages(int[] nums, int k) {
        
        ArrayList<Integer> ans = new ArrayList<>();
    

        for(int i=0; i<nums.length;i++){

            if(i < k || i+k >= nums.length)
                {
                    ans.add(-1); 
                }
            else{
                int sumright = 0;
                int sumleft = 0;
                for(int j=0;j<k;j++){
                    sumright = sumright + nums[j];
                }
                for(int m=i-1;m>=m-k;m--){
                    sumleft = sumleft + nums[m];
                }
                int finalsum = sumright+sumleft;

                ans.add(finalsum/ (2*k+1));
            }
            
    }
    return ans;
	}
}
