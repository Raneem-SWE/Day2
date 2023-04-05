import java.util.Scanner;
public class Day3 {
    public static void main(String[]arg){
//loop]
        for(int i=0;i<=100;i++){
            System.out.println(i);
        }

        for(int i=100;i>=0;i--){
            System.out.println(i);
        }

        for(int i=0;i<=100;i=i+2){//even num

            System.out.println(i);
        }
        int sum=0;//print 0-10
        for(int i=0;i<=10;i++){//sum of num
           sum+=i;}
            System.out.println(sum);

    }
       int r=0;//print 0-10
       while(r<=10){
           System.out.println(r);
           r++;
       }
        Scanner scan=new Scanner(System.in);

        int num=0;
        while(num!=-1){
            System.out.println("inter your number");
            int num1=scan.nextInt();

        if(num1%2==0){
            System.out.println("even num");
        } else if (num1%2==1){
            System.out.println("odd num");
            
        }

    }
    //break
    for(int i=0;i<=100;i++){
        System.out.println(i);
        if(i==66){
            break;//or continue
    }



}}
