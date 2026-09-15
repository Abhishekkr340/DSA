
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i : nums1) {
            list1.add(i);
        }

        for (int j : nums2) {
            if (list1.contains(j)) {
                list2.add(j);
                list1.remove(Integer.valueOf(j));
            }
        }

        int[] ans = new int[list2.size()];

        int k = 0;
        for (int i : list2) {
            ans[k] = i;
            k++;
        }

        return ans;
    }
}

