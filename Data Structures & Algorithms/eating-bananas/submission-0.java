class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        // Find the maximum pile
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        // Binary Search
        while (left < right) {
           int mid = left + (right - left) / 2;
            long hours = 0;
            // Calculate total hours needed at speed = mid
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid; // Ceiling Division
            }
            if (hours <= h) {
                right = mid; // Try smaller speed
            } else {
                left = mid + 1; // Increase speed
            }
        }
        return left;
    }
}