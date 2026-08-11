// class Solution {
//     public int missingInteger(int[] nums) {
//         if(nums.length==1){
//             return nums[0]+1;
//         }
//         int max=0;
//         int s=0;
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]+1==nums[i+1]){
//                 if(s==0){
//                     s=s+nums[i]+nums[i+1];
//                 }else{
//                 s=s+nums[i+1];
//                 }
//             }
//             else{
//                 max=Math.max(s,max);
//                 s=0;
//             }
//         }
//         if(max==0){
//             max=s;
//         }
//         int max1=0;   
//         int m=max;
//         while(m>0){
//             int c=0;
//             for(int i=0;i<nums.length;i++){
//                 if(nums[i]==m){
//                     c++;
//                 }
//             }
//             if(c==0){
//                 max1= m;
//                 break;
//             }
//             m++;
//         }
//         System.out.print(max1);
//         int maxx=0;
//         // if(s==0){
//             for(int i=0;i<nums.length;i++){
//                 maxx=Math.max(maxx,nums[i]);
//             }
//        // }
//         System.out.print(maxx+1);
//         return Math.max((maxx+1), max1);


     
       

        
//     }
// }

class Solution {
    public int missingInteger(int[] nums) {

        int sum = nums[0];

        // Find sequential prefix sum
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        // Check if sum already exists
        while (true) {
            boolean found = false;

            for (int num : nums) {
                if (num == sum) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return sum;
            }

            sum++;
        }
    }
}