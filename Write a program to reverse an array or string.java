

public class client {

	public static void main(String[] args) {
		int nums[] = { 9, 4, 9, 8, 4 };
         
	    reverseArray(nums,0,nums.length);
	    for(int x:nums) {
	    	System.out.print(x+" ");
	    }
	}

	private static void reverseArray(int[] nums, int i, int length) {
		int start = 0 ;
		int end = length-1;
		while(start<end) {
			
			swap(nums,start,end);
			start++;
			end--;
		}
		
	}

	private static void swap(int[] nums, int start, int end) {
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;
		
	}

}
