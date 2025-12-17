import java.util.*;

public class Solution8 {
    public static int gcd(int a, int b) {
        while(a != b) {
            if(a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("GCD is : " + gcd(n1, n2));
        sc.close();
    }
}
