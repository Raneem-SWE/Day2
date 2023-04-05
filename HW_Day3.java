public class HW_Day3 {
    public static void main(String[]arg){
    //Ex1
        for(int i=1;i<=100;i++){//even num
            if(i%2==0){
                System.out.println("even number:"+i);
            }
        }

    //Ex2
        for(int i=1;i<=100;i++){//odd num
            if(i%2==1){
                System.out.println("odd number:"+i);
                continue;
            }
        }

    //Ex3
       for(int i=0;i<=10;i++){
           System.out.println(i);
         if(i==4) {
             break;
         }
       }
//   //Ex4
  String Name="Raneem";
      for(int i=0;i< Name.length();i++){
          System.out.println(Name.charAt(i));
      }
   //Ex5
        String Nam="Raneem";
        for(int i=Nam.length()-1;i>=0;i--){
            System.out.println(Nam.charAt(i));
    }}}

