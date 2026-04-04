class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list=new ArrayList<>();
        if(s.length()<p.length()) return list;
        int left=0;
        int pcount[]=new int[26];
        int window[]=new int[26];
        for(char ch:p.toCharArray()){
            pcount[ch-'a']++;
        }
        for(int right=0;right<s.length();right++){
            window[s.charAt(right)-'a']++;
            if(right-left+1>p.length()){
                window[s.charAt(left)-'a']--;
                left++;
            }
            if(Arrays.equals(window,pcount)){
                list.add(left);
            }
        }
        return list;

    }
}