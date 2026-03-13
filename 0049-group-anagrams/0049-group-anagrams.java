class Solution {
    private String generateKey(String str){
        int count[]=new int[26];
        for(char ch : str.toCharArray()){
            count[ch-'a']+=1;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            sb.append('#');
            sb.append(count[i]);
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        
         HashMap<String,ArrayList<String>> map = new HashMap<>();

         for(int i=0;i<strs.length;i++){
          String key=generateKey(strs[i]);
         
         if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
         }
         map.get(key).add(strs[i]);
         }
         return new ArrayList<>(map.values());
    }
}