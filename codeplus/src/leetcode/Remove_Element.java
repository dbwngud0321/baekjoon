package leetcode;

public class Remove_Element {

	public static void main(String[] args) {
		int arr[] = {3,2,2,3};
		int result = removeElement(arr, 2);
		System.out.println(result);
	}
	
	public static int removeElement(int[] nums, int val) {
		int result = 0;
        
		for(int i=0; i<nums.length; i++){
			if(nums[i] != val) {
				nums[result] = nums[i];
				result++;
			}
		}
        return result;
    }
}
