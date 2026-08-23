import java.util.Arrays;

public class removeElem {
    static int[] removeElement(int arr[], int elem){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=elem){
                count++;
            }
        }
        System.out.println(count);
        int arr2[]= new int[count];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=elem){
                arr2[j]=arr[i];
                j++;
            }
        }
        return arr2;
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5};
        int elem=4;
        int arr2[]=removeElement(arr, elem);
        System.out.println(Arrays.toString(arr2));
    }
}
