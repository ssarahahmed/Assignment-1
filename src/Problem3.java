import java.util.Scanner;

public class Problem3 {
    public static long[] NotFibonacci(int n){
        long[] sequence = new long[n];

        if (n >= 1) sequence[0] = 0;
        if (n >= 2) sequence[1] = 2;

        for (int i = 2; i < n; i++) {
            sequence[i] = (long) Math.floor(1.5 * sequence[i -1] + 2 * sequence[i - 2]);
        }
        return sequence;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        long[] sequence = NotFibonacci(n);

        System.out.println("NotFibonacci Sequence: ");
        for (int i = 0; i < sequence.length; i++){
            System.out.println(sequence[i]);
        }
        sc.close();
    }
}
