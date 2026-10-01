import java.util.Arrays;

public class removeDublicate {

    static int[] removeDublicate(int []arr){
       int i=0,j=1;
       while(j<arr.length){
        if(arr[i]==arr[j]) j++;
        else{
            i++;
            arr[i]=arr[j];
            j++;
        }
       }
       return Arrays.copyOf(arr, i+1);
    }
    
    public static void main(String[] args) {
        int arr []= {1,2,2,3,4,4,5,7,8,9};
        int i = 0,j=1;
        while(j<arr.length){
            if(arr[i]==arr[j]) j++;
            else{
                i++;
                arr[i]=arr[j];
                j++;
            }
        }
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k]+" ");
        }
        // System.out.println(Arrays.toString(removeDublicate(arr)));
    }
}
