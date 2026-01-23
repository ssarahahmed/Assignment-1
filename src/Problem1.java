import java.util.Scanner;

public class Problem1 {

    public static int commonSubsequence( String s1, String s2, int m, int n) {
        if (m==0 || n==0){
            return 0;
        }

        if (s1.charAt(m-1) == s2.charAt(n-1)) {
            return 1 + commonSubsequence(s1, s2, m-1, n-1);
        } else{
            int lcs1 = commonSubsequence(s1, s2, m-1, n);
            int lcs2 = commonSubsequence(s1, s2, m, n-1);

            if(lcs1 > lcs2){
                return lcs1;
            } else {
                return lcs2;
            }
        }
    }

}