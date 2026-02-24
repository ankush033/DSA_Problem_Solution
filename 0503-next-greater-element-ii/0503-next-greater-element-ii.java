class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s=new Stack<>();
        int nextgreater[]=new int[nums.length];
        int n=nums.length;
        for(int i=2*n-1;i>=0;i--){
            int index=i%n;
            while(!s.isEmpty() && s.peek()<=nums[index]){
                s.pop();
            }
            if(i<n){
            if(s.isEmpty()){   
                 nextgreater[i]=-1;
                }
            else{
                nextgreater[i]=s.peek();
            }
            }
            s.push(nums[index]);
        }
        return nextgreater;
    }
}