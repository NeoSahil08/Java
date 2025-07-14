import java.util.*;
public class strings {
    public static void main(String[] args) {
        //concatenation
        //String firstname="tony";
        // String lastname="shark";
        // String fullname=firstname+"@"+lastname;
        // System.out.println(fullname);
         //for length
         //System.out.println(fullname.length());
          
         //charAt
        // for(int i=0;i<fullname.length();i++){
         //   System.out.println(fullname.charAt(i));
         

         //compare
         String name1="tony";
         String name2="tony";

         //1 s1>s2 =+tive
         //2 s1<s2=-tive
         //3 s1=s3= 0

         if (name1.compareTo(name2)==0){
            System.out.println("string are equal");
         }
         else{
            System.out.println("not equal");
         }

//substring
String sentence="tony strka";
String name=sentence.substring(4,5);
System.out.println(name);

        
    }
    
}
