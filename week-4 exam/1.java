import java.util.*;

class Solution {
    public static int binaryGap(int N) {
        int[] A = new int[32];
        int t = 0;
        for (int i = 0; i < 32; ++i)
        {
            if (((N >> i) & 1) != 0)
            {
                A[t++] = i;
            }
        }
        int ans = 0;
        for (int i = 0; i < t - 1; ++i)
        {
            ans = Math.max(ans, A[i+1] - A[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int n=binaryGap(i);
        System.out.println(n);
        }
}