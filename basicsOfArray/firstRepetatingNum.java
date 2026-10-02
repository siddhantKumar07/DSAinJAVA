import java.util.HashMap;

public class firstRepetatingNum {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5,7,6,7,8,8,9};
        // for (int i = 0; i < arr.length-1; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[i]==arr[j]){
        //             System.out.println(arr[i]);
        //             break;
        //         }
        //     }
        // }
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        for (int i : freq.keySet()) {
            if(freq.get(i)>1){
                System.out.println(i+" is the first repeting num");break;
            }
        }
    }
}
