class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int aliceTotal = 0;

        for (int x : aliceSizes) {
            aliceTotal += x;
        }

        int bobTotal = 0;

        for (int x : bobSizes) {
            bobTotal += x;
        }

        int diff = (aliceTotal - bobTotal) / 2;

        Set<Integer> bobSet = new HashSet<>();

        for (int x : bobSizes) {
            bobSet.add(x);
        }

        for (int x : aliceSizes) {
            int y = x - diff;

            if (bobSet.contains(y)) {
                return new int[]{x, y};
            }
        }

        return new int[]{};
    }
}