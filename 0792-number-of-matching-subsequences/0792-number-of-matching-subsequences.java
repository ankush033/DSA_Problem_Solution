import java.util.*;

class Solution {
    public int numMatchingSubseq(String s, String[] words) {

        
        Map<Character, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.putIfAbsent(c, new ArrayList<>());
            map.get(c).add(i);
        }

        int count = 0;

        for(String word : words){

            int prevIndex = -1;
            boolean isSubseq = true;

            for(char c : word.toCharArray()){

                if(!map.containsKey(c)){
                    isSubseq = false;
                    break;
                }

                List<Integer> list = map.get(c);

                int pos = Collections.binarySearch(list, prevIndex + 1);

                if(pos < 0){
                    pos = -pos - 1;
                }

                if(pos == list.size()){
                    isSubseq = false;
                    break;
                }

                prevIndex = list.get(pos);
            }

            if(isSubseq){
                count++;
            }
        }

        return count;
    }
}