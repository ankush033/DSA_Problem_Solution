class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int count =0;
        int op[]=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
                   st.pop();
                   count++;
            }
            if(st.isEmpty()){
                op[i]=0;
            }else{
               op[i]= st.peek()-i;
            }
            st.push(i);

        }
        return op;
    }
}