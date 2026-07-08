class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int n=gain.length;
        int alt[]=new int[n+1];
        alt[0]=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            alt[i+1]=sum;
        }
        int highest=Integer.MIN_VALUE;
        for(int i=0;i<alt.length;i++){
            if(alt[i]>highest){
                highest=alt[i];
            }
        }
        return highest;
    }
}