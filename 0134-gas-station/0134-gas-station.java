class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int total = 0;      // Total gas - total cost
        int tank = 0;       // Current petrol in the tank
        int start = 0;      // Possible starting station

        for (int i = 0; i < gas.length; i++) {

            int diff = gas[i] - cost[i];

            total += diff;
            tank += diff;

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        if (total >= 0)
            return start;

        return -1;
    }
}