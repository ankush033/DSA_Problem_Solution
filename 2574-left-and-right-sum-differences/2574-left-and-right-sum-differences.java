class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftsum[]=new int[nums.length];
        int rightsum[]=new int[nums.length];
        int leftSum=0;
        int rightSum=0;
        leftsum[0]=0;
        for(int i=0;i<nums.length-1;i++){
             leftSum+=nums[i];
             leftsum[i+1]=leftSum;
        }
        rightsum[nums.length-1]=0;
        for(int i=nums.length-1;i>0;i--){
            rightSum+=nums[i];
            rightsum[i-1]=rightSum;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return nums;
    }
}