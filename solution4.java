import java.util.*;

public class solution4 {
    public static int iseligible(int age){
        // return age>18;
        if(age<18){
            System.out.println("not eligible to vote.");
        }else{
            System.out.println("eligible to vote.");
        }
        return age;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        iseligible(age);
    sc.close();
}
}
