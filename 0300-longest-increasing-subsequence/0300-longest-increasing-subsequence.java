class Solution {
    public int lengthOfLIS(int[] nums) {
     int n=nums.length;
     int dp[]=new int[n];
     Arrays.fill(dp,1);
     int ans=1;
     for(int i=1;i<n;i++){
        for(int j=0;j<i;j++){
            if(nums[j]<nums[i]){

            dp[i]=Math.max(dp[i],dp[j]+1);
            }
        }
          ans=Math.max(ans,dp[i]);
  
  
     }

   return ans;
         }

}
// ArrayList<Integer> list=new ArrayList<>();
// for(int num : nums){
//     int left=0;
//     int right=list.size();
 
//     while(left<right){
//            int mid=left +(right-left)/2;
//         if(list.get(mid)<num){
//             left=mid+1;

//         }else{
//             right=mid;
//         }
//     }
//         if(list.size()==left){
//             list.add(num);
//         }else{
//             list.set(left,num);
//         }
    
// }
// return list.size();























 
//         ArrayList<Integer> list=new ArrayList<>();
//         for(int num : nums){
//             int idx=Collections.binarySearch(list,num);
//             if(idx <0){
//                 idx=-(idx + 1);
//             }
//             if(idx==list.size()){
//                 list.add(num);
//             }else{
//                 list.set(idx,num);
//             }
//         }
//         return list.size();
//     }
// }