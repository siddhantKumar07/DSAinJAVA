import java.util.ArrayList;
import java.util.List;

public class missingElemFromDublicate {
    static List<Integer> missingElem(int arr[]){
       List<Integer> list = new ArrayList<>();
       // marking the value to -
       for (int i = 0; i < arr.length; i++) {
        int value = Math.abs(arr[i]);
        int position = value-1;
        if(arr[position]>0){
        arr[position]=-arr[position];
        }
       }

       for (int i = 0; i < arr.length; i++) {
        if(arr[i]>0){
            list.add(i+1);
        }
       }
       return list;
    }
    
    public static void main(String[] args) {
        int arr[]={1,3,3,4,5};
        System.out.println("missing elem = "+missingElem(arr));
        
    }
}
