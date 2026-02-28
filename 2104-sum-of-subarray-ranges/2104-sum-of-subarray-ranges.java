class Solution {
    public long subArrayRanges(int[] nums) {
        int largest=0;
        int smallest=0;
        long sum=0;
        for(int i=0;i<nums.length;i++){
          
            smallest=nums[i];
            largest=nums[i];
            for(int j=i;j<nums.length;j++){
                smallest=Math.min(smallest,nums[j]);
                largest=Math.max(largest,nums[j]);
                int range=largest-smallest;
                sum=sum + range;
            }
           
        }

     return sum;
    }
}