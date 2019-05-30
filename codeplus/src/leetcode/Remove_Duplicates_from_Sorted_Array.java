package leetcode;

public class Remove_Duplicates_from_Sorted_Array {

	public static void main(String[] args) {
		int[] nums = {1,1,2};
		int result = removeDuplicates(nums);
		
		System.out.println("result >> " +result);
	}

	public static int removeDuplicates(int[] nums) {
		int result = 1;
        for(int i=0; i<nums.length; i++){
        	if(nums[i]!=nums[result]){
        		nums[i] = nums[result];
        		result++;
            }
        }
        
        for(int i: nums){
        	System.out.println(i);
        }
        return result;
    }
}
