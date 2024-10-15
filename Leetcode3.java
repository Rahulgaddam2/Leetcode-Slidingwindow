package slidingwindow;

import java.util.*;

public class Leetcode3 {

	public static void main(String[] args) {
		Leetcode3 Object = new Leetcode3();
		
		String s =  "abcabcbb";
		
		System.out.print(Object.lengthOfLongestSubstring(s));

	}
	public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> sets = new HashMap();
        

        char[] array = s.toCharArray();
        int length = 0;
        int p1=0;
        int p2=0;
        int maxcount =0;

        if(array.length == 0){
            return 0;
        }

        while(p2<array.length){
            if(sets.containsKey(array[p2]) && sets.get(array[p2]) >= p1){
                length = p2-p1;
                maxcount = Math.max(maxcount, length);
                p1 =   sets.get(array[p2])+1;
        
            }
                sets.put(array[p2], p2);
            

            p2++;
        }
        length = p2-p1;
        maxcount = Math.max(maxcount, length);
        return maxcount;

    }

}
