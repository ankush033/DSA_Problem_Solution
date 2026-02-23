class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        int even=0;
        int odd=0;
        for(int freq:map.values()){
            if(freq % 2==0){
                even+=freq;
            }else{
                even+=freq-1;
                odd=1;
            }
        }
       return even+odd;
    }
}