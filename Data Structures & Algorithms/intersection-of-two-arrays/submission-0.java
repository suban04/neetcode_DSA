class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        // Add nums1 elements to set
        for (int num : nums1) {
            set.add(num);
        }

        HashSet<Integer> result = new HashSet<>();

        // Check which nums2 elements are present in nums1
        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        // Convert result HashSet to int[]
        int[] ans = new int[result.size()];
        int index = 0;

        for (int num : result) {
            ans[index] = num;
            index++;
        }

        return ans;
    }
}