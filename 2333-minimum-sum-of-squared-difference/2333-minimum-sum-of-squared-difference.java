import java.util.Collections;
import java.util.TreeMap;

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long totalK = (long) k1 + k2;
        long sumDiffs = 0;
        
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            if (diff > 0) {
                sumDiffs += diff;
                map.put(diff, map.getOrDefault(diff, 0) + 1);
            }
        }
        
        if (sumDiffs <= totalK) {
            return 0;
        }
        
        while (totalK > 0 && !map.isEmpty()) {
            int highestDiff = map.firstKey();
            int count = map.get(highestDiff);
            map.remove(highestDiff);
            
            int nextHighestDiff = map.isEmpty() ? 0 : map.firstKey();
            long diffStep = (long) highestDiff - nextHighestDiff;
            long operationsNeeded = diffStep * count;
            
            if (totalK >= operationsNeeded) {
                totalK -= operationsNeeded;
                if (nextHighestDiff > 0) {
                    map.put(nextHighestDiff, map.get(nextHighestDiff) + count);
                }
            } else {
                long quotient = totalK / count;
                int remainder = (int) (totalK % count);
                int newDiff = highestDiff - (int) quotient;
                
                if (newDiff > 0) {
                    map.put(newDiff, map.getOrDefault(newDiff, 0) + (count - remainder));
                }
                if (newDiff - 1 > 0 && remainder > 0) {
                    map.put(newDiff - 1, map.getOrDefault(newDiff - 1, 0) + remainder);
                }
                totalK = 0;
            }
        }
        
        long ans = 0;
        for (var entry : map.entrySet()) {
            long diff = entry.getKey();
            long count = entry.getValue();
            ans += diff * diff * count;
        }
        
        return ans;
    }
}
