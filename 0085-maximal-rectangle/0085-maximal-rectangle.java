class Solution {
    public int largestArea(int arr[]){
        int maxArea=0;
        int nsl[]=new int[arr.length];
        int nsr[]=new int[arr.length];
        Stack <Integer> st=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsr[i]=arr.length;

            }else{
                nsr[i]=st.peek();

            }
            st.push(i);

        }
        st.clear();
         for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsl[i]=-1;

            }else{
                nsl[i]=st.peek();

            }
            st.push(i);

        }
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currarea=height * width;
            maxArea=Math.max(maxArea,currarea);

        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int m=matrix[0].length;
        int height[]=new int[m];
        int maxArea=0;
        if(matrix.length==0 || matrix==null){
            return 0;
        }
        for(char[] row : matrix){
            for(int i=0;i<m;i++){
                if(row[i]=='1'){
                    height[i]++;

                }else{
                    height[i]=0;
                }
            }

            maxArea=Math.max(maxArea,largestArea(height));
        }
        return maxArea;
    }
}