class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
                nums[idx++] = nums[i];
            }
        }

        return k;
    }
}