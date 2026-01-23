public class Problem5 {
    public static int removeElement(double[] nums, double val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}