class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String op : operations){
            if(op.equals("+")){
                int a=st.pop();
                int b=st.peek();
                int sum=a + b;
                st.push(a);
                st.push(sum);
            }
            else if(op.equals("D")){
                st.push(st.peek()*2);
            }
            else if(op.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(op));
            }

            }
            int sum=0;
            for(int num: st){
                sum+=num;
            }
             return sum;
        } 
    
}