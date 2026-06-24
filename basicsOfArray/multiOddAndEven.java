import java.util.Arrays;

public class multiOddAndEven {
  static void multiply(int []arr){
    
    for (int i = 0; i < arr.length; i++) {
        if(i%2==0){
        arr[i]*=10;
        }else {
            arr[i]*=2;
        }
    }
  }  

  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    multiply(arr);
    System.out.println(Arrays.toString(arr));
  }
}
