class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
            char ch[]=arr[i].toCharArray();
          int  left=0;
          int  right=ch.length-1;
            while(left<right){
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
            arr[i]=new String(ch);
        }
        return String.join(" ",arr);
    
    }
}