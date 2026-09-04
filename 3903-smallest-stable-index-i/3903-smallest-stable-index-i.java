class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ans=0;
        //int minans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int max=0;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<=i;j++){
                max=Math.max(max,nums[j]);
            }
            int in=0;
            for(int M=i;M<nums.length;M++){
                if(nums[M]<min){
                    min=nums[M];
                    in=M;
                }
            }
            ans=max-min;
            if(ans<=k){
                return i;
            }
        }
        return -1;
        
    }
}