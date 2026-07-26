class Solution {
    public int lengthOfLIS(int[] nums) {

ArrayList<Integer> list=new ArrayList<>();
for(int num : nums){
    int left=0;
    int right=list.size();
 
    while(left<right){
           int mid=left +(right-left)/2;
        if(list.get(mid)<num){
            left=mid+1;

        }else{
            right=mid;
        }
    }
        if(list.size()==left){
            list.add(num);
        }else{
            list.set(left,num);
        }
    
}
return list.size();























    }
}
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