class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int prev = -101;
        
        for (int i = 0; i < nums.length; i++) {
            if (prev != nums[i]) {
                nums[k++] = nums[i];
            }
            prev = nums[i];
        }

        return k;
    }
}