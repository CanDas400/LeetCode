class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <=1 ){
            return nums.length;
        }  
        int i=1;
        int k=1;
        while(i < nums.length){
           if(nums[i]!=nums[i-1]){
              nums[k] = nums[i];
              k++;
           } 
           i++; 
        }
        return k;
    }
}