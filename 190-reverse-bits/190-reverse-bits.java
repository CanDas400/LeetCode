public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int num) {
        if (num == 0) {         
            return num;
        }

        int count = Integer.SIZE * 8 - 1;
        int  reversed = num;        
        boolean positive = true;

        if (num < 0) {
            positive = false;
        }

        if (positive) num >>= 1;

        while(num != 0) {

            reversed <<= 1; 
            reversed |= (num & 1);          

            num >>>= 1;
            count--;            
        }

        if (positive) reversed <<= count;
        return reversed;
    }
}