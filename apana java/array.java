import java.util.*;
public class array {
    public static void main(String[]args){

       //int []marks= new int[3];
       //int marks[]= new int[3];
      // marks[0]=97;
       //marks[1]=98;
       //marks[2]=95;
     //  System.out.println(marks[0]);
     //  System.out.println(marks[1]);
     //  System.out.println(marks[2]);

       //for(int i=0;i<3;i++){
       // System.out.println(marks[i]);
       

       //take an array as input from the user .searchfor a given number x and print the index at which it occurs
       Scanner sc=new Scanner(System.in);
       int  size =sc.nextInt();
       int numbers[]=new int[size];
       //input
       for (int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
       }
        
        int x=sc.nextInt();  
         //output
         for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("x found at index:"+i);
            }
         }


       } 
    }
    

