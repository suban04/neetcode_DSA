class Solution {
    public int maxProductDifference(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        int maxpoduct= (nums[n-1]*nums[n-2]);
        int minproduct =(nums[0]*nums[1]);

        return maxpoduct-minproduct;
    }
}