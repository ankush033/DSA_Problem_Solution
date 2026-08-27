class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        
        int m=nums1.length;
        int n=nums2.length;
        int temp[]=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                temp[k]=nums1[i];
                i++;
                
            }else{
                temp[k]=nums2[j];
                j++;
               
            }
            k++;
        }
        while(i<m){
            temp[k++]=nums1[i++];
          
            
        }
        while(j<n){
            temp[k++]=nums2[j++];
            
     
        }
       
       int len=temp.length;
     
          if(len%2!=0){
           
            return (double)temp[len/2];
          }else{
            return (double)(temp[(len/2)-1]+temp[len/2])/2.0;
          }
        
    }
}