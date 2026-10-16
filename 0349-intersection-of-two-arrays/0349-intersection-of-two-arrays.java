
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    boolean exists = false;

                    for (int x = 0; x < k; x++) {
                        if (temp[x] == nums1[i]) {
                            exists = true;
                            break;
                        }
                    }

                    if (!exists) {
                        temp[k] = nums1[i];
                        k++;
                    }

                    nums2[j] = -1;
                    break;
                }
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
