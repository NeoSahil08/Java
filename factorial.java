import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
         int factorial=1;
        for(int i=n ;i>=1;i--){
            factorial=factorial*i;


        }
        System.out.println(factorial);
    }
    
}
