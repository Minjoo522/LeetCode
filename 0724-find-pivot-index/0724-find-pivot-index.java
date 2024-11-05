class Solution {
    public int pivotIndex(int[] nums) {
        /*
        leftmost pivot index
        leftsum == rightsum -> index
        if no -> -1

        data structure : array
        prefix sum
        [1, 8, 11, 17, 22, 28]
        result = 3(17)
        leftsum = currentIdx
        rightsum = lastIdx - (currentIdx - 1)

        if : left == right ? left -> range sum :  arr[j] - arr[i - 1](right - left)
        if : 
        [2, 3, 2]

        [-1, -2, -3, -2, -1, 0]
        [-1, -2, -1, 0, 0, 0]
         */

         int[] prefixSum = new int[nums.length];
         prefixSum[0] = nums[0];
         
         for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
         }

         if (prefixSum[0] == prefixSum[prefixSum.length - 1]) {
            return 0;
         }

         for (int i = 1; i < prefixSum.length; i++) {
            if (prefixSum[i] == (prefixSum[prefixSum.length - 1] - prefixSum[i - 1])) {
                return i;
            }
         }

         return -1;
    }
}