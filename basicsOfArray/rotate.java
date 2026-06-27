import java.util.Arrays;
import java.util.Scanner;

public class rotate {
    static int[] reverse(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to rotate?");
        int rotateNum = sc.nextInt();
        
        // Handle cases where rotateNum is larger than array length
        rotateNum = rotateNum % arr.length; 

        int temp[] = new int[rotateNum];
        int lastArrayLength = arr.length - rotateNum;
        int rest[] = new int[lastArrayLength];
        
        System.out.println("Original: " + Arrays.toString(arr));

        
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        

        for (int i = 0; i < rest.length; i++) {
            rest[i] = arr[i + rotateNum];
        }
        
        reverse(temp);
        reverse(rest);
        
        for (int i = 0; i < arr.length; i++) {
            if (i < rotateNum) {
                arr[i] = temp[i];
            } else {
                arr[i] = rest[i - rotateNum];
            }
        }
        
        reverse(arr);
        System.out.println("Rotated:  " + Arrays.toString(arr));
        sc.close();
    }
}