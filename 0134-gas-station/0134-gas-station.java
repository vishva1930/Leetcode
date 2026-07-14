class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // int c=0;
        // int g=0;

        int tank = 0;
        int start = 0;
        int remgas=0;

        for (int i = 0; i < gas.length; i++) {
            //  g=g+gas[i];
            //  c=c+cost[i];

            int diff = gas[i]-cost[i];
            tank=tank+diff;
            remgas=remgas+diff;
            if (tank<0) {
                start =i+1;
                tank = 0;
            }
        }
        if(tank>=0 && remgas>=0){
            return start;
        }
        return -1;
    }
}