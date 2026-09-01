class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        int in=0;
        for(int i=0;i<nums1.length;i++){
            arr[in++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            arr[in++]=nums2[i];
        }
        Arrays.sort(arr);
       if(arr.length%2!=0){
        return arr[arr.length/2];
       }
        double m = (double)(arr[arr.length/2] + arr[(arr.length/2)-1]) / 2;
        return m;
        
    }
}