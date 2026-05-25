// package basicsOfArray;

import java.util.Arrays;
import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   System.out.println("enter the elements of array");
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    for (int i : arr) {
        System.out.println(i);
    }
        System.out.println(Arrays.toString(arr));
    }
}
