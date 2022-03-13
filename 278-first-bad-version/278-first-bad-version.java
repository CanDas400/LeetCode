/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return binarySearch(1, n);
    }
    
    
    int binarySearch(int start, int end){
        if(start <= end){
            int current = start + (end - start)/2;
            if(isBadVersion(current)){
                if(current==1) return current;
                if(!isBadVersion(current-1)) return current;
                return binarySearch(start, current - 1);
            } else{
                return binarySearch(current + 1, end); 
            }
        }
        return -1;
    }
    
}