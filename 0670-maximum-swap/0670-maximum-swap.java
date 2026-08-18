class Solution {
    public int maximumSwap(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        int max = num;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                int value = Integer.parseInt(new String(arr));

                max = Math.max(max, value);

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return max;
    }
}