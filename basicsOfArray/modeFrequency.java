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


        // second method using hashmap

        int arr []={1,2,2,2,2,4,4,4,4,4,4,7,7,7,75,5,6,5,3,45,8,7,2,5,1,1,1,1,1,1,2,2,2,2,2,4,4,4};
        int mode = arr[0];
        int maxFrequency = 0;
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int elem : arr) {
            frequency.put(elem, frequency.getOrDefault(elem, 0) + 1);
        }

        for (int key : frequency.keySet()) {
            System.out.println(key + "--->" + frequency.get(key));

            if (frequency.get(key) > maxFrequency) {
                maxFrequency = frequency.get(key);
                mode = key;
            }
        }

        System.out.println("Mode: " + mode);
        System.out.println("Highest frequency: " + maxFrequency);
    }
}
