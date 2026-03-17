class Solution {
    public int[] sortedSquares(int[] nums) {
       int i=0;
       int j=nums.length-1;
       while(i<=j){
       int temp=nums[i]*nums[i];
       nums[i]=nums[j]*nums[j];
       nums[j]=temp;
       i++;
       j--;
       }
       Arrays.sort(nums);
       return nums;

    }
}