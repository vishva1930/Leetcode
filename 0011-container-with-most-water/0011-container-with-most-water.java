class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int s=0;
        int e=n-1;
        int b=n;
       
        int max=0;
        int a=0;
       
        while(s<e){
          b=b-1;
           int h=Math.min(height[s],height[e]);
            a=h*b;
            if(a>max){
                max=a;
            }
            if(height[e]<height[s]){
                e--;
            }
            else{
                s++;
            }
        }
    
        return max;
        
    }
}

