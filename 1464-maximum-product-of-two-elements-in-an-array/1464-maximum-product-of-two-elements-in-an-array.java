class Solution {
    public int maxProduct(int[] nums) {
        int x=0;
        int y=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]*nums[j]>max){
                    max=nums[i]*nums[j];
                    x=i;
                    y=j;
                }
            }
        }
        System.out.print(x);
        System.out.print(y);
        return ((nums[x]-1)*(nums[y]-1));
        
    }
}