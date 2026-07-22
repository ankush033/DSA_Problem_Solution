class Solution {
    public int compress(char[] chars) {
        int read=0;
        int write=0;
        while(read<chars.length){
            char curr=chars[read];
            int count=0;
            while(read<chars.length&& chars[read]==curr){
                     read++;
                     count++;
            }
            chars[write++]=curr;
            if(count>1){
                for(char ch : String.valueOf(count).toCharArray()){
                    chars[write++]=ch;
                }
            }
        }
        return write;
    }
}