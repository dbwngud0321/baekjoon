package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

	public static void main(String[] args) {
		int[] arr = {2,11,7,15};
		int[] result = twoSum(arr,9);
		for(int i: result){
			System.out.println(i);
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> param = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		for(int i=0; i<nums.length; i++){
			param.put(nums[i],i);
		}
		
		return result;
	}

}
