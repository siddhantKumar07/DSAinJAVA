import java.util.Arrays;

public class removeElem {
    static int[] removeElement(int arr[], int elem){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=elem){
                count++;
            }
        }
        int arr2[]= new int[count];
        int j=0;
        for (int i = 0; i < arr2.length; i++) {
            if(arr[i]!=elem){
                arr[j]=arr[i];
                j++;
            }
        }
        return arr2;
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,9,8,6,9,5,8,8,9};
        int elem=8;
        int arr2[]=removeElement(arr, elem);
        System.out.println(Arrays.toString(arr2));
    }
}
