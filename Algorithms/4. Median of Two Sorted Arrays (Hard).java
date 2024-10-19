class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] tab = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            tab[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            tab[nums1.length + i] = nums2[i];
        }
        Arrays.sort(tab);
        int mid = tab.length % 2;
        double result = 0;
        if (mid != 0) 
            result = tab[tab.length / 2];
        else
            result = (double) (tab[tab.length / 2] + tab[tab.length / 2 - 1]) / 2;
        return result;

            
    }
}
