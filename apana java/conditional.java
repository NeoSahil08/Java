import java.util.*;
public class conditional{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int age=sc.nextInt();
        //if(age>18){
            //System.out.println("adult");
      //  }
       // else{
         //   System.out.println("not");
        //}
        //int a=sc.nextInt();
        //int b=sc.nextInt();
        //if(a==b){
          //  System.out.println("equal");
        //}
        //else if(a>b){
          //  System.out.println("gretere");

        
        //}
        //else{
        //    System.out.println("less");
        //}
        int button=sc.nextInt();
        switch(button){
            case 1:System.out.println("hellow");
            break;
            case 2 : System.out.println("nameste");
            break;
            case 3:System.out.println("bonjour");
            break;
            default:System.out.println("invalid");
        }
    }
}