import java.util.*;

public class Solution7 {
    public static int power(int x, int n) {
        int result = 1;
        for(int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x, n));
        sc.close();
    }
}
