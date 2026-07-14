class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
      
       
        
        int sum=0;
       
        for(int k=0;k<grumpy.length;k++){
            if(grumpy[k]==0){
                sum+=customers[k];
            }
        }
        int extra=0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                extra+=customers[i];
            }
        }
        int maxiextra=extra;
        for(int right=minutes;right<customers.length;right++){
            int left=right-minutes;
            if(grumpy[left]==1){
                extra-=customers[left];
            }
            if(grumpy[right]==1){
                extra+=customers[right];
            }
            maxiextra=Math.max(maxiextra,extra);
        }
         return sum+maxiextra;
    }
}