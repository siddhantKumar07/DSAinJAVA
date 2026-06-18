import java.util.Scanner;

public class CountNumberOfZeroAndOne {
    
    // method to find the occurence of the 0s and 1s 
    static void occurance(int arr[]){
        int zero=0,one=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                zero++;
            }
        else if(arr[i]==1){
            one++;
        }
        }
        System.out.println("the occurance of 0 in array : "+zero);
        System.out.println("the occurance of 1 in array : "+one);
    }
    public static void main(String[] args) {
        int arr[]= new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the values");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        occurance(arr);
    }
}
