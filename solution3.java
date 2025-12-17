import java.util.Scanner;

public class solution3 {
    public static double getcircumference(double radius){
        return 2*3.14*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=(int) sc.nextDouble();
        System.out.println(getcircumference(r));
    sc.close();
}
}
