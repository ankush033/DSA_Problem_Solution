class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer,Integer> map=new HashMap<>();
     int arr[]={-1,-1};
     for(int i=0;i<nums.length;i++){
        int compliment=target-nums[i];
        if(map.containsKey(compliment)){
            arr[0]=map.get(compliment);
            arr[1]=i;
            break;
        }
        map.put(nums[i],i);
     }
     return arr;
 
    }
}









    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //                 int sum = nums[i] + nums[j];
    //                 if(sum==target){
    //                  return new int[]{i,j};
    //                 }
    //         }
    //     }
    //     return new int[]{};
    // }
    // }













    