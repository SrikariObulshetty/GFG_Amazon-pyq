class Solution {
    public int TotalPairs(int[] nums, int k) {
        if (k < 0) return 0; // k cannot be negative

        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Iterate over the unique keys in the map
        for (int num : map.keySet()) {
            if (k == 0) {
                // Special case: k = 0, count pairs where frequency > 1
                if (map.get(num) > 1) {
                    cnt++;
                }
            } else {
                // Check for the presence of num + k
                if (map.containsKey(num + k)) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
