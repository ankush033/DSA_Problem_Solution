class Solution {
    private int [] prevSmallestel(int nums[]){
        Stack<Integer> st= new Stack<>();
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
     private int [] nextSmallestel(int nums[]){
        Stack<Integer> st= new Stack<>();
        int ans[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=nums.length;
            }else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
     private int [] nextGreaterel(int nums[]){
        Stack<Integer> st= new Stack<>();
        int ans[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=nums.length;
            }else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
     private int [] prevGreaterel(int nums[]){
        Stack<Integer> st= new Stack<>();
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    private long sumSubaaraymin(int nums[]){
        int n=nums.length;
        int nse[]=nextSmallestel(nums);
        int pse[]=prevSmallestel(nums);
        long sum=0;
        for(int i=0;i<nums.length;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
           long freq=1l*left * right;
           sum+=freq * nums[i];
        }
        return sum;
    }
    private long sumSubaaraymax(int nums[]){
        int n=nums.length;
        int nge[]=nextGreaterel(nums);
        int pge[]=prevGreaterel(nums);
        long sum=0;
        for(int i=0;i<nums.length;i++){
            int left=i-pge[i];
            int right=nge[i]-i;
           long freq=1l*left * right;
           sum+=freq * nums[i];
        }
        return sum;
    }
    public long subArrayRanges(int[] nums) {
        return sumSubaaraymax(nums) - sumSubaaraymin(nums);
    }
}