import java.util.Arrays;

public class  reverseArray{

     // reverse array method
    static int[] reverse(int[] arr){
        int n= arr.length;
        int i=0;
        int j =n-1;

        // loop logic
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
     }

     public static void main(String[] args) {
        int arr[]={1,2,3,7,4};
        System.out.println(Arrays.toString(reverse(arr)));
     }
}