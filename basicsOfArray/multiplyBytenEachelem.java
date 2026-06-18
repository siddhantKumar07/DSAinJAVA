import java.util.Arrays;
import java.util.Scanner;

public class multiplyBytenEachelem {

static int[] multi(int arr[]){
    int multiplied[]=new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        multiplied[i]=arr[i]*10;
    }
    return multiplied;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[]=new int[4];
    System.out.println("enter the element in array");
    for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
    }
    int returnedarray []=multi(arr);
    System.out.println(Arrays.toString(returnedarray));
}
}
