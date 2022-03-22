class Solution {
    public int[] sortedSquares(int[] nums) {
        int startIdx = 0;
		int endIdx = nums.length - 1;
			
		int[] result = new int[nums.length];	
			
		for(int i=nums.length - 1; i>=0; i--)	{
			  int startElement = nums[startIdx];
			  int endElement = nums[endIdx];
			  if(Math.abs(startElement) > Math.abs(endElement)){
					 result[i] = startElement * startElement;
					 startIdx++;
				} else{
					  result[i] = endElement * endElement;
					  endIdx--;
				}
		}
		
        return result;
    }
}