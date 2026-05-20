class Solution {
    public int maxArea(int[] height) {
      int l=0;
      int r=height.length-1;
      int maxi=0;
      while(l<r){
        int width=r-l;
        int heights=Math.min(height[l],height[r]);
        int area=heights*width;
        maxi=Math.max(maxi,area);
        if(height[l]<height[r]){
            l++;

        }else{
            r--;
        }
      }
      return maxi;
    }
}











//         int lp =0;
//         int rp=height.length -1;
//         int maxWater=0;
//         while(lp<rp){
//         int ht =Math.min(height[lp] , height[rp]);
//         int width =rp-lp;
//         int currWater = ht * width;
//         maxWater = Math.max(maxWater,currWater);
//         if(height[lp]<height[rp]){
//             lp++;
//         }else{
//             rp--;
//         }
//         }
//         return maxWater;
//     }
// }