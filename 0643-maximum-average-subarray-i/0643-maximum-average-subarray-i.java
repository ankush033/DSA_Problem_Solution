class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
         long sum=0;
         
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        long maxsum=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
           maxsum=Math.max(maxsum,sum );
        }
        return (double)maxsum/k;
    }
}