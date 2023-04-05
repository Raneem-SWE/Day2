import java.sql.SQLOutput;
import java.util.Scanner;
public class HW_Day2 {
    public static void main(String[]arg){
    //Ex1
        Scanner s=new Scanner(System.in);
        System.out.println("inter your number");
//        int num=s.nextInt();
//        if(num<0){//negative
//            System.out.println("Negative number");
//        }else if(num>0){
//            System.out.println("Positive number");
//        }else if(num==0){
//            System.out.println("Zero number");
//        }
//
//    //Ex2
//        System.out.println("inter your Name");
//        String Name=s.nextLine();
//        System.out.println("inter your num ");
//        int n=s.nextInt();
//        System.out.println(Name.charAt(n));
    //Ex3
        System.out.println("inter your Name");
        String yourName=s.nextLine();
        System.out.println("inter your num ");
        String str=s.nextLine();
        System.out.println(yourName.contains(str));

    }
}
