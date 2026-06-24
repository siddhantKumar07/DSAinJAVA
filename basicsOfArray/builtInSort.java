import java.util.Arrays;

public class builtInSort {
    // method to print the array
    static void print(int []arr){
      System.out.println(Arrays.toString(arr));
    }
public static void main(String[] args) {
    int arr[]={1,9,8,2,5,4,55,6,22,0,-1};
    print(arr);
    Arrays.sort(arr);
    print(arr);
}

}
