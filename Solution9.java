import java.util.*;

public class Solution9 {

    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " ");

        for(int i = 2; i <= n; i++) {
            System.out.print(b + " ");
            int temp = b;
            b = a + b;
            a = temp;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibonacci(n);
        sc.close();
    }
}
