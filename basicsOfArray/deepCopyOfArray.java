import java.util.Arrays;

public class deepCopyOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(arr[1]);
        int copy[]=Arrays.copyOf(arr,arr.length);
        copy[1]=55;
        System.out.println(copy[1]);
    }
}
