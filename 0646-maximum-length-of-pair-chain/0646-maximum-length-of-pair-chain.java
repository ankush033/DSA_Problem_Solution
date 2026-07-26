class Solution {
    public int findLongestChain(int[][] pairs) {
        

 Arrays.sort(pairs,(a,b)->a[1]-b[1]);
 int count=1;
 int endpair=pairs[0][1];
 for(int i=1;i<pairs.length;i++){
    if(endpair<pairs[i][0]){
        count++;
        endpair=pairs[i][1];
    }

 }
 return count;















    }
}
//         Arrays.sort(pairs,Comparator.comparingInt(o -> o[1]));
//         int chainlength=1;
//         int chainEnd=pairs[0][1];
//         for(int i=1;i<pairs.length;i++){
//             if(pairs[i][0]>chainEnd){
//                 chainlength++;
//                 chainEnd=pairs[i][1];
//             }
                
        
//         }
//         return chainlength;
//     }
// }