import java.util.Scanner;
public class Problem4 {
        public static long[] NotFibonacci(int n) {
            long[] sequence = new long[n];

            if (n >= 1) sequence[0] = 0;
            if (n >= 2) sequence[1] = 2;

            for (int i = 2; i < n; i++) {
                sequence[i] = (long) Math.floor(1.5 * sequence[i - 1] + 2 * sequence[i - 2]);
            }
            return sequence;
        }

    public static int binarySearch(long[] sequence, long target) {
        int low = 0;
        int high = sequence.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (sequence[mid] == target) {
                return mid;
            } else if (sequence[mid] < target) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        long input = sc.nextLong();

        int n = 50;
        long[] sequence = NotFibonacci(n);
        int position = binarySearch(sequence, input);
        System.out.println("Position in NotFibonacci Sequence: " + position);
        sc.close();
    }
}
