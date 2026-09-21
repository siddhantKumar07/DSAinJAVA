import java.util.Arrays;

public class occurance {
    static void occur(int[] arr){
        int arr2[]=new int[20];
        for (int i = 0; i < arr.length; i++) {
           arr2[arr[i]]=arr2[arr[i]]+1;
        }
      for (int i = 0; i < arr2.length; i++) {
        if(arr2[i]>0)
        System.out.println("Element "+i+" occurs "+arr2[i]+" times");
      }
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,3,3,3,3,3,3,4,5,4,6};
        occur(arr);
    }
}
