import java.util.Arrays;
import java.util.Scanner;

public class rotateOptimized {
    static void reverse(int arr[], int i, int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
public static void main(String[] args) {
    
    int arr[]={1,2,3,4,5,6,7,8,9};
    int n = arr.length;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter how many digit you wanna to return");
    int rotateDigit = sc.nextInt();
    rotateDigit%=n;
    System.out.println("before :"+Arrays.toString(arr));
    reverse(arr, 0, rotateDigit-1);
    reverse(arr, rotateDigit, n-1);
    System.out.println(Arrays.toString(arr));
    reverse(arr, 0, n-1);

    System.out.println("after :"+Arrays.toString(arr));
}}
