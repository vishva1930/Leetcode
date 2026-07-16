class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        if(n<5){
            return 0;
        }
        while(n>1){
            n=n/5;
            c=c+n; 
        }
        return c;
        
    }
}