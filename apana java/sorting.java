import java.util.*;
public class sorting {
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++ ){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        //bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;i++)
            {
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);


    }
}
