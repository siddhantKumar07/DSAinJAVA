import java.util.HashMap;

public class modeFrequency {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5};
        // int maxCount = 0;
        // int mode = arr[0];
        // for (int i = 0; i < arr.length; i++) {
        //     int count = 0;
        //     for (int j = 0; j < arr.length; j++) {
        //         if (arr[i] == arr[j]) {
        //             count++;
        //         }
        //     }
        //     if (count > maxCount) {
        //         maxCount = count;
        //         mode = arr[i];
        //     }
        // }
        // System.out.println("Mode: " + mode);
        // System.out.println("Frequency: " + maxCount);


        // second method
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 20, 7, 7, 8};
        HashMap <Integer, Integer> freq = new HashMap<>();
        for (int elem : arr) {
            freq.put(elem,freq.getOrDefault(elem, 0)+1);
        }
        int mode=freq.get(arr[0]);
        for (int i : freq.keySet()) {
                System.out.println("Element: " + i + ", Frequency: " + freq.get(i));
                if(freq.get(i)>mode){
                    mode = i;
                }
        }
        System.out.println("Mode: " + mode);
    }
}
