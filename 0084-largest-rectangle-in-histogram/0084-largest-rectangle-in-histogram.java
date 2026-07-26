class Solution {
    public int largestRectangleArea(int[] heights) {
      Stack<Integer> st=new Stack<>();
      int maxArea=0;
      int n=heights.length;
      for(int i=0;i<=n;i++){
        while(!st.isEmpty() && (i==n || heights[st.peek()]>=heights[i])){
            int height=heights[st.pop()];
            int width;
            if(st.isEmpty()){
                width=i;
            }else{
                width=i-st.peek()-1;
            }
            maxArea=Math.max(maxArea,height*width);
        }
        st.push(i);
      }
      return maxArea;



    }
}














    
//       int MaxArea=0;
//       int nsr[]=new int[heights.length];
//       int nsl[]=new int[heights.length];
//       Stack<Integer> s=new Stack<>();
//       for(int i=heights.length-1;i>=0;i--){
//         while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
//             s.pop();
//         }
//         if(s.isEmpty()){
//             nsr[i]=heights.length;
//         }else{
//             nsr[i]=s.peek();
//         }
//         s.push(i);
//       }
//        s=new Stack<>();
//       for(int i=0;i<heights.length;i++){
//         while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
//             s.pop();
//         }if(s.isEmpty()){
//             nsl[i]=-1;
//         }else{
//             nsl[i]=s.peek();
//         }
//         s.push(i);
//       }

//       for(int i=0;i<heights.length;i++){
//         int height=heights[i];
//         int width=nsr[i]-nsl[i]-1;
//         int currArea=height * width;
//         MaxArea=Math.max(currArea,MaxArea);

//       }
//     return MaxArea;
//     }
// }