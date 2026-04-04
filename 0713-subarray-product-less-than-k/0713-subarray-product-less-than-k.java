class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int left=0;
        int maxprod=1;
        int count=0;
        for(int right=0;right<nums.length;right++){
            maxprod*=nums[right];
            while(maxprod>=k){
                maxprod/=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
        
    }
}