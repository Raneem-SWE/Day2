
import java.util.Scanner;//packege scanner
public class Day2 {
    public static void main(String[] arg){
//        //primative and non primitive
//      //primative
//        //it is data type تنوعها عشان مساحة الذاكرة في البرنامج ومايعلق
//      //non-primative
///*
//* String:length(),equals()المقارنه نص بنص اخر,
//*
//*  */
        String firstName="  Raneem";
        System.out.println(firstName.length());//length of firstname
        System.out.println("your name is:"+firstName+" and the length: "+firstName.length());
        System.out.println(firstName.equals("raneem"));//هل تساوي هذا الاسم؟
        System.out.println(firstName.toUpperCase());// cabetal later
        System.out.println(firstName.startsWith("R"));// start whith later R? true
        System.out.println(firstName.contains("Ra"));//contain this later? true
        System.out.println(firstName.charAt(2));// what is the char in 2 index
        System.out.println(firstName.toLowerCase());// small later
        System.out.println(firstName.trim());// it delete the space
        System.out.println(firstName.replace("R","k"));//change to new later
       //Scanner
       Scanner scan=new Scanner(System.in);
       System.out.println("inter your age");
        int num1= scan.nextInt();//if it number you shoud write nextInt
      System.out.println("inter your name");
      String name=scan.nextLine(); //if it String you must be nextLine

   //scaner with number
       Scanner scan2=new Scanner(System.in);
       System.out.println("inter your first num");
     int num_1= scan2.nextInt();
       System.out.println("inter your Sacond name");
        int num_2= scan2.nextInt();
       int sum=num_1+num_2;
       System.out.println(" the sum is :"+sum);
   //if ,else,if else with scanner
        System.out.println("Enter your name");
        String role=scan2.nextLine();
        if(role=="Raneem"){
            System.out.println("welcom Raneem");
        }else{
            System.out.println("توكل " );


        }
        System.out.println("inter your gread");
        int gread= scan2.nextInt();
        if(gread>=90&& gread<=100){
            System.out.println("A");
        } else if (gread>=80&& gread<=89) {
            System.out.println("B");
        } else if (gread>=70&& gread<=79) {
            System.out.println("C");
        }else if (gread>=60&& gread<=69){
            System.out.println("D");
        } else if (gread>100){
            System.out.println("please inter correct user");
   }else{
            System.out.println("fail");
      }
    //swith
        System.out.println("1 YOUR BALANCE");
        System.out.println("2 YOUR NAME");
        System.out.println("3 YOUR PASSWORD ");
        int number=scan2.nextInt();
        switch (number){
            case 1:
                System.out.println("YOUR BALANCE 1000");
                break;
            case 2:
                System.out.println("YOUR NAME IS RANEEM");
                break;
            case 3:
                System.out.println("YOUR PASSWORD 39u7429");
                break;
            default:
                System.out.println("THANX!!");


        }

    }}

