class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);     
    }
    
    public int binarySearch(int[] nums, int left, int rigth, int target) {
        if(rigth >= left){
            int mid = left + (rigth - left)/2;
            if(nums[mid] == target) return mid;
            
            if(nums[mid] > target) return binarySearch(nums, left, mid -1, target);
            else return binarySearch(nums, mid+1, rigth, target);
        }
        return -1;
    }
}