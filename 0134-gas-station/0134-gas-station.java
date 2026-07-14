class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int g=0;
        int c=0;
        for(int i=0;i<gas.length;i++){
            g=g+gas[i];
            c=c+cost[i];
        }
        if(c>g){
            return -1;
        }
        int tank = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            tank += diff;
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        if(tank >= 0){
            return start;
        }
        return -1;
    }
}