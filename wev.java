import java.util.HashSet;
import java.util.Arrays;

//import java.util.Array;
class wev {
    public Integer[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            set2.add(i);
        }

        set1.retainAll(set2);
        return set1.toArray(new Integer[set1.size()]);
    }
}