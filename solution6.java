import java.util.*;
public class solution6 {
   public static void main(String[] args) {
    int positive=0,negative=0,zero=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("press 1 to continue & 0 to stop");
    int input=sc.nextInt();
    while(input==1){
        int number=sc.nextInt();
        if(number>0)
            positive++;
        else if(number<0)
            negative++;
        else
            zero++;
        input=sc.nextInt();
        }
        System.out.println("positive :" +positive);
        System.out.println("negative:"+negative);
        System.out.println("zero:"+zero);
        sc.close();
    }
   } 

