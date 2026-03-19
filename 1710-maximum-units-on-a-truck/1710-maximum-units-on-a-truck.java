class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int finalval=0;
        Arrays.sort(boxTypes,Comparator.comparingInt(o -> o[1]));
        for(int i=boxTypes.length-1;i>=0;i--){
            
            if(truckSize>=boxTypes[i][0]){
                finalval+=(boxTypes[i][0]*boxTypes[i][1]);
                truckSize-=boxTypes[i][0];

            }else{
                finalval+=(truckSize * boxTypes[i][1]);
                truckSize=0;
                break;
            }
        }
        return finalval;
    }
}