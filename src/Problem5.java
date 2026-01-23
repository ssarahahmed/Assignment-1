import java.util.Scanner;

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        double[] nums = new double[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextDouble();
        }

        System.out.print("Enter the limit value: ");
        double val = sc.nextDouble();

        System.out.print("Original array: ");
        for (double num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int k = removeElement(nums, val);

        System.out.println("Number of elements >= " + val + ": " + k);
        System.out.print("Modified array (first " + k + " elements): ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}