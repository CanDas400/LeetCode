class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n==0) {
            return 0;
        }
        int i=1;
        int k=1;
        while(i < n){
           if(nums[i]!=nums[i-1]){
              nums[k] = nums[i];
              k++;
           } 
           i++; 
        }
        return k;
    }
}
