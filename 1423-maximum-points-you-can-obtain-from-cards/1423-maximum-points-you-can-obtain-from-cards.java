class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxsum=0;
        int leftSum=0;
        int rightSum=0;
        int n=cardPoints.length;
        for(int left=0;left<k;left++){
            leftSum+=cardPoints[left];
        }
        maxsum=leftSum;
        int right=n-1;
        for(int left=k-1;left>=0;left--){
            leftSum-=cardPoints[left];
            rightSum+=cardPoints[right];
            right--;
            maxsum=Math.max(maxsum,leftSum + rightSum);
        }

        

     return maxsum;
        

    }

}