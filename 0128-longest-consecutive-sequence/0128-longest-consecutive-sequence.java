class Solution {
    public int longestConsecutive(int[] nums) {
  HashSet<Integer> set=new HashSet<>();
  for(int num : nums){
    set.add(num);

  }
  int longest=0;
  for(int num : set){
    if(!set.contains(num-1)){
        int current=num;
        int length=1;
        while(set.contains(current+1)){
            current++;
            length++;
        }
        longest=Math.max(longest,length);
    }
  }
  return longest;
    }
}







        
//         int n =nums.length;
//         if(n==0){
//             return 0;
//         }
//         Arrays.sort(nums);
//         int longest =1;
//         int countCurr =1;

//         for(int i=1;i<n;i++){
//             if(nums[i]==nums[i-1]+1){
//                 countCurr++;
//                 longest =Math.max(longest,countCurr);
//             }else if(nums[i]!=nums[i-1]){
//                 countCurr = 1;
//             }
//              }
            
        
//      return longest;   
// }
//     }
    

    