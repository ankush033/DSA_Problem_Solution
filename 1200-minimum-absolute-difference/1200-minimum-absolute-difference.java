class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            
             minDiff=Math.min(minDiff,Math.abs(arr[i]-arr[i+1]));
             
             
        }
        for(int i=0;i<arr.length-1;i++){
              ArrayList<Integer> pair=new ArrayList<>();
              int diff=Math.abs(arr[i]-arr[i+1]);
            if(minDiff==diff){
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                list.add(pair);

            }
        }
        return list;
    }
}