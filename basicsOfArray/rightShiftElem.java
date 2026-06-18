import java.util.Arrays;

public class rightShiftElem {
 static int[] shifting(int arr[]){
    int i =arr.length-1;
    // int n = arr.length-1;
    int temp=arr[i];
    while(i>=0){
        if(i==0){
            arr[0]=temp;
        }
        else{
            arr[i]=arr[i-1]; // this will swap the value 
        }
        i--;
    }
    return arr;


  }   
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    System.out.println(Arrays.toString(shifting(arr)));
  }
}
