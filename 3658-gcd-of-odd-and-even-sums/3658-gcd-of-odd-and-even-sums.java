class Solution {
    public int gcdOfOddEvenSums(int n) {
        int e=0;
        int o=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                e=e+i;
            }
            else if(i%2!=0){
                o=o+i;
            }
        }
        while (e != 0) {
            int temp = e;
            e = o % e;
            o = temp;
        }
        return o;
    }
}